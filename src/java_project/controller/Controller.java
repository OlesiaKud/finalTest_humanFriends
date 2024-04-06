package java_project.controller;

import java_project.model.HumanFriends;

import java.util.List;

public interface Controller <T extends HumanFriends> {

    void createNewAnimal();
    void showCommand();
    void teachCommand();
    void getAllByBirthDate();
    void getAnimalsCount();
}
