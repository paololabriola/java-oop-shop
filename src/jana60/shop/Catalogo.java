package jana60.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		//Dichiarazione variabili.
		String marca, nome;
		float prezzo;
		int iva;
		
		//Dichiarazione variabile di tipo Scanner per prendere i valori in input.
		Scanner scan = new Scanner(System.in);
		//Dichiarazione oggetto prodotto1 di classe Prodotto con annesse variabili per la costruzione di quest'ultimo.
		Prodotto[] prodotto = new Prodotto[2];
		
		//Inizializzazione delle variabili nel ciclo:
		for(int i = 0; i < 2; i++) {
			
			//Assegnazione valore della marca del prodotto.
			System.out.print("Inserisci la marca del " + (i+1) + "° prodotto: ");
			marca = scan.nextLine();
			//Assegnazione valore del nome del prodotto.
			System.out.print("Inserisci il nome del " + (i+1) + "° prodotto: ");
			nome = scan.nextLine();
			//Assegnazione valore del prezzo del prodotto.
			System.out.print("Inserisci il prezzo del " + (i+1) + "° prodotto: ");
			prezzo = scan.nextFloat();
			//Assegnazione valore dell'iva sul prodotto.
			System.out.print("Inserisci la percentuale dell'iva sul " + (i+1) + "° prodotto: ");
			iva = scan.nextInt();
			
			scan.nextLine();
			
			prodotto[i] = new Prodotto(marca, nome, prezzo, iva);
			
		
		}
			
		
		for(int i=0;i<2;i++) {
			
		//Richiamo metodo della classe prodotto che stampa il prezzo finale del prodotto.
		prodotto[i].stampaPrezzoProdotto();
		
		}
		//Chiusura dello scanner.
		scan.close();

	}

}
