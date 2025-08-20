class Jacket{

		int	jacketId;
		String	color;
		String 	brand;
		char	size;
		double	price;
		String materialType;
		
		Jacket(int jacketId, String	color,String brand,char	size,double	price,String materialType){
			 
			 this.jacketId = jacketId;
			 this.color = color;
			 this.brand =brand;
			 this.size = size;
			 this.price = price;
			 this.materialType = materialType;	
			
		}
		Jacket(){
			
		}
		
		public void protectFromColdWeather(){
				System.out.println("protect from the unpredictable mangalore weather");
		}
 
		public void readJacketDetails() {  //getJacketDetails, //fetchJacketDetails
			System.out.println("the jacket id is " + jacketId);
			System.out.println("the jacket color is " + color);
			System.out.println("the jacket brand is " + brand);
			System.out.println("the jacket size is " + size);
			System.out.println("the jacket price is " + price);
			System.out.println("the jacket materialType is " + materialType);
			System.out.println();
		}

}