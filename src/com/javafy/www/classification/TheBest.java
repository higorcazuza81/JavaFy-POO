package com.javafy.www.classification;

public class TheBest {

    public void theBest(Classification Classification){
      if(Classification.getClassification() > 3){
          System.out.println("This is one the best!");
      } else {
          System.out.println("This is one hit!");
      }
    }
}
