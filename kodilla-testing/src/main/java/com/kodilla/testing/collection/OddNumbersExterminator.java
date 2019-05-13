package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;
import java.io.*;


public class OddNumbersExterminator {

   public ArrayList<Integer> exterminate (ArrayList<Integer> numbers, ArrayList<Integer> even){

      for(Integer check: numbers) {
         if (check % 2 == 0) {
            even.add(check);
         }
      }
      return even;
   }
}
