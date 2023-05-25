package com.mycompany.app;

import java.util.Scanner;

import com.mycompany.app.daos.UserDAO;
import com.mycompany.app.screens.RegistrationScreen;
import com.mycompany.app.services.UserService;

public class App {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to eCommerce App!");

    RegistrationScreen registrationScreen = new RegistrationScreen(new UserService(new UserDAO()));
    registrationScreen.start(scan);
  }
}
