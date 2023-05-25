package com.mycompany.app.screens;

import java.util.Scanner;

import com.mycompany.app.services.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RegistrationScreen implements IScreen {
    private final UserService userService;

    @Override
    public void start(Scanner scan) {
        String username = "";
        String password;
        System.out.println("press x and hit enter to cancel at anytime");
        while(username.isEmpty()){
            username = getUsername(scan);
            if(username == "x"){
                break;
            }
        }
        System.out.println("new Username = " + username);
    }

    private String getUsername(Scanner scan){
        String username;
        System.out.print("Enter username: ");
        username = scan.nextLine();

        if(username.equalsIgnoreCase("x")) {
            return "x";
        }
        if (userService.isValidUsername(username)){
            if(userService.isUniqueUsername(username)) {
                return username;
            } else {
                System.out.println("Username is not unique!");
                return "";
            }
        } else {
            System.out.println("Username needs to be 8-20 characters long.");
            return "";
            }
    }
    // private String getPassword(){

    // }
}
