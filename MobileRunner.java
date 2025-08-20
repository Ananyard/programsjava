class MobileRunner {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.brand = "Samsung";
        mobile.model = "Galaxy S23";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.ownerName = "Ravi";
        phoneBook.totalContacts = 50;

        Contacts contact = new Contacts();
        contact.name = "Anjali";
        contact.phoneNumber = "9876543210";

       
        phoneBook.contacts = contact;
        mobile.phoneBook = phoneBook;

       
        mobile.getMobileInfo();
    }
}
