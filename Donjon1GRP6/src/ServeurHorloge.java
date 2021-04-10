
import java.io.*;
import java.net.*;

public class ServeurHorloge extends Thread{
	

	private Socket socket;
	private PrintStream out;
	private BufferedReader in;
	
	public ServeurHorloge(Socket s){
		this.socket = s;
	}
	
	
	public void run(){
		try {
				in = new BufferedReader(
			          new InputStreamReader(socket.getInputStream())
			          );
				
				out = new PrintStream(socket.getOutputStream());
				
				//envoi du premier message
				out.println("SERVEUR : en attente de requ�te");
				
				
				//5 requ�tes
			for(int req=0;req<5;req++){
				
			
				String message = in.readLine();
			
				if (message.equals("heure")){
					
					out.println(System.nanoTime());//+" "+req);
			
				}
				else
				{  
					
					out.println("bug");//+req);
				}
			}
			socket.close();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
