
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;



public class Server extends Thread{
    private ServerSocket server; 
    
    public Server() throws IOException {
        server = new ServerSocket(4321);
        server.setSoTimeout(100000);
        
    }
    
    double calculate(double x){
        if(x <= 5000){
            return 0;
        }
        else if (x <= 10000){
            return (x-5000)*0.1;
        }
        else if (x <= 20000){
            return (10000-5000)*0.1+(x-10000)*0.15;
        }
        else 
            return (x - 20000)*0.2+(20000-10000)*0.15+(10000-5000)*0.1;
    }
    public void run(){
        while(true){
            try {
                Socket service = server.accept();
                DataInputStream in = new DataInputStream(service.getInputStream());
                String x = in.readUTF();
                Double y = Double.parseDouble(x);
                y = calculate(y);
                if (y == 0)
                x = null;
                else
                    x = ""+y;
                
                DataOutputStream out = new DataOutputStream(service.getOutputStream());
                if (x!=null)
                out.writeUTF(x);
                else
                    out.writeUTF("NO TAX!");
                
            } catch (SocketTimeoutException s) {
                System.out.println("Socket Timeout!");
            } catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
    
    
    
    public static void main(String[] args) {
    
   try {
       Thread t = new Server();
       t.start();
   } catch (IOException e){
    
   }
    }
}
