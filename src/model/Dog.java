package model;

import java.time.LocalDate;

public class Dog extends Pets {
    public Dog(String name, LocalDate birth_date) {
        super(name, birth_date);
    }
    @Override
    public String toString() {
        return "Собака {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
