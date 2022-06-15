package jana60.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String marca;
		String nome;
		float prezzo;
		int iva;
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci la marca del prodotto");
		marca = scan.nextLine();
		
		System.out.println("Inserisci il nome del prodotto");
		nome = scan.nextLine();
		
		System.out.println("Inserisci il prezzo del prodotto");
		prezzo = scan.nextFloat();
		
		System.out.println("Inserisci l'iva del prodotto");
		iva = scan.nextInt();
		
		Prodotto prodotto = new Prodotto(marca, nome, prezzo, iva);
		
		A.stampaPrezzoProdotto();
		
		scan.close();
	
	}

}
