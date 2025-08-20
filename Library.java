class Library{

int libraryId;
String libName;
String libRepName;

Shelf shelf;


public void getLibInfo(){

System.out.println("The Lib info");
System.out.println("The lib id is:" + libraryId);
System.out.println("The Library Name is : " + libName);
System.out.println("The Library Recepciniost name :" + libRepName);

this.shelf.getShelfInfo();



}
}