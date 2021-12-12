package serveur;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NoteInterface extends Remote {

    public Double getNote(int etudiantCin, String codeMatiere) throws RemoteException;
}
