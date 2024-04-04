package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class HumanFriends {
    private String name;
    private LocalDate birth_date;
    private List<String> command;

    public HumanFriends(String name, LocalDate birth_date) {
        this.name = name;
        this.birth_date = birth_date;
        this.command = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }


    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

}
