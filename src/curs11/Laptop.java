package curs11;

public class Laptop extends Product {
	
	private int buyingPrice;
	private int tva;
	private int adaosComercial;
	
	public Laptop(int buyPrice, int tva, int adaos) {
		setAdaosComercial(adaos);
		settva(tva);
		setBuyingPrice(buyPrice);
	}

	public int getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public int gettva() {
		return tva;
	}

	public void settva(int tva) {
		this.tva = tva;
	}

	public int getAdaosComercial() {
		return adaosComercial;
	}

	public void setAdaosComercial(int adaosComercial) {
		this.adaosComercial = adaosComercial;
	}

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return buyingPrice +tva +adaosComercial;
	}
	
//	@Override
//	public void printProductiRating() {
//		System.out.println("Laptop is the best product");
//	}
}
