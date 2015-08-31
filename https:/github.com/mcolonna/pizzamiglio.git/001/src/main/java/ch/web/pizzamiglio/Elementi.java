package ch.web.pizzamiglio;



public class Elementi {
	
	private int BASIC_SALES_TAX = 10;
	private int IMPORT_DUSTY = 5;
	
	private int numero;
	private String nomeInput;
	private String nomeOutput;
	private double prezzoIniziale;
	private double prezzoFinale;
	private double prezzoFinaleA =0;
	private double prezzoFinaleB =0;
	private Boolean isBasicSalesTax;
	private Boolean isImportDuty;
	
	void populate(){
		
		if(!isBasicSalesTax) //true
		{
			//prezzoFinaleA = prezzoIniziale;
		}
		else
		{
			prezzoFinaleA = ( (prezzoIniziale*BASIC_SALES_TAX)/100);
		}
		
		if(isImportDuty) //true
		{
			prezzoFinaleB =  ( (prezzoIniziale*IMPORT_DUSTY)/100);
		}
			
		prezzoFinale = prezzoIniziale + prezzoFinaleA + prezzoFinaleB;
		
		prezzoFinale = Math.rint(prezzoFinale*Math.pow(10,2))/Math.pow(10,2);
		
		
		
	}
	

	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	public String getNomeInput() {
		return nomeInput;
	}




	public void setNomeInput(String nomeInput) {
		this.nomeInput = nomeInput;
	}




	public String getNomeOutput() {
		return nomeOutput;
	}




	public void setNomeOutput(String nomeOutput) {
		this.nomeOutput = nomeOutput;
	}




	public double getPrezzoIniziale() {
		return prezzoIniziale;
	}
	public void setPrezzoIniziale(double prezzoIniziale) {
		this.prezzoIniziale = prezzoIniziale;
	}
	public double getPrezzoFinale() {
		return prezzoFinale;
	}
	public void setPrezzoFinale(double prezzoFinale) {
		this.prezzoFinale = prezzoFinale;
	}
	public Boolean getIsBasicSalesTax() {
		return isBasicSalesTax;
	}
	public void setIsBasicSalesTax(Boolean isBasicSalesTax) {
		this.isBasicSalesTax = isBasicSalesTax;
	}
	public Boolean getIsImportDuty() {
		return isImportDuty;
	}
	public void setIsImportDuty(Boolean isImportDuty) {
		this.isImportDuty = isImportDuty;
	}
	
	
	
	
	
	

}
