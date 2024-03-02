package user;//створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//https://jsonplaceholder.typicode.com/users/1

import user.classes.Company;
import user.classes.Geo;
import user.classes.User;

public class Main {
    public static void main(String[] args) {
        User me = new User("Alex", "Sasha", "kunlem2004y@gmail.com", "0682279238", "welcome.com");

        Geo geo = new Geo("-37.3159", "81.1496");
        me.setAddress("Sonyachna", "19.2", "Lviv", "19052", geo);


        Company SoftServe = new Company("SoftServe", "We don't write shit code...I hope...", "something");
        me.addCompany(SoftServe);

        System.out.println(me.getValues());

    }
}