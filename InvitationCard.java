public class InvitationCard {
    int cardId;
    String occasion;
    String color;
    String material;
    String senderName;
    double price;
    boolean isHandmade;

    void getInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Occasion: " + occasion);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Price: " + price);
        System.out.println("Is Handmade: " + isHandmade);
        System.out.println();
    }
}
