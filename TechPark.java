class TechPark {
    String name;
    String location;
    Block block;

    void getTechParkInfo() {
        System.out.println("TechPark Info:");
        System.out.println("Name is : " + name);
        System.out.println("Location : " + location);
        if (block != null) {
            block.getBlockInfo();
        }
    }
}
