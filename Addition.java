class Addition {

public static void main(String[] add){
System.out.println("main started");
add (67 ,78);
add (107 ,112);
add (671 ,789);
add (62,69);

sub(20,90);

product(2,9);
product(9,77);
div(21,7);
System.out.println("main ended");
}

public static void add(int num1,int num2){
	int total  = num1 + num2;
	System.out.println(total);
}
public static void sub(int num1, int num2){
	int total  = num2 - num1;
	System.out.println(total);
}

public static void product(int num1, int num2){
	int total  = num1 * num2;
	System.out.println(total);
}


public static void div(int num1, int num2){
	int total  = num1 / num2;
	System.out.println(total);
}
}