//-------------------------------------------------------
//        створити ArrayList зі словами на 15-20 елементів.
//         - відсортувати його за алфавітом .
//        *-- відфільтрувати слова довжиною менше 4 символів\
//-------------------------------------------------------

package part_one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore"));
        List<String> sortedList = list.stream().sorted(Comparator.naturalOrder()).filter(i -> i.length() < 4).toList();

        for(String item : sortedList) {
            System.out.println(item);
        }

    }
}
