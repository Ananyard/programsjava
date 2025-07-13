class MarketRunner{

public static void main(String[] mar){


String markets = Market.getMarket();
System.out.println("the market name is " + markets);
String locations = Market.getLocation();
System.out.println("the market is in location " + locations);
int shops = Market.getNoOfShop();
System.out.println("the no of shops available " + shops);
int openingTime = Market.getOpeningTimeMorning();
System.out.println("the opening time is  " + openingTime);
int closingTime = Market.getClosingTimeNigth();
System.out.println("the closing time is " + closingTime);
boolean hasParkings = Market.getHasParking();
System.out.println("the location has parking ? " + hasParkings);
boolean weekEndOpen  = Market.getIsWeekEndOpen();
System.out.println("the weekend oepn  ? " + weekEndOpen);
}
}