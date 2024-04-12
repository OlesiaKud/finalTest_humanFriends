package java_project.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class HumanFriends {
    private String name;
    private String birth_date;
    public ArrayList<String> command;
    private Integer animalId;


    public HumanFriends(String name, String birth_date, ArrayList<String> command, Integer animalId) {
        this.name = name;
        this.birth_date = birth_date;
        this.command = command;
        this.animalId = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }


    public ArrayList<String> getCommand() {
        return command;
    }

    public void setCommand(ArrayList<String> command) {
        this.command = command;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }
    public void addCommand(String newCommand) {
        command.add(newCommand);
    }
}
