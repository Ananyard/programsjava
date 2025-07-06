class ZooInfo {

    public static void main(String[] args) {
        zooName();
        totalAnimals(120);
        animal("Tiger", 5);
        animal("Elephant", 3);
    }

    public static void zooName() {
		String zoo = "Zoo: Safari Wildlife Park";
        System.out.println(zoo);
    }

    public static void totalAnimals(int count) {
        System.out.println("Total Animals: " + count);
    }

    public static void animal(String name, int count) {
        System.out.println(count);
    }
}
