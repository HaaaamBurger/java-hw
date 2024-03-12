package part_two;

import part_two.classes.Car;
import part_two.classes.Skill;
import part_two.classes.User;
import part_two.enums.EGender;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        User user1 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user2 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user3 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.FEMALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user4 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user5 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.FEMALE)
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user6 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user7 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user8 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.MALE)
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user9 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.FEMALE)
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

        User user10 = new User()
                .name("Oleg")
                .surname("Kravec")
                .email("oleg2000@gmail.com")
                .age((short) 22)
                .gender(EGender.FEMALE)
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .skills(new Skill("Java", (short) 0))
                .car(new Car("Audi", (short) 2020, (short) 250));

//------------------------------------
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//------------------------------------
//        Set<User> users = new HashSet<>();
//
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);
//        users.add(user10);
//------------------------------------
//        List<User> sortedByMale = users.stream().filter(user -> !user.getGender().equals(EGender.MALE)).toList();
//        sortedByMale.forEach(user -> System.out.println(user.getGender()));
//------------------------------------
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
//------------------------------------
//        Comparator<User> sortBySkills = Comparator.comparingInt(user -> user.getSkillsCount().size());
//
//        Set<User> users = new TreeSet<>(sortBySkills);
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);
//        users.add(user10);
//
//        for(User user : users) {
//            System.out.println(user.getSkillsCount().size());
//        }
//------------------------------------
     }
}
