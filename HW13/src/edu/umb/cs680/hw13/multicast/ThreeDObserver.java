package edu.umb.cs680.hw13.multicast;

public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver{

	@Override
	public void updateDJIA(DJIAEvent eventDjia) {
			DJIAEvent event = (DJIAEvent) eventDjia;
		System.out.print("ThreeDObserver of DJIAEvent: Shown here " + event.getDjia());
	}
	
	@Override
	public void updateStock(StockEvent eventStock) {
		StockEvent event = (StockEvent) eventStock;
		System.out.print("ThreeDObserver of StockEvent:Shown here " + event.getTicker() + " " + event.getQuote());
		
	}

}