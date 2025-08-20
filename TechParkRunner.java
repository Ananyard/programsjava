class TechParkRunner {
    public static void main(String[] args) {

        TechPark techPark = new TechPark();
        techPark.name = "Global Tech Valley";
        techPark.location = "Whitefield, Bangalore";

        Block block = new Block();
        block.blockName = "Block A";
        block.floorCount = 10;

        Company company = new Company();
        company.companyName = "Infosys";
        company.domain = "IT Services";

       
        block.company = company;
        techPark.block = block;

       
        techPark.getTechParkInfo();
    }
}
