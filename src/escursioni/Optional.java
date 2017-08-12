package Escursioni;

public class Optional {
	
	public enum OptionalDay{
		pranzo,
		merenda,
		visita;
		}
	
	int costo;
	OptionalDay op;

	public Optional(int costo, OptionalDay opt) {
		this.op = opt;
		this.costo = costo;
	}

	
}
