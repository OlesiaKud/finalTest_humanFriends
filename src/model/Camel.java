package model;

import java.time.LocalDate;

public class Camel extends PackAnimals {
    public Camel(String name, LocalDate birth_date) {
        super(name, birth_date);
    }

    @Override
    public String toString() {
        return "Верблюд {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
