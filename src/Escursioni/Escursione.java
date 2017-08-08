package Escursioni;
import javafx.scene.chart.PieChart.Data;

public class Escursione {
	
	String tipo;
	int maxPartecipanti;
	int minPartecipanti;
	Data data;
	
	
	void setMaxPartecipanti(int max){
		this.maxPartecipanti = max;
	};
	
	void setMinPartecipanti(int min){
		this.minPartecipanti = min;
	};
	
	void setData(Data dataEscursione){
		this.data = dataEscursione;
	};
	
	void setManager(){};
	
		
	public static void main(String[] args) {
		Mongolfiera m1 = new Mongolfiera();
		System.out.println("m1" + m1.tipo);	
		Montagna m2 = new Montagna();
		System.out.println("m2" + m2.tipo);	
	}

	
	
	}


