package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(0.5, 1);
        } catch(Exception e){
            System.out.println("Can't run!");
        } finally {
            System.out.println("Done!");
        }

    }
}
