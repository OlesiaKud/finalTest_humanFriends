package java_project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dog extends Pets {


    public Dog(String name, String birth_date, ArrayList<String> command, Integer animalId) {
        super(name, birth_date, command, animalId);
    }

    @Override
    public String toString() {
        return "Собака {" +
                "кличка:" + super.getName() +
                ", дата рождения: " + super.getBirth_date() +
                ", команды: " + super.getCommand() +
                '}';
    }
}
