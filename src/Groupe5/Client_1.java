package Groupe5;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client_1 {
	
	private static BufferedReader in;
	private static PrintStream out;
	
	public static void main(String args[]) throws UnknownHostException, IOException{
		
		//creation du socket - recherche de connexion avec le serveur
		Socket socket= new Socket ("127.0.0.1", 6112);
		
		System.out.println("Bienvenue");
		
		in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
		// pour recevoir des info
		out = new PrintStream(socket.getOutputStream());
		// envoyer des info au serveur
		Scanner scanner = new Scanner (System.in);
		
		//lecture du message initial du serveur
		System.out.println(in.readLine());
		
		//5 requetes
		for(int i=0;i<5;i++){
			out.println(scanner.nextLine());
			System.out.println(in.readLine());
		}
		
		scanner.close();
		socket.close();
	}
}