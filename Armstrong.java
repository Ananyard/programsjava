class Armstrong {
    public static void main(String[] args) {
        int n = 153;   
        int temp = n, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is Not Armstrong");
    }
}
