public class InvitationCard {
    int cardId;
    String occasion;
    String color;
    String material;
    String senderName;
    double price;
    boolean isHandmade;

    public InvitationCard(int cardId, String occasion, String color, String material,
                          String senderName, double price, boolean isHandmade) {
        System.out.println("Running constructor for: " + occasion);
        this.cardId = cardId;
        this.occasion = occasion;
        this.color = color;
        this.material = material;
        this.senderName = senderName;
        this.price = price;
        this.isHandmade = isHandmade;
    }

    void getInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Occasion: " + occasion);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Price: ₹" + price);
        System.out.println("Is Handmade: " + isHandmade);
        System.out.println("-----------------------------------------");
    }
}
