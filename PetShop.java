class PetShop {
    public static void main(String[] args) {
        pet("Dog", 3);
        pet("Cat", 5);
        pet("Parrot", 2);
    }

    public static void pet(String type, int count) {
        System.out.println(type + "s available: " + count);
    }
}
