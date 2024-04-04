package model;

import java.time.LocalDate;

public class Cat extends Pets {


    public Cat(String name, LocalDate birth_date) {
        super(name, birth_date);
    }



    @Override
    public String toString() {
        return "Кошка {" +
                ", кличка ='" + super.getName() + '\'' +
                ", дата рождения ='" + super.getBirth_date() + '\'' +
                ", команды ='" + super.getCommand() + '\'' +
                '}';
    }
}
