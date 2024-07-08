package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book implements Comparable<Book> {
    private String name;
    private float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return Float.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return name + "," + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Float.compare(book.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(price);
    }
}

public class BookCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        System.out.println("input several Book,in the end #");
        while (true) {
            String line = in.nextLine();
            if (line.equals("#")) {
                break;
            }
            String[] parts = line.split(",");
            String name = parts[0];
            float price = Float.parseFloat(parts[1]);
            books.add(new Book(name, price));
        }
        
        System.out.println("input a new Book:");
        String[] newBookInput = in.nextLine().split(",");
        Book newBook = new Book(newBookInput[0], Float.parseFloat(newBookInput[1]));

        System.out.println("new book:<" + newBook.getName() + ">as same books");
        boolean found = false;
        for (Book book : books) {
            if (book.equals(newBook)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println();
        }
    }
}

