class SwiggyRunner {
    public static void main(String[] meals) {
        double food = SouthIndian.takeOrder("Masala Dosa");
        System.out.println("the price is " + food);
    }
}