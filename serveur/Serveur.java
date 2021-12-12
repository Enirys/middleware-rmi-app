package serveur;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Serveur {

    public static void main(String[] args) {

        NoteImpl noteImpl = null;
        String url = null;

        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("registry");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        /*
        if(System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }*/

        try {
            noteImpl = new NoteImpl();
            url = "rmi://127.0.0.1/noteRMI";
            //Remote remote = UnicastRemoteObject.exportObject(noteImpl, 1099);
            System.out.println("serveur");
            Naming.rebind(url, noteImpl);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
