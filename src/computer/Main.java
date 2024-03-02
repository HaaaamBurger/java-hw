//Створити та описати наступну їєрархію
//PC-Laptop-Ultrabook
//PC-Laptop-Workstation
//Загальна кількість вкористаних класів - 4!

package computer;

import computer.classes.Computer;
import computer.classes.Laptop;
import computer.enums.ESystem;

public class Main {
    public static void main(String[] args) {
        Laptop mylaptop = new Laptop();

        mylaptop.system(ESystem.Intel).ram(32).brand("MSI").model("Z352").battery_life(12).monitors((short)1);

        System.out.println(mylaptop.getValues());

    }
}
