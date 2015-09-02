package ch.web.pizzamiglio;

import java.math.BigDecimal;



public class Elementi {
	
	private int BASIC_SALES_TAX = 10;
	private int IMPORT_DUSTY = 5;
	
	private int numero;
	private String nomeInput;
	private String nomeOutput;
	private double prezzoIniziale;
	private double prezzoFinale;
	private double prezzoFinalePrima;
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
			
			
			//System.out.println("005");
			//arrotondo di 005 
			
			prezzoFinaleB=prezzoFinaleB*100;
			prezzoFinaleB=  Math.ceil(prezzoFinaleB/5)*5;
			prezzoFinaleB=prezzoFinaleB/100;
			
			
			
		}


		

		
		
//		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
//		System.out.println(prezzoFinaleA);
//		System.out.println(prezzoFinaleB);
//		System.out.println(prezzoIniziale);
		
		prezzoFinale = prezzoIniziale + prezzoFinaleA + prezzoFinaleB;
//		System.out.println("####################");
		prezzoFinalePrima=prezzoFinale;
//		System.out.println(prezzoFinalePrima);
//		double prezzoFinaleDD = Math.rint(prezzoFinalePrima*Math.pow(10,2))/Math.pow(10,2);
//		System.out.println(prezzoFinaleDD);
		
		
	     // prezzoFinale=  Math.ceil(prezzoFinale*Math.pow(10,2))/Math.pow(10,2);
	      
//		if(isImportDuty && !isBasicSalesTax) //true
//		{
//			//System.out.println("005");
//			//arrotondo di 005
//			
//			prezzoFinale=prezzoFinale*100;
//			prezzoFinale=  Math.ceil(prezzoFinale/5)*5;
//			prezzoFinale=prezzoFinale/100;
//
//			
//			
//			
////			System.out.println(prezzoFinale);
//		}
//		else{
			
//		System.out.println(prezzoFinale);
		
		BigDecimal bg = new BigDecimal(prezzoFinale);
		bg = bg.setScale(2, BigDecimal.ROUND_HALF_DOWN);
		prezzoFinale = bg.doubleValue();
//		System.out.println(prezzoFinale);
//		}
		
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
