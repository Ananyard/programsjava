class NewsPaper{
	
	NewsPaper(){
	
	System.out.println("newpaper cons invoked");
	}
	
	NewsPaper(int newsPaperId,int noOfPage,String language,String date,String day,String companyName){
	
	System.out.println("newpaper parameterised  cons invoked");
	   //instance = parameter
	   this.newsPaperId = newsPaperId;
	   this.noOfPage = noOfPage;
	   this.language = language;
	   this.date = date;
	   this.day = day;
	   this.companyName = companyName;
	
	
	}
	
	int newsPaperId;
	int noOfPage;
	String language;
	String date;
	String day;
	String companyName;
	
	
public void getNewsInfo(){
	
	
System.out.println("id " +newsPaperId);
System.out.println("language " +language);

System.out.println("		page " + noOfPage);


System.out.println("date " + date);
System.out.println("day " + day);
System.out.println("companyName " + companyName);


}
}