class HackerRunner {

    public static void main(String[] args) {

        String name = Hacker.getAlias();
        System.out.println("Alias: " + name);

        int age = Hacker.getAge();
        System.out.println("Age: " + age);

        boolean blackHat = Hacker.getIsBlackHat();
        System.out.println("Is Black Hat Hacker? " + blackHat);

        String skill = Hacker.getExpertise();
        System.out.println("Expertise: " + skill);

        int totalHacks = Hacker.getHacksDone();
        System.out.println("Hacks done: " + totalHacks);

        String country = Hacker.getCountry();
        System.out.println("Country: " + country);
    }
}