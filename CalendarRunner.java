class CalendarRunner {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.calendarName = "Work Calendar";
        calendar.owner = "Rajesh";

        Meeting meeting = new Meeting();
        meeting.topic = "Project Kickoff";
        meeting.durationInMinutes = 60;

        Invitee invitee = new Invitee();
        invitee.inviteeName = "Anjali";
        invitee.email = "anjali@example.com";

        // Linking objects
        calendar.meeting = meeting;
        meeting.invitee = invitee;

        calendar.getCalendarInfo();
    }
}
