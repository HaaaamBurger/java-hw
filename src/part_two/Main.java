package part_two;

import part_two.classes.Car;
import part_two.classes.Skill;
import part_two.classes.User;
import part_two.enums.EGender;

import java.util.HashSet;
import java.util.Set;

public class Main {
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
            .car(new Car("Audi", (short) 2020, (short) 250));

    User user5 = new User()
            .name("Oleg")
            .surname("Kravec")
            .email("oleg2000@gmail.com")
            .age((short) 22)
            .gender(EGender.FEMALE)
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
            .car(new Car("Audi", (short) 2020, (short) 250));

    User user10 = new User()
            .name("Oleg")
            .surname("Kravec")
            .email("oleg2000@gmail.com")
            .age((short) 22)
            .gender(EGender.FEMALE)
            .skills(new Skill("Java", (short) 0))
            .car(new Car("Audi", (short) 2020, (short) 250));


}
