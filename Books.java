class Book {
    String title;
    double price;

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.price = 450;
        b.show();
    }
}
