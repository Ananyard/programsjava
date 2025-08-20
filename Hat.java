class Hat {
    int hatId;
    String style;
    String color;
    String material;
    String brand;
    double price;
    boolean isAdjustable;
	
	Hat(int hatId,String style,String color,String material, String brand,double price,boolean isAdjustable){
		System.out.println("cons invoked");
	}

     Hat(int hatId ,boolean isAdjustable) {
        this.hatId = hatId;
        this.isAdjustable = isAdjustable;
		//System.out.println("cons invoked");
    }
	
	
	Hat(String style,String color){
		this.style = style;
		this.color = color;
        
	}
	
	Hat(String material, String brand,double price){
	    this.material = material;
        this.brand = brand;
		 this.price = price;
	
	}
	
    void getInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Style: " + style);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("------------------------------");
		
		
		
    }
}
