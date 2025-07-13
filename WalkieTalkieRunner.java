class WalkieTalkieRunner {

    public static void main(String[] args) {

        String brand = WalkieTalkie.getBrand();
        System.out.println("The brand is " + brand);
        int channels = WalkieTalkie.getChannels();
        System.out.println("Number of channels: " + channels);
        double freq = WalkieTalkie.getFrequency();
        System.out.println("Frequency: " + freq);
        int range = WalkieTalkie.getRangeKm();
        System.out.println("Range: " + range + " km");
        boolean charge = WalkieTalkie.getIsRechargeable();
        System.out.println("Rechargeable? " + charge);
        String color = WalkieTalkie.getColor();
        System.out.println("Color: " + color);
    }
}