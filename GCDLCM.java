public class GCDLCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdVal = gcd(a, b);
        int lcmVal = (a * b) / gcdVal;

        System.out.println("GCD = " + gcdVal);
        System.out.println("LCM = " + lcmVal);
    }
}
