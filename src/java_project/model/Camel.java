package java_project.model;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimals {


    public Camel(String name, String birth_date, List<String> command, Integer animalId) {
        super(name, birth_date, command, animalId);
    }

    @Override
    public String toString() {
        return "Верблюд {" +
                "кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
