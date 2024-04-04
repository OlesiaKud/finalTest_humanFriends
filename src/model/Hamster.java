package model;

import java.time.LocalDate;

public class Hamster extends Pets {
    public Hamster(String name, LocalDate birth_date) {
        super(name, birth_date);
    }
    @Override
    public String toString() {
        return "Хомяк {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
