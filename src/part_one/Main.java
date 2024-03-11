package part_one;

import part_one.classes.User;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", (short) 12);
        User user2 = new User("Oleg", (short) 34);
        User user3 = new User("Nazar", (short) 1);
        User user4 = new User("Vasya", (short) 65);
        User user5 = new User("Max", (short) 24);

        List<User> users = new LinkedList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
//--------------------------------------------------------
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//--------------------------------------------------------
//        Comparator<User> sortByAgeASC = (a, b) -> a.getAge() - b.getAge();
//        Comparator<User> sortByAgeDESC = (a, b) -> b.getAge() - a.getAge();
//        Collections.sort(users, sortByAgeDESC);

//        for(User user : users) {
//            System.out.println(user.getAge());
//        }
//--------------------------------------------------------
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//--------------------------------------------------------
//        Comparator<User> sortByName = Comparator.comparingInt(user -> user.getName().length());
//
//        Collections.sort(users, sortByName);
//
//        for(User user : users) {
//            System.out.println(user.getName());
//        }
//--------------------------------------------------------
//        створити ArrayList зі словами на 15-20 елементів.
//                - відсортувати його за алфавітом .
//--------------------------------------------------------
//        ArrayList<String> words = new ArrayList<>(List.of("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore"));
//
//        Comparator<String> sortByAlphabet = Comparator.comparing((value) -> value);
//        Collections.sort(words, sortByAlphabet);
//        for(String word : words) {
//            System.out.println(word);
//        }
//--------------------------------------------------------

    }
}
