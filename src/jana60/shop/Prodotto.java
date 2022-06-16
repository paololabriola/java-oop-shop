package jana60.shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Prodotto {
	//Attributi della classe.
	String marcaProdotto, nomeProdotto;
	float prezzoProdotto;
	int ivaProdotto;
	//Dichiarazione variabile df di classe decimal format che serve a mantenere sempre 2 cifre dopo la virgola essenziali per quando si fa riferimenti a prezzi.
	DecimalFormat df = new DecimalFormat(".00€");
	
	public Prodotto() {} /* metodo costruttore che ci permette di creare un oggetto, lasciandoci la possibilità di assegnargli i valori in seguito nel codice. */
	//Metodo costruttore
	public Prodotto(String marca, String nomeProdotto, float prezzo, int iva) {
		
		super();
		this.marcaProdotto = marca;
		this.nomeProdotto = nomeProdotto;
		this.prezzoProdotto = prezzo;
		this.ivaProdotto = iva;
		
	}
	//Metodo calcolo del prezzo totale del prodotto aggiungendo l'iva al prezzo di base.
	public float calcolaPrezzoFinale() {
		
		return prezzoProdotto + ((prezzoProdotto*ivaProdotto)/100);
		
	}
	//Metodo di stampa di tipo void, che non resituisce alcun valore ma in grado solo di stampare un println.
	public void stampaPrezzoProdotto() {
		
		this.marcaProdotto = "apple";
		System.out.println("Il prezzo del prodotto " + nomeProdotto + " di marca " + marcaProdotto + " è pari a " + df.format(calcolaPrezzoFinale()));
		
	}
	
}