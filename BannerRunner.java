class BannerRunner{
public static void main(String[] ban){




 String head  =  Banner.getHead();
System.out.println("heading is " +  head);

 String colors  =  Banner.getColor();
System.out.println("color  is " + colors);


int hgt	=Banner.getHeight();
System.out.println("height of banner  is " + hgt);

double width = Banner.getWidth();
System.out.println("height of banner  is " + width);

boolean visible = Banner.getVisible();
System.out.println("banner is visible ?" +  visible);
}
}


