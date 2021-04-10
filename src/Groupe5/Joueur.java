package Groupe5;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
	
public class Joueur {
	public class Client {
		static final String serverName = "localhost";
	    static final int serverPort = 9999;
	    
	    System.out.println("Client a cree les flux");
	 
	    int[] tableauAEmettre = {1, 2, 3};
	 
	    out.writeObject(tableauAEmettre);
	    out.flush();
	 
	    System.out.println("Client: donnees emises");
	 
	    Object objetRecu = in.readObject();
	    int[] tableauRecu = (int[]) objetRecu;
	    System.out.println("Client recoit: " + Arrays.toString(tableauRecu));
	 
	    in.close();
	    out.close();
	    socket.close();
	    }
}