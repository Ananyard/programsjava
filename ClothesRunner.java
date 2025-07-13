class ClothesRunner{
public static void main(String[] cl){

String type 	= Clothes. getType();
System.out.println(" the cloth type is " + type);
char size = Clothes.getSize();
System.out.println("the size is "  +  size);
int quantity = Clothes.getQuantity();
System.out.println("the quantity available is " + quantity);
double rating = Clothes.getRating();
System.out.println("the rating is " + rating);
boolean isAvailable= Clothes.getIsAvailable();
System.out.println("dress available in stock " + isAvailable);

}
}