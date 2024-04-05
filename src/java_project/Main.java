package java_project;

import java_project.service.AnimalService;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        AnimalService as = new AnimalService();
        as.createNewAnimal(1, "Fido", "2020-01-01", List.of("Sit", "Stay", "Fetch"));
        as.createNewAnimal(2, "Whiskers", "2019-05-15", List.of("Sit", "Pounce"));
        as.createNewAnimal(3, "Hammy", "2021-03-10", List.of("Roll", "Hide"));
        as.createNewAnimal(1, "Buddy", "2018-12-10", List.of("Sit", "Paw", "Bark"));
        as.createNewAnimal(2, "Smudge", "2020-02-20", List.of("Sit", "Pounce", "Scratch"));
        as.createNewAnimal(3, "Peanut", "2021-08-01", List.of("Roll", "Spin"));
        as.createNewAnimal(1, "Bella", "2019-11-11", List.of("Sit", "Stay", "Roll"));
        as.createNewAnimal(2, "Oliver", "2020-06-30", List.of("Meow", "Scratch", "Jump"));

        as.createNewAnimal(4, "Thunder", "2015-07-21", List.of("Trot", "Canter", "Gallop"));
        as.createNewAnimal(5, "Sandy", "2016-11-03", List.of("Walk", "Carry", "Load"));
        as.createNewAnimal(6, "Eeyore", "2017-09-18", List.of("Walk", "Carry", "Load", "Bray"));
        as.createNewAnimal(4, "Storm", "2014-05-05", List.of("Trot", "Canter"));
        as.createNewAnimal(5, "Dune", "2018-12-12", List.of("Walk", "Sit"));
        as.createNewAnimal(6, "Burro", "2019-01-23", List.of("Walk", "Bray", "Kick"));
        as.createNewAnimal(4, "Blaze", "2016-02-29", List.of("Trot", "Jump", "Gallop"));
        as.createNewAnimal(5, "Sahara", "2015-08-14", List.of("Walk", "Run"));


//        System.out.println(as.getAll());
        as.getAllByBirthDate();
        System.out.println(as.getAll());
//
        as.teachCommand("Fido", "gav!");
        System.out.println(as.getAnimalsCount());
//        as.showCommand("Fido");
    }
}
