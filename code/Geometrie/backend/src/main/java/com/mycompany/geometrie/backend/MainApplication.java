package com.mycompany.geometrie.backend;

import com.mycompany.geometrie.backend.controller.MainController;

public class MainApplication {
    public static void main(String[] args) {

        MainController mainController = new MainController();

        String choix = mainController.askOperation();
    }
}
