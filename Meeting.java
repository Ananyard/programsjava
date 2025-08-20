class Meeting {
    String topic;
    int durationInMinutes;
    Invitee invitee;

    void getMeetingInfo() {
        System.out.println("Meeting Info:");
        System.out.println("Topic: " + topic);
        System.out.println("Duration: " + durationInMinutes + " minutes");
        if (invitee != null) {
            invitee.getInviteeInfo();
        }
    }
}
