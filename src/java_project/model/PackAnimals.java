package java_project.model;

import java.time.LocalDate;
import java.util.List;

public class PackAnimals extends HumanFriends {


    public PackAnimals(String name, String birth_date, List<String> command, Integer animalId) {
        super(name, birth_date, command, animalId);
    }
}
