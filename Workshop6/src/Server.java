
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Server extends TaxCalculate{
    public Server(){}
    public static void main(String[] args) {
        while(true){
        try {
            TaxCalculate obj = new TaxCalculate();
            
            Calculate stub = (Calculate) UnicastRemoteObject.exportObject(obj, 0);
            
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Calculate", stub);
        } catch (Exception e){}
        
        }
    }
}
