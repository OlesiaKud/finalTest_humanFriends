package java_project;

import java_project.controller.AnimalController;
import java_project.service.AnimalService;
import java_project.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        AnimalService as = new AnimalService();
        as.createNewAnimal(1, "Fido", "2020-01-01", new ArrayList<>(List.of("Sit", "Stay", "Fetch")));
        as.createNewAnimal(2, "Whiskers", "2019-05-15", new ArrayList<>(List.of("Sit", "Pounce")));
        as.createNewAnimal(3, "Hammy", "2021-03-10", new ArrayList<>(List.of("Roll", "Hide")));
        as.createNewAnimal(1, "Buddy", "2018-12-10", new ArrayList<>(List.of("Sit", "Paw", "Bark")));
//        as.createNewAnimal(2, "Smudge", "2020-02-20", new ArrayList<>(List.of("Sit", "Pounce", "Scratch")));
//        as.createNewAnimal(3, "Peanut", "2021-08-01", new ArrayList<>(List.of("Roll", "Spin")));
//        as.createNewAnimal(1, "Bella", "2019-11-11", new ArrayList<>(List.of("Sit", "Stay", "Roll")));
//        as.createNewAnimal(2, "Oliver", "2020-06-30", new ArrayList<>(List.of("Meow", "Scratch", "Jump")));

//        as.createNewAnimal(4, "Thunder", "2015-07-21", new ArrayList<>(List.of("Trot", "Canter", "Gallop")));
//        as.createNewAnimal(5, "Sandy", "2016-11-03", new ArrayList<>(List.of("Walk", "Carry", "Load")));
//        as.createNewAnimal(6, "Eeyore", "2017-09-18", new ArrayList<>(List.of("Walk", "Carry", "Load", "Bray")));
//        as.createNewAnimal(4, "Storm", "2014-05-05", new ArrayList<>(List.of("Trot", "Canter")));
//        as.createNewAnimal(5, "Dune", "2018-12-12", new ArrayList<>(List.of("Walk", "Sit")));
//        as.createNewAnimal(6, "Burro", "2019-01-23", new ArrayList<>(List.of("Walk", "Bray", "Kick")));
//        as.createNewAnimal(4, "Blaze", "2016-02-29", new ArrayList<>(List.of("Trot", "Jump", "Gallop")));
//        as.createNewAnimal(5, "Sahara", "2015-08-14", new ArrayList<>(List.of("Walk", "Run")));


//
//// так работают все команды, проблема с консольным решением
////         1 создание животного
//        as.createNewAnimal(1, "кусь", "2022-01-02",  new ArrayList<>(List.of("мяу!", "тссс")));
//
////          2 список команд одного животного
//        System.out.println("\n список команд одного животного");
//        System.out.println(as.showCommand("Fido"));
//        System.out.println();
//        System.out.println(as.showCommand("кусь"));
//
////          3 обучение новым командам
//        System.out.println("\n обучение новым командам");
//        as.teachCommand("кусь", "ням");
//
////          4 список по дате рождения
//        as.getAllByBirthDate();
//        System.out.println(as.getAll());
//
////          5 кол-во животных
//        System.out.println("\n кол-во животных");
//        System.out.println(as.getAnimalsCount());

//       6 ввод с консоли
        View v = new View();
        v.getView();

    }
}
