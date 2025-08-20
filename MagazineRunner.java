public class MagazineRunner {
    public static void main(String[] args) {
        Article article = new Article("The Future of AI", "Ravi Sharma", "Artificial Intelligence is evolving fast...", 1200);
        Page page = new Page(5, false, article);
        Magazine magazine = new Magazine("Tech Monthly", "Digital India Press", 42, 99.0, page);

        magazine.getMagazineInfo();
    }
}