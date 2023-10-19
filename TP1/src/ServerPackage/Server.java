package ServerPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
	try {
		//création de ServerSocket
		ServerSocket ss =new ServerSocket(123);
		System.out.println("je suis un serveur en attente de la connexion");
		//création de nouveau socket et accepter une connexion pour communiquer avec le client
		Socket s=ss.accept();
		System.out.println("un client est connecté");
		//création de InputStream pour lire les données depuis ss
		InputStream is=s.getInputStream();
		//création de OutputStream pour ecrire les données vers ss
		OutputStream os =s.getOutputStream();
		//fermeture de ServerSocket			
		ss.close();
}catch(IOException e)
	{e.printStackTrace();}
}
}

