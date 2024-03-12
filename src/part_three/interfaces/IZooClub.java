package part_three.interfaces;

import part_three.classes.Person;
import part_three.classes.Pet;
import part_three.enums.EPetType;

public interface IZooClub {
    void addMember(Person member);
    void addPetToMember(Person member, Pet pet);
    void removePetFromMember(Person member, Pet pet);
    void removeMember(int personId);
    void removeTypeOfPet(EPetType type);
    void showZooClub();
}
