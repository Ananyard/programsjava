class Army {
    String division;
    int soldiers;
    Squad squad;

    void getArmyInfo() {
        System.out.println("Division: " + division);
        System.out.println("Soldiers: " + soldiers);
        if (squad != null) {
            squad.getSquadInfo();
        }
    }
}
