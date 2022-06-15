package jana60.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Dichiarazione variabili.
		String marca, nome;
		float prezzo;
		int iva;
		//Dichiarazione variabile di tipo Scanner per prendere i valori in input.
		Scanner scan = new Scanner(System.in);
		//Inizializzazione delle variabili:
		//Assegnazione valore della marca del prodotto.
		System.out.println("Inserisci la marca del prodotto");
		marca = scan.nextLine();
		//Assegnazione valore del nome del prodotto.
		System.out.println("Inserisci il nome del prodotto");
		nome = scan.nextLine();
		//Assegnazione valore del prezzo del prodotto.
		System.out.println("Inserisci il prezzo del prodotto");
		prezzo = scan.nextFloat();
		//Assegnazione valore dell'iva sul prodotto.
		System.out.println("Inserisci la percentuale dell'iva sul prodotto");
		iva = scan.nextInt();
		//Dichiarazione oggetto prodotto1 di classe Prodotto con annesse variabili per la costruzione di quest'ultimo.
		Prodotto prodotto1 = new Prodotto(marca, nome, prezzo, iva);
		//Richiamo metodo della classe prodotto che stampa il prezzo finale del prodotto.
		prodotto1.stampaPrezzoProdotto();
		//Chiusura dello scanner.
		scan.close();
	
	}

}
