package ch.web.pizzamiglio;

import java.util.ArrayList;
import java.util.List;

//Basic sales tax 10%
//without     books   food   medical products  
//
//
//Import duty 5%
//
//
//
//OUTPUT
//
//LIST OF name AND price (including tax)
//
//SUM (total cost of the items) AND total amounts of sales taxes paid

public class App 
{
    public static void main( String[] args )
    {
        
        
        List<Gruppo> gruppoALL = new ArrayList<Gruppo>();
        Gruppo g1= new Gruppo() ;
        Gruppo g2= new Gruppo() ;
        Gruppo g3= new Gruppo() ;
        
        gruppoALL.add(g1);
        gruppoALL.add(g2);
        gruppoALL.add(g3);
        
       
        
        List<Elementi> lista1 = new ArrayList<Elementi>();
        List<Elementi> lista2 = new ArrayList<Elementi>();
        List<Elementi> lista3 = new ArrayList<Elementi>();
        
        //UNO
//        Input 1:
//        	1 book at 12.49
//        	1 music CD at 14.99
//        	1 chocolate bar at 0.85


//        Output 1:
//        	1 book : 12.49
//        	1 music CD: 16.49
//        	1 chocolate bar: 0.85
//        	Sales Taxes: 1.50
//        	Total: 29.83

        	
        Elementi e1 = new Elementi();
        e1.setNumero(1);
        e1.setNomeInput("book at");
        e1.setNomeOutput("book");
        e1.setPrezzoIniziale(12.49);
        e1.setIsBasicSalesTax(false);
        e1.setIsImportDuty(false);
        
        e1.populate();
      
        

        Elementi e2 = new Elementi();
        e2.setNumero(1);
        e2.setNomeInput("music CD at");
        e1.setNomeOutput("music CD");
        e2.setPrezzoIniziale(14.99);
        e2.setIsBasicSalesTax(true);
        e2.setIsImportDuty(false);
        
        e2.populate();
        
        Elementi e3 = new Elementi();
        e3.setNumero(1);
        e3.setNomeInput("chocolate bar at");
        e1.setNomeOutput("chocolate bar");
        e3.setPrezzoIniziale(0.85);
        e3.setIsBasicSalesTax(false);
        e3.setIsImportDuty(false);
        
        e3.populate();
        
        lista1.add(e1);
        lista1.add(e2);
        lista1.add(e3);
        g1.setElementi(lista1);
        g1.setNome("Output 1");
        g1.setNomeUno("Input 1");
        g1.somma(lista1);
        g1.sommaIniziale(lista1);
        
        // DUE
//        Input 2:
//        	1 imported box of chocolates at 10.00
//        	1 imported bottle of perfume at 47.50

//        Output 2:
//        	1 imported box of chocolates: 10.50
//        	1 imported bottle of perfume: 54.65
//        	Sales Taxes: 7.65
//        	Total: 65.15

        
        
        Elementi e11 = new Elementi();
        e11.setNumero(1);
        e11.setNomeInput("imported box of chocolates at");
        e11.setNomeOutput("imported box of chocolates");
        e11.setPrezzoIniziale(10.00);
        e11.setIsBasicSalesTax(false);
        e11.setIsImportDuty(true);
        
        e11.populate();
        
        
        Elementi e22 = new Elementi();
        e22.setNumero(1);
        e22.setNomeInput("imported bottle of perfume at");
        e22.setNomeOutput("imported bottle of perfume");
        e22.setPrezzoIniziale(47.50);
        e22.setIsBasicSalesTax(true);
        e22.setIsImportDuty(true);
        
        e22.populate();
        
        lista2.add(e11);
        lista2.add(e22);
        g2.setElementi(lista2);
        g2.setNome("Output 2");
        g2.setNomeUno("Input 2");
        g2.somma(lista2);
        g2.sommaIniziale(lista2);
        
        
        
        
        
        // TRE
//        Input 3:
//        	1 imported bottle of perfume at 27.99
//        	1 bottle of perfume at 18.99
//        	1 packet of headache pills at 9.75
//        	1 box of imported chocolates at 11.25
        
//        Output 3:
//        	1 imported bottle of perfume: 32.19
//        	1 bottle of perfume: 20.89
//        	1 packet of headache pills: 9.75
//        	1 imported box of chocolates: 11.85
//        	Sales Taxes: 6.70
//        	Total: 74.68


        Elementi e111 = new Elementi();
        e111.setNumero(1);
        e111.setNomeInput("imported bottle of perfume");
        e111.setNomeOutput("imported bottle of perfume");
        e111.setPrezzoIniziale(27.99);
        e111.setIsBasicSalesTax(false);
        e111.setIsImportDuty(true);
        
        e111.populate();
        
        
        Elementi e222 = new Elementi();
        e222.setNumero(1);
        e222.setNomeInput("bottle of perfume at");
        e222.setNomeOutput("bottle of perfume");
        e222.setPrezzoIniziale(18.99);
        e222.setIsBasicSalesTax(true);
        e222.setIsImportDuty(false);
        
        e222.populate(); 
        
        Elementi e333 = new Elementi();
        e333.setNumero(1);
        e333.setNomeInput("packet of headache pills at");
        e333.setNomeOutput("packet of headache pills");
        e333.setPrezzoIniziale(9.75);
        e333.setIsBasicSalesTax(false);
        e333.setIsImportDuty(false);
        
        e333.populate();
        
        
        Elementi e444 = new Elementi();
        e444.setNumero(1);
        e444.setNomeInput("box of imported chocolates at");
        e444.setNomeOutput("imported box of chocolates"); //VERY DIFFERENT
        e444.setPrezzoIniziale(11.25);
        e444.setIsBasicSalesTax(true);
        e444.setIsImportDuty(true);
        
        e444.populate(); 
        
        lista3.add(e111);
        lista3.add(e222);
        lista3.add(e333);
        lista3.add(e444);
        g3.setElementi(lista3);
        g3.setNome("Output 3");
        g3.setNomeUno("Input 3");
        g3.somma(lista3);
        g3.sommaIniziale(lista3);
        
        //GENERETE INPUT
        System.out.println( "INPUT" );
        
        
       
      //FOR GRUPPI
        for (Gruppo gruppo : gruppoALL) {
        	System.out.println( gruppo.getNomeUno() );
        	  //FOR ELEMENTI
        	
			        for (int i = 0; i < gruppo.getElementi().size(); i++) {
						
			        	System.out.println( gruppo.getElementi().get(i).getNumero() + " "+ gruppo.getElementi().get(i).getNomeInput() + " " + gruppo.getElementi().get(i).getPrezzoFinale());
			        	
					}
		
		        	System.out.println(" ");
        	
		}
        
        //GENERETE OUTPUT
        System.out.println( "OUTPUT" );
        //FOR GRUPPI
        for (Gruppo gruppo : gruppoALL) {
        	System.out.println( gruppo.getNome() );
        	  //FOR ELEMENTI
        	
			        for (int i = 0; i < gruppo.getElementi().size(); i++) {
						
			        	System.out.println( gruppo.getElementi().get(i).getNumero() + " "+ gruppo.getElementi().get(i).getNomeOutput() + ":" + gruppo.getElementi().get(i).getPrezzoFinale());
			        	
					}
			        
			        double salesTaxes =0.0;
			        salesTaxes =gruppo.getSommaVal() - gruppo.getSommaValIniziale();
			        salesTaxes = Math.rint(salesTaxes*Math.pow(10,2))/Math.pow(10,2);
			        
			        System.out.println( "Sales Taxes :" + salesTaxes  );
			        System.out.println( "Total :" + gruppo.getSommaVal()  );
		        	System.out.println(" ");
        	
		}
        
      

        
        
    }
}
