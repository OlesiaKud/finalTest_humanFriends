package model;

import java.time.LocalDate;

public class Donkey extends PackAnimals {
    public Donkey(String name, LocalDate birth_date) {
        super(name, birth_date);
    }

    @Override
    public String toString() {
        return "Осёл {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
