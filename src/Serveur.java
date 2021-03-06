import java.io.IOException;
import java.net.*;

public class Serveur {

	private static int PORT = 6112;
	
	public Serveur(){
		
	}
	
	public static void main(String[] args) {
		// Premier message
		System.out.println("Serveur d�marr�");
		ServerSocket s = null;
		try {
			
			//Creation socket serveur
			s = new ServerSocket(PORT);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		int clientNo=0;
		while(true){
			try {
				//en attente d'une connexion avec un client:  
				Socket client = s.accept();
				clientNo++;
				
				//cr�ation du nouveau thread en passant le socket comme parametre
				ServeurHorloge horloge = new ServeurHorloge(client);
				//d�marrage 
				horloge.start();
				System.out.println("client "+clientNo+" servi");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
