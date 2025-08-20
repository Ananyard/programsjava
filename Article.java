class Article {
    String title;
    String author;
    String content;
    int wordCount;

    Article(String title, String author, String content, int wordCount) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.wordCount = wordCount;
    }

    void getArticleInfo() {
        System.out.println("Article Info:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Content: " + content);
    }
}