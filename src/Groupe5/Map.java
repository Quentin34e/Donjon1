package Groupe5;

import java.util.Random;
import java.util.Scanner;

public class Map {
	private int nblignes;
	private int nbcolonnes;
	private int x;
	private int y;
	public boolean trouve;
	private String [][] map;
	private int a;
	private int b;
	private String c;
	
	public Map(int nblignes,int nbcolonnes){
		setnbcolonnes(nbcolonnes);
		setnblignes(nblignes);
		map=new String [nblignes][nbcolonnes];
		
		for(int i=0;i<nblignes;i++) {
			for(int j=0;j<nbcolonnes;j++) {
				map[i][j]="â—™";
			}
		}
	
	
	
	
	}
	Random aleatoire=new Random();
	public int getnblignes() {return nblignes;}
	public void setnblignes(int nblignes) {this.nblignes=nblignes;}
	
	public int getnbcolonnes() {return nbcolonnes;}
	public void setnbcolonnes(int nbcolonnes) {this.nbcolonnes=nbcolonnes;}
	
	public int getx() {return x;}
	public void setx(int x) {this.x=x;}
	
	public int gety() {return y;}
	public void sety(int y) {this.y=y;}
	
	public boolean gettrouve() {return trouve;}
	public void settrouve(boolean trouve) {this.trouve=trouve;}
	

	public int geta() {return a;}
	public void seta(int a) {this.a=a;}
	

	public int getb() {return b;}
	public void setb(int b) {this.b=b;}
	
	public String getc() {return c;}
	public void setc(String c) {this.c=c;}
	
	
	public void VueGraphique() {
		System.out.println();
		for(int i=0;i<nblignes;i++) {
			for(int j=0;j<nbcolonnes;j++) {
				System.out.print(" | "+map[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}
	public void spawn(String c) {
		Aleatoire();
		map[x][y]=c;
	}
	public void spawnenemy() {
		Aleatoire();
		map[aleatoire.nextInt(9)][aleatoire.nextInt(9)]="E";
	}
	
	public void seDeplacer() {
		System.out.println("z= â†‘ / q= â†�  /s= â†“ / d= â†’");
		Scanner move=new Scanner(System.in);
		String bouger;
		System.out.print("Veuiller saisir la direction? ");
		bouger=move.next();
		if(bouger.toLowerCase().contentEquals("z")) {if(getx()==0) {System.err.println("Vous ne pouvez pas aller plus haut!");} 
		else {map[x][y]=" ";map[x-1][y]=getc();setx(x-1);}
			}
		else if(bouger.toLowerCase().contentEquals("q")) {if(gety()==0) {System.err.println("Vous ne pouvez pas aller plus loin vers la gauche!");}
			else{map[x][y]=" ";map[x][y-1]=getc();sety(y-1);}
		}
		else if(bouger.toLowerCase().contentEquals("s")) {if(getx()==9) {System.err.println("Vous ne pouvez pas aller plus bas!");}
			else{map[x][y]=" ";map[x+1][y]=getc();setx(x+1);}
		}
		else if(bouger.toLowerCase().contentEquals("d")) {if(gety()==9) {System.err.println("Vous ne pouvez pas aller plus loin vers la droite!");}
			else{map[x][y]=" ";map[x][y+1]=getc();sety(y+1);}
		}
		else {System.err.println("Vous n'avez pas saisie une direction valide ! Juste z,q,s ou d");}
		VueGraphique();	
		
	}
	public void  Aleatoire() {
		x=aleatoire.nextInt(9);
		y=aleatoire.nextInt(9);
	
	}
	public boolean isTrouve() {
		trouve=false;
		if(map[x][y]==map[a][b]) {return trouve=true;}
		else{return trouve;}
	}
}