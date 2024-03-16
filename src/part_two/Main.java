//-------------------------------------------------------
//- Створити масив з 20 числами.
//- за допомогою способу sorted відсортувати масив.
//-- за допомогою filter отримати числа кратні 3
//-- за допомогою filter отримати числа кратні 10
//-- перебрати (проітерувати) масив за допомогою foreach()
//-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
//-------------------------------------------------------

package part_two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{34,65,2,1,87,54,0,3,7,24,98,12,24,6,234,3,877,66,43,4};

        Arrays.sort(numbers);

        Arrays.stream(numbers).filter(i -> i % 3 == 0).forEach(System.out::println);

        Arrays.stream(numbers).filter(i -> i % 10 == 0).forEach(System.out::println);

        Arrays.stream(numbers).forEach(System.out::println);

        Arrays.stream(numbers).map(i -> i * 3).forEach(System.out::println);

    }
}
