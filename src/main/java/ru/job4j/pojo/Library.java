package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Град обречённый", 300);
        Book book2 = new Book("Три товарища", 200);
        Book book3 = new Book("Дюна", 350);
        Book book4 = new Book("Clean code", 900);
        Book[] bookArray = new Book[] {book1, book2, book3, book4};
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println("Книга называется: "
                    + bookArray[i].getName() + ". "
                    + "Количество страниц в книге: "
                    + bookArray[i].getPage() + ".");
        }
        Book temp = bookArray[0];
        bookArray[0] = bookArray[3];
        bookArray[3] = temp;
        for (int i = 0; i < bookArray.length; i++) {
            if ("Clean code".equals(bookArray[i].getName())) {
                System.out.println("Книга называется: "
                        + bookArray[i].getName() + ". "
                        + "Количество страниц в книге: "
                        + bookArray[i].getPage() + ".");
            }
        }
    }
}
