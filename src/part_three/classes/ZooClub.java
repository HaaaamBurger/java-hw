package part_three.classes;

import part_three.enums.EPetType;
import part_three.interfaces.IZooClub;

import java.util.*;

public class ZooClub implements IZooClub {
   private Map<Person, List<Pet>> club;


    @Override
    public void addMember(Person member) {
        if (this.club == null) this.club = new HashMap<>();
        this.club.put(member, new LinkedList<>());
    }

    @Override
    public void addPetToMember(Person member, Pet pet) {
        if (!this.club.containsKey(member)) {
            System.out.println("No such a user!");
            return;
        }
        List<Pet> pets = this.club.get(member);
        pets.add(pet);
    }

    @Override
    public void removePetFromMember(Person member, Pet pet) {
        if (!this.club.containsKey(member)) {
            System.out.println("No such a user!");
            return;
        }
        List<Pet> pets = this.club.get(member);
        if(!pets.contains(pet)) {
            System.out.println("No such a pet!");
        } else {
            pets.remove(pet);
        }
    }

    @Override
    public void removeMember(int personId) {

    }

    @Override
    public void removeTypeOfPet(EPetType type) {

    }
    public List<Pet> getMemberPets(Person member) {
        if (!this.club.containsKey(member)) {
            System.out.println("No such a user!");
            return new ArrayList<>();
        }
        return this.club.get(member);
    }

    @Override
    public void showZooClub() {
        if (this.club == null) {
            this.club = new HashMap<>();
            System.out.println("ZooClub wasn't created, but I've just created it for you :)");
            return;
        } else if (this.club.isEmpty()) {
            System.out.println("ZooClub is empty ;(");
            return;
        }
        for (Map.Entry<Person, List<Pet>> member : this.club.entrySet()) {

            Person person = member.getKey();
            List<Pet> pets = member.getValue();

            System.out.println(
                            "\nid: " + person.personId +
                            "\nname: " + person.name +
                            "\npets: "
            );

            if (pets.isEmpty()) {
                System.out.println("\t[]");
            }

            for(Pet pet : pets) {
                System.out.println(
                                "\t{ " +
                                "id: " + pet.petId +
                                ",\n\tname: " + pet.name +
                                ",\n\ttype: " + pet.type +
                                        " },\n"
                );
            }
            System.out.println("------------------------");
        }
    }
}
