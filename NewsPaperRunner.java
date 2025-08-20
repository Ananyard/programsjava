class NewsPaperRunner{
public static void main(String[] paper){

System.out.println("main started"); 
 
// ClassName referenceVariable = new constructor();

NewsPaper newspaper = new NewsPaper(1,10,"kannada","22-7-2025", "tuesday","udayavani");



/*newspaper.newsPaperId = 1;
newspaper.noOfPage = 10;
newspaper.language = "kannada";
newspaper.date = "22-7-2025";
newspaper.day = "tuesday";
newspaper.companyName = "udayavani";*/

NewsPaper newspaper1 = new NewsPaper(2,8,"kannada","22-7-2025","tuesday","udayavani");   
                              
/*newspaper1.newsPaperId = 2;
newspaper1.noOfPage = 8;
newspaper1.language = "kannada";
newspaper1.date = "22-7-2025";
newspaper1.day = "tuesday";
newspaper1.companyName = "prajvani";*/

NewsPaper newspaper2 = new NewsPaper();
newspaper2.newsPaperId = 1;
newspaper2.noOfPage = 12;
newspaper2.language = "kannada";
newspaper2.date = "22-7-2025";
newspaper2.day = "tuesday";
newspaper2.companyName = "vijayakarnatka";

NewsPaper newspaper3 = new NewsPaper();
newspaper3.newsPaperId  = 3;
newspaper3.noOfPage = 14;
newspaper3.language = "english";
newspaper3.date = "22-7-2025";
newspaper3.day = "tuesday";
newspaper3.companyName = "times of india";


newspaper.getNewsInfo();
newspaper1.getNewsInfo();
newspaper2.getNewsInfo();
newspaper3.getNewsInfo();



System.out.println("main ended");

}
}