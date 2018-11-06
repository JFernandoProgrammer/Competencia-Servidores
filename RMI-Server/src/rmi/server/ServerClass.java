/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.server;

/**
 *
 * @author samsung
 */
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
        
public class ServerClass implements RemoteInterface {
        
    public String welcomeMessage(){
		return "..:: Bienvenido al Servidor ::...";
	}
	public String service(Integer a){
		if (a<12){
			return "Es de Mañana";
		}else if(a>18){
			return "Es de Noche";
		}else{
			return "Es la Tarde";
		}
	}
	public String goodByeMessage(){
		return "Se esta desconectando, Gracias por Utilizar nuestros Servicios, Vuelva Pronto";
	}
	
	public String sayHello() {
        return "Hello, world!";
    }
        
    public static void main(String args[]) {
        
        try {
            ServerClass obj = new ServerClass();
	    System.setProperty("java.rmi.server.hostname","192.168.1.20");
            RemoteInterface stub = (RemoteInterface) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();
            registry.bind("RemoteInterface", stub);

            System.err.println("Server ready... expecting connections");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
