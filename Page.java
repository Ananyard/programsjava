class Page {
    int pageNumber;
    boolean isAdPage;
    Article article;

    Page(int pageNumber, boolean isAdPage, Article article) {
        this.pageNumber = pageNumber;
        this.isAdPage = isAdPage;
        this.article = article;
    }

    void getPageInfo() {
        System.out.println("\nPage Info:");
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Is Advertisement Page: " + isAdPage);
        if (!isAdPage && article != null) {
            article.getArticleInfo();
        } else {
            System.out.println("No article on this page.");
        }
    }
}