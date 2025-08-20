class Calendar {
    String calendarName;
    String owner;
    Meeting meeting;

    void getCalendarInfo() {
        System.out.println("Calendar Info:");
        System.out.println("Name: " + calendarName);
        System.out.println("Owner: " + owner);
        if (meeting != null) {
            meeting.getMeetingInfo();
        }
    }
}
