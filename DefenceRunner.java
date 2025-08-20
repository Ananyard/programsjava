class DefenceRunner {
    public static void main(String[] args) {
        Squad squad = new Squad();
        squad.name = "Alpha";
        squad.members = 12;
        squad.leader = "Captain Vikram";

        Army army = new Army();
        army.division = "Infantry";
        army.soldiers = 500;
        army.squad = squad;

        Defence defence = new Defence();
        defence.country = "India";
        defence.branch = "Indian Army";
        defence.army = army;

        defence.getDefenceInfo();
    }
}
