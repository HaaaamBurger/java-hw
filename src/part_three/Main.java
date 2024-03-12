package part_three;

import part_three.classes.Person;
import part_three.classes.Pet;
import part_three.classes.ZooClub;
import part_three.enums.EPetType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person member1 = new Person("Oleg");
        ZooClub zooClub = new ZooClub();

        zooClub.addMember(member1);
        zooClub.addPetToMember(member1, new Pet("Zag", EPetType.CAT));
        zooClub.addPetToMember(member1, new Pet("Rocky", EPetType.DOG));

        List<Pet> member1Pets = zooClub.getMemberPets(member1);

        zooClub.removePetFromMember(member1, member1Pets.get(1));

        zooClub.showZooClub();
    }
}
