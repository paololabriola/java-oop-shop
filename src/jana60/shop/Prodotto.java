package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	String marca, nomeProdotto;
	float prezzoProdotto;
	int iva;
	
	DecimalFormat df = new DecimalFormat(".00€");
	
	public Prodotto() {}

	public Prodotto(String marca, String nomeProdotto, float prezzo, int iva) {
		
		super();
		this.marca = marca;
		this.nomeProdotto = nomeProdotto;
		this.prezzoProdotto = prezzo;
		this.iva = iva;
		
	}
	
	public float calcolaPrezzoTotale() {
		
		return prezzoProdotto + ((prezzoProdotto*iva)/100);
		
	}
	
	public void stampaPrezzoProdotto() {
		
		System.out.println("Il prezzo del prodotto " + nomeProdotto + " di marca " + marca + " è pari a " + df.format(calcolaPrezzoTotale()));
		
	}
	
}