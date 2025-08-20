class Train {
    String trainName;
    int trainNumber;

    Train(String trainName, int trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    void display() {
        System.out.println("Train Name: " + this.trainName);
        System.out.println("Train Number: " + this.trainNumber);
    }
}