class Magazine {
    String magazineTitle;
    String publisher;
    int issueNumber;
    double price;
    Page page;

    Magazine(String magazineTitle, String publisher, int issueNumber, double price, Page page) {
        this.magazineTitle = magazineTitle;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.price = price;
        this.page = page;
    }

    void getMagazineInfo() {
        System.out.println("Magazine Info:");
        System.out.println("Title: " + magazineTitle);
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue #: " + issueNumber);
        System.out.println("Price: ₹" + price);
        page.getPageInfo();
    }
}