class Defence {
    String country;
    String branch;
    Army army;

    void getDefenceInfo() {
        System.out.println("Country: " + country);
        System.out.println("Branch: " + branch);
        if (army != null) {
            army.getArmyInfo();
        }
    }
}
