class GamingPcRunner {
    public static void main(String[] args) {
        String processor = GamingPc.getProcessor();
        System.out.println("Processor: " + processor);

        int ram = GamingPc.getRamGB();
        System.out.println("RAM (GB): " + ram);

        String gpu = GamingPc.getGraphicsCard();
        System.out.println("Graphics Card: " + gpu);

        double price = GamingPc.getPrice();
        System.out.println("Price: ₹" + price);

        boolean rgb = GamingPc.getHasRGB();
        System.out.println("Has RGB lighting? " + rgb);

        String cabinet = GamingPc.getCabinetBrand();
        System.out.println("Cabinet Brand: " + cabinet);
    }
}