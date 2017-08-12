package utenti;

public class Partecipante extends Utente{

	String tesseraSanitaria;
	CertificatoSRC certificato;
	
	public Partecipante(String nome, String cognome, String codicefiscale, String annoNascita, String sesso,
			String email, String indirizzo, String tesseraSanitaria, CertificatoSRC certificato) {
		super(nome, cognome, codicefiscale, annoNascita, sesso, email, indirizzo);
		this.tesseraSanitaria = tesseraSanitaria;
		this.certificato = certificato;
	}

	
	
}
