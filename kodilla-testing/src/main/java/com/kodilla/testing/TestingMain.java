package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int resultAdd = 4+5;
        int resultSubtract = 10-7;
        if (resultAdd==(calculator.add(4,5))){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (resultSubtract==(calculator.subtract(10,7))){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
