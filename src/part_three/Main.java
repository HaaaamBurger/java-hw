//-------------------------------------------------------
//Створити клас автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API
//-------------------------------------------------------

package part_three;

import part_three.classes.Car;
import part_three.classes.Owner;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 300f, 270_000f ,new Owner("Alex", (short) 26, (short) 2), (short) 2020);
        Car car2 = new Car("Tesla", 250f, 150_000f,new Owner("John", (short) 45, (short) 20), (short) 2022);
        Car car3 = new Car("Honda", 125f, 0f,new Owner("Sarah", (short) 19, (short) 1), (short) 2003);
        Car car4 = new Car("Citroen", 190f, 0f,new Owner("Tom", (short) 24, (short) 3), (short) 2009);
        Car car5 = new Car("BMW", 450f, 0f,new Owner("Jane", (short) 56, (short) 30), (short) 2015);
        Car car6 = new Car("Mazda", 220f, 0f,new Owner("Charles", (short) 26, (short) 5), (short) 2013);
        Car car7 = new Car("Mercedes", 430f, 0f,new Owner("Winston", (short) 33, (short) 6), (short) 2024);

        List<Car> cars = new LinkedList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        upgradeCarsPower(cars, 2, 0.1f);
        for(Car car : cars) {
            car.showCar();
        }

        System.out.println("\nCars price summery: " + carPriceSum(cars));
    }
    public static void upgradeCarsPower(List<Car> cars ,int divider, float percentage) {
        if (cars.size() / divider < 1) throw new RuntimeException("Array with size " + cars.size() + " cannot be divided by " + divider);

        Collections.shuffle(cars);
        List<Car> dividedCars = cars.subList(0, cars.size() / divider);

        for(Car car : dividedCars) {
            Owner owner = car.getOwner();
            takeACourse(owner);

            car.upgradePower(percentage);
        }
    }
    public static void takeACourse(Owner owner) {
        if (owner.getExp() < 5 && owner.getAge() > 25) {
            short exp = owner.getExp();
            owner.changeExp((short) (exp + 1));
        }
    }
    public static double carPriceSum(List<Car> cars) {
        double sum = cars.stream().mapToDouble(Car::getPrice).sum();
        return sum;
    }
}
