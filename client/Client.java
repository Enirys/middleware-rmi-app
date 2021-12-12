package client;

import serveur.NoteImpl;
import serveur.NoteInterface;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.*;

public class Client {

    public static void main(String[] args) {
        /*
        if(System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }*/

        try {
            System.out.println("Hello");
            Remote remote = Naming.lookup("rmi://127.0.0.1/noteRMI");
            if(remote instanceof NoteInterface) {
                Double note = ((NoteInterface) remote).getNote(1,"azerty");
                System.out.println(note);
            }
        } catch (RemoteException | MalformedURLException | NotBoundException e) {
            e.printStackTrace();
        }
    }
}
