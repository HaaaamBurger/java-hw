//Створити клас котрий відповідає наступній моделі
//{
//id: 1,
//name: 'vasya',
//surname: 'pupkin',
//email: 'asd@asd.com',
//age: 31,
//gender: 'MALE',
//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//car: {model: 'toyota', year: 2021, power: 250}
//        }
//Використати композицію/агрегацію та енуми в потрібному місці.

package portfolio;

import portfolio.classes.Car;
import portfolio.classes.Skill;
import portfolio.classes.User;
import portfolio.enums.EGender;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User me = new User();

        ArrayList<Skill> mySkills = new ArrayList<>();
        Skill java = new Skill("Java", (short) 0);
        Skill javaScript = new Skill("JavaScript", (short) 3);
        mySkills.add(java);
        mySkills.add(javaScript);

        Car myCar = new Car();
        myCar.model("Toyota").year((short) 2021).power((short) 250);

        me.name("Sasha").surname("Melnyk").email("kunlem2004y@gmail.com").age((short) 20).gender(EGender.MALE).skills(mySkills).car(myCar);

        System.out.println(me);
    }
}
