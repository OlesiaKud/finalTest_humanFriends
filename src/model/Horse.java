package model;

import java.time.LocalDate;

public class Horse extends PackAnimals {
    public Horse(String name, LocalDate birth_date) {
        super(name, birth_date);
    }
    @Override
    public String toString() {
        return "Лошадь {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
