package escursioni;


import java.util.LinkedList;

public class OptionalsList {

	private static final int numeroDiOptional = 3;

	private static class Optional {
		
		private final String nome;
		private final double prezzo;
		
		
		private Optional(String n, Float p) {
			this.nome = n;
			this.prezzo = p;
			
		}
		
		public void stampa() {
			System.out.println("Optional: " + nome);
			System.out.println("Prezzo: " + prezzo);
			
		}
		
	
	}
	
	private LinkedList<Optional> optionals;
	
	public OptionalsList() {
		optionals = new LinkedList<>();
		optionals.add( new Optional("merenda", 6f) );	
		optionals.add( new Optional("pranzo", 15f) );	
		optionals.add( new Optional("visita", 30f) );	
	}
	
	public void stampa() {
		for (Optional c : optionals) {
			c.stampa();
		}
	}
	
	public double getCosto() {
		double costo = 0;
		for (Optional c : optionals) {
			costo = costo + c.prezzo;
			}
		
		return costo;
	}

	public static void main(String[] args) {
		OptionalsList c = new OptionalsList();
		//c.stampa();
		System.out.println(c.getCosto());
	}
}