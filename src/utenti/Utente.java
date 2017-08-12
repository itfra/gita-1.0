package utenti;

public abstract class Utente {

	String nome;
	String cognome;
	String codicefiscale;
	String annoNascita;
	String sesso;
	String email;
	String indirizzo;
	
	public Utente(String nome, String cognome, String codicefiscale, String annoNascita, String sesso, String email,
			String indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codicefiscale = codicefiscale;
		this.annoNascita = annoNascita;
		this.sesso = sesso;
		this.email = email;
		this.indirizzo = indirizzo;
	} 
	
	
	
}
