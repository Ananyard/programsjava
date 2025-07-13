class GardenRunner {

    public static void main(String[] args) {

        String name = Garden.getName();
        System.out.println("Garden name: " + name);
        String location = Garden.getLocation();
        System.out.println("Location: " + location);
        int trees = Garden.getNumberOfTrees();
        System.out.println("Number of trees: " + trees);
        boolean play = Garden.getHasPlayArea();
        System.out.println("Has play area? " + play);
        double area = Garden.getAreaInAcres();
        System.out.println("Area in acres: " + area);
        boolean water = Garden.getHasWaterFountain();
        System.out.println("Has fountain? " + water);
    }
}