class ChocolateRunner{
public static void main (String[] a){


/* for arrray related content //should be intiliazed external only.

String name1[] = {};
String name2[] = {};
classname.name = name1;
*/

String indegreints1[] = {"sugar","wheat flour (Maida)", "hydrogenated vegetable fat","milk solids", "cocoa solids"};

String indegreints2[] = {"sugar","milk solids", "cocoa butter", "cocoa mass","emulsifier (like Soya lecithin)"};
String indegreints3[] = {"sugar", "milk solids", "cocoa butter", "cocoa solids", "fractionated fat", "emulsifiers (442, 476)"};


Chocolate chocolate  = new Chocolate();
//array variable initilaized externally.
chocolate.indegreints = indegreints1;
chocolate.chocolateName = "munch";


Chocolate chocolate1 = new Chocolate();
chocolate1.indegreints = indegreints2;
chocolate1.chocolateName = "Kitkat";

Chocolate chocolate2 = new Chocolate();
chocolate2.chocolateName = "dairy milk";
chocolate2.indegreints = indegreints3;

Chocolate chocolate3 = new Chocolate("polo");
System.out.println("the choki name is " + chocolate3.chocolateName);


Chocolate chocolate4 = new Chocolate("nestle" ,90,"20grms");
System.out.println(  chocolate4.brand + "price is  " + chocolate4.price + "for " +  chocolate4.quantity + "");



chocolate.getChocolateDetails();
chocolate1.getChocolateDetails();
chocolate2.getChocolateDetails();
chocolate3.getChocolateDetails();
chocolate4.getChocolateDetails();





}





}