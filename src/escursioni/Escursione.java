package escursioni;

import java.util.Date;

abstract class Escursione {
	
	String tipo;
	int maxPartecipanti;
	int minPartecipanti;
	Date data;
	
	/**public Escursione(Date data,int min, int max ) {
		setData(data);
		setMaxPartecipanti(max);
		setMinPartecipanti(min);
		setManager();
		setOptional();
	}**/
	
	void setMaxPartecipanti(int max){
		this.maxPartecipanti = max;
	};
	
	void setMinPartecipanti(int min){
		this.minPartecipanti = min;
	};
	
	void setData(Date dataEscursione){
		this.data = dataEscursione;
	};
	
	void setManager(){
		
	};
	
	void setOptional(){
		
	};
		
	
	
	}


