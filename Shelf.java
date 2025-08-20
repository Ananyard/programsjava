class Shelf{

int noOfShelf;
String  material;

Book book;



public void getShelfInfo(){

System.out.println("The shelf info");
System.out.println("The no shelf is:" + noOfShelf);
System.out.println("The material used for shle  is : " + material);

this.book.getBookInfo();


}
}