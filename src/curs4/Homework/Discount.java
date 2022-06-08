package curs4.Homework;

import java.util.Scanner;

public class Discount {
	float cost_factura;
	
	public void introducereFactura() {
		
		System.out.println("Introduceti pretul facturii: ");
		Scanner scan =new Scanner (System.in);
		cost_factura=scan.nextInt();
		scan.close();
		
	}
	public void calculDiscount(float factura) {
		int discount=0;
		if (factura > 100) {
			discount=10;	
			this.cost_factura= this.cost_factura-(this.cost_factura*discount/100);
		}
		else 
			if (factura <100 ) {
				discount=5;
				this.cost_factura= this.cost_factura-(this.cost_factura*discount/100);
			}
		System.out.println("Discountul tau este de " + discount + "%");
		System.out.println("Pretul final al facturii dupa aplicarea discountului este: " + this.cost_factura);
	}

	public void calculDiscountWithTernarOperator(float factura) {
		int discount=0;
		
		discount= (factura > 100)?10:5;
		this.cost_factura= this.cost_factura-(cost_factura*discount/100);
		
		
		System.out.println("Discountul tau este de " + discount + "%");
		System.out.println("Pretul final al facturii dupa aplicarea discountului este: " + this.cost_factura);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Start Program");
		
	//	Discount factura= new Discount();
	//	factura.introducereFactura();
	//	factura.calculDiscount(factura.cost_factura);
	
		
		Discount factura1= new Discount();
		factura1.introducereFactura();
		factura1.calculDiscountWithTernarOperator(factura1.cost_factura);
		
	}

}
