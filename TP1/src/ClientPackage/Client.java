package ClientPackage;

	import java.io.*;
	import java.net.Socket;
	import java.util.Scanner;

	public class Client {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
					try {
					//création de socket
					Socket o =new Socket("localhost",123);
					System.out.println("je suis un client pas encore connecte");
					//création de InputStream pour lire les données depuis o
					InputStream in=o.getInputStream();
					//création de OutputStream pour ecrire les données vers o
					OutputStream out =o.getOutputStream();
					System.out.println("je suis un client connecte");
					//fermeture de socket
					o.close();
					}catch(IOException e)
					{e.printStackTrace();}

				}

			}


