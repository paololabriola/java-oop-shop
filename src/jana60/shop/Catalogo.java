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
		//Descrizione scopo del codice.
		System.out.println("Questo codice permette di salvare un catalogo di prodotti con annessi gli attributi dei singoli prodotti, e di stamparli a schermo in una tabella.");
		//Dichiarazione della dimensione del catalogo.
		int dimensioneCatalogo;
		//Inizializzazione e ciclo di controllo per la dimensione del catalogo.
		do {
			
			System.out.print("Inserisci la dimensione del catalogo: ");	
			dimensioneCatalogo = scan.nextInt();
			//Messaggio di errore
			if(dimensioneCatalogo <= 0)
				System.out.println("La dimensione del catalogo deve essere maggiore di 0, riprova.");
			
			scan.nextLine();/* Per pulire il buffer. In alternativa avrei potuto prendendere in input nextLine e convertire poi il valore a float/int. */
			
		}while(dimensioneCatalogo <= 0);
		
		//Dichiarazione del catalogo AKA - Vettore prodotto di classe Prodotto con dimensione definitagli prima.
		Prodotto[] prodotto = new Prodotto[dimensioneCatalogo];
		
		//Riempimento del catalogo
		for(int i = 0; i < dimensioneCatalogo; i++) {
			
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
			
			scan.nextLine(); /* Per pulire il buffer. In alternativa avrei potuto prendendere in input nextLine e convertire poi il valore a float/int. */
			//Assegnazioni valori appena presi in input ad un oggetto prodotto dell'array di tipo Prodotto dichiarato a inizio codice.
			prodotto[i] = new Prodotto(marca, nome, prezzo, iva);
			
		}
		//Stampa indice della tabella.
		System.out.format("%25s %10s %25s %10s %10s %10s %10s", "Nome del prodotto", "|", "Marca del prodotto", "|", "Prezzo (€)", "|", "Prezzo + IVA");
		//Per mandare a capo il separatore
		System.out.println();
		//Separatore che divide l'indice dal corpo della tabella
		System.out.format("%s", "---------------------------------------------------------------------------------------------------------------------");
		//Ciclo per stampare i valori di ogni oggetto dell'array.
		for(int i=0; i < dimensioneCatalogo; i++) {
			//Print per far andare a capo la riga della tabella.
			System.out.println();
			//Separazione del 25% dello spazio a sua disposizione per la stringa nome e quella marca del prodotto, per i prezzi float invece solo il 10% stesso valore assegnato ai separatori.
			System.out.format("%25s %10s %25s %10s %10.2f %10s %10.2f", prodotto[i].nomeProdotto, "|", prodotto[i].marcaProdotto, "|", prodotto[i].prezzoProdotto, "|", prodotto[i].calcolaPrezzoFinale());
			
		}
		//Chiusura dello scanner.
		scan.close();

	}

}
