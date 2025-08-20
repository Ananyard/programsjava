class Mobile {
    String brand;
    String model;
    PhoneBook phoneBook;

    void getMobileInfo() {
        System.out.println("Mobile Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        phoneBook.getPhoneBookInfo();
    }
}
