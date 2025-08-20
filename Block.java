class Block {
    String blockName;
    int floorCount;
    Company company;

    void getBlockInfo() {
        System.out.println("Block Info:");
        System.out.println("The Block Name: " + blockName);
        System.out.println("Floors are : " + floorCount);
        if (company != null) {
            company.getCompanyInfo();
        }
    }
}
