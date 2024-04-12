package java_project.model;

import java.util.ArrayList;
import java.util.List;

public class Hamster extends Pets {

    public Hamster(String name, String birth_date, ArrayList<String> command, Integer animalId) {
        super(name, birth_date, command, animalId);
    }

    @Override
    public String toString() {
        return "Хомяк {" +
                "кличка:" + super.getName() +
                ", дата рождения: " + super.getBirth_date() +
                ", команды: " + super.getCommand() +
                '}';
    }
}
