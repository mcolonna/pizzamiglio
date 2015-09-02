package ch.web.pizzamiglio;

import java.util.List;



public class Gruppo {

	private List<Elementi> elementi; 
	private double sommaVal = 0.0;
	private double sommaValIniziale = 0.0;
	private String nome;
	private String nomeUno;
	private double salesTaxes;

	
	
	
	public String getNomeUno() {
		return nomeUno;
	}

	public void setNomeUno(String nomeUno) {
		this.nomeUno = nomeUno;
	}

	public double getSommaValIniziale() {
		return sommaValIniziale;
	}

	public void setSommaValIniziale(double sommaValIniziale) {
		this.sommaValIniziale = sommaValIniziale;
	}

	public double getSalesTaxes() {
		return salesTaxes;
	}

	public void setSalesTaxes(double salesTaxes) {
		this.salesTaxes = salesTaxes;
	}

	public List<Elementi> getElementi() {
		return elementi;
	}

	public void setElementi(List<Elementi> elementi) {
		this.elementi = elementi;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSommaVal() {
		return sommaVal;
	}

	public void setSommaVal(double sommaVal) {
		this.sommaVal = sommaVal;
	}

	public double somma(List<Elementi> elementi)
	{
		for (Elementi ele : elementi) {
			sommaVal = sommaVal + ele.getPrezzoFinale();
		}
		return sommaVal;
	}
	
	
	public double sommaIniziale(List<Elementi> elementi)
	{
		for (Elementi ele : elementi) {
			sommaValIniziale = sommaValIniziale + ele.getPrezzoIniziale();
		}
		return sommaValIniziale;
	}
	
	
	
}





