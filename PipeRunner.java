public class PipeRunner {
    public static void main(String[] args) {

        System.out.println("Main started");

        Pipe pipe1 = new Pipe(501, "PVC", 10.5, 4.0, false, "White");
        Pipe pipe2 = new Pipe(502, "Copper", 7.8, 2.5, true, "Copper");
        Pipe pipe3 = new Pipe(503, "Steel", 15.0, 6.0, false, "Gray");
        Pipe pipe4 = new Pipe(504, "Aluminum", 12.0, 3.5, true, "Silver");
        Pipe pipe5 = new Pipe(505, "HDPE", 9.2, 2.0, false, "Black");
        Pipe pipe6 = new Pipe(506, "Cast Iron", 8.5, 5.0, true, "Rust");
        Pipe pipe7 = new Pipe(507, "CPVC", 11.0, 2.8, false, "Cream");
        Pipe pipe8 = new Pipe(508, "Brass", 6.5, 1.5, true, "Golden");
        Pipe pipe9 = new Pipe(509, "Galvanized Steel", 13.0, 4.2, false, "Zinc");
        Pipe pipe10 = new Pipe(510, "Concrete", 20.0, 10.0, false, "Gray");

        Pipe pipe11 = new Pipe(511, "Clay", 7.2, 3.0, false, "Brown");
        Pipe pipe12 = new Pipe(512, "Glass", 5.5, 1.0, true, "Transparent");
        Pipe pipe13 = new Pipe(513, "Acrylic", 6.0, 2.5, true, "Blue");
        Pipe pipe14 = new Pipe(514, "Polypropylene", 8.8, 3.3, false, "Green");
        Pipe pipe15 = new Pipe(515, "Lead", 9.0, 1.2, false, "Dark Gray");
        Pipe pipe16 = new Pipe(516, "Rubber", 4.5, 1.5, true, "Black");
        Pipe pipe17 = new Pipe(517, "Silicone", 3.5, 0.8, true, "Red");
        Pipe pipe18 = new Pipe(518, "Titanium", 14.0, 2.2, false, "Silver");
        Pipe pipe19 = new Pipe(519, "Zinc", 7.7, 2.7, false, "Grayish Blue");
        Pipe pipe20 = new Pipe(520, "Nickel", 6.6, 1.8, true, "Silver Gray");

        pipe1.getPipeInfo();   pipe2.getPipeInfo();   pipe3.getPipeInfo();   pipe4.getPipeInfo();   pipe5.getPipeInfo();
        pipe6.getPipeInfo();   pipe7.getPipeInfo();   pipe8.getPipeInfo();   pipe9.getPipeInfo();   pipe10.getPipeInfo();
        pipe11.getPipeInfo();  pipe12.getPipeInfo();  pipe13.getPipeInfo();  pipe14.getPipeInfo();  pipe15.getPipeInfo();
        pipe16.getPipeInfo();  pipe17.getPipeInfo();  pipe18.getPipeInfo();  pipe19.getPipeInfo();  pipe20.getPipeInfo();

        System.out.println("Main ended");
    }
}
