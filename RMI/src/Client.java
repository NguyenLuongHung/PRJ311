
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Client {
    public static void main(String[] args) {
        try {
        Registry registry = LocateRegistry.getRegistry();
        Calculate stub = (Calculate) registry.lookup("Helllo");
        double x = 21000;
        x = stub.calculate(x);
        String y = ""+x;
       System.out.println(x);
        
        } catch (Exception e){
            System.err.println("Error: "+e.toString());
            e.printStackTrace();
        }
    }
}
