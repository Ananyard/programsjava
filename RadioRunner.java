class RadioRunner{

public static void main (String[] rd){


String color = Radio.getColor();
System.out.println(" the color  is " + color );


 int button	=	Radio.getButton();
 System.out.println(" the button  is " + button );

int volume =	Radio.getVolume();
 System.out.println(" the volume  is " + volume );
 
 
 
boolean isON	=  Radio.getIsOn();
System.out.println(" device is  on " + isON );
 
 
 
 String brand =	Radio.getBrand();
 System.out.println(" the brand  is " + brand );
 
}

}



