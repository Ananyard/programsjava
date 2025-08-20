class PhoneBook {
    int totalContacts;
    String ownerName;
    Contacts contacts;

    void getPhoneBookInfo() {
        System.out.println("PhoneBook Info:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Total Contacts: " + totalContacts);
        contacts.getContactInfo();
    }
}
