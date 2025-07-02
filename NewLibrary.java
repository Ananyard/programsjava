
//static 
/*class NewLibrary {
	static String fire= "Wings of Fire";
	static String alch = "The Alchemist";
	static String potter = "Harry Potter";
	static String rich   = "Rich Dad Poor Dad";
	static String mov = "1984";
	
	
	
    static String[] bookNames = {fire, alch ,potter , rich ,mov ,"The Monk Who Sold His Ferrari", 
	"To Kill a Mockingbird", "Atomic Habits"};//external reference

    public static void main(String[] books) {
        System.out.println( bookNames[0] + " " + bookNames[1] + " " + bookNames[2] + " " + bookNames[3] + " " 
		+ bookNames[4] + " " +bookNames[5] + " " + bookNames[6] + " " + bookNames[7]);
			
			System.out.println(fire);
			System.out.println(alch);
    }
}*/

//local

class NewLibrary{
	
	public static void main (String[] books){
		
	 String fire= "Wings of Fire";
	 String alch = "The Alchemist";
	 String potter = "Harry Potter";
	 String rich   = "Rich Dad Poor Dad";
	 String mov = "1984";
	
	
	String[] bookNames = {fire, alch ,potter , rich ,mov ,"The Monk Who Sold His Ferrari", 
	"To Kill a Mockingbird", "Atomic Habits"};
	
	 System.out.println( bookNames[0] + " " + bookNames[1] + " " + bookNames[2] + " " + bookNames[3] + " " 
		+ bookNames[4] + " " +bookNames[5] + " " + bookNames[6] + " " + bookNames[7]);
			
			System.out.println(fire);
			System.out.println(alch);
	
	
	
	for ( String book : bookNames)
		System.out.println(book);
	
	
	}	
}