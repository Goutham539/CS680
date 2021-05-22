package edu.umb.cs680.hw13.multicast;

public class PieChartObserver implements DJIAQuoteObserver, StockQuoteObserver{
	@Override
	public void updateDJIA(DJIAEvent eventDjia) {
	
		DJIAEvent de = (DJIAEvent) eventDjia;
		System.out.print("PieChart of DJIAEvent: Shown here " + de.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent eventStock) {
	
		StockEvent se = (StockEvent) eventStock;
		System.out.print("PieChart of StockEvent:Shown here " + se.getTicker() + " " + se.getQuote());
		
	}
	
}