package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class NoteImpl extends UnicastRemoteObject implements  NoteInterface{
    protected NoteImpl() throws RemoteException {
        super();
    }

    @Override
    public Double getNote(int etudiantCin, String codeMatiere) {
        Double note = 10.0 + (Math.random() * (10));
        System.out.println("note");
        return note;
    }
}
