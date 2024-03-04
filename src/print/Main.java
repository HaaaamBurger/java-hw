//а) Оприділити інтерфейс Printable, який містить метод void print().
//б) Оприділити клас Book, що реалізує інтерфейс Printable.
//в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//г) Створити масив типу Printable, який буде містити книги та журнали.

package print;

import print.classes.Book;
import print.classes.Magazine;
import print.interfaces.IPrintable;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("My Portfolio", 329, new String[]{"Mystery", "Adventures"});
        Magazine myMagazine = new Magazine("My Magazine", 59, new String[]{"Modest", "Fashion"});

        myMagazine.print();
        myBook.print();

        ArrayList<IPrintable> bookshelf = new ArrayList<>();
        bookshelf.add(myMagazine);
        bookshelf.add(myBook);

        System.out.println(bookshelf);
    }
}