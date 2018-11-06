/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.cliente;

/**
 *
 * @author samsung
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String welcomeMessage() throws RemoteException;
	String service(Integer a) throws RemoteException;
	String goodByeMessage() throws RemoteException;
}
