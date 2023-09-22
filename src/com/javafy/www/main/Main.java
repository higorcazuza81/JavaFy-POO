package com.javafy.www.main;
import com.javafy.www.classification.TheBest;
import com.javafy.www.model.Music;
import com.javafy.www.model.Podcast;

public class Main {
    public static void main(String[] args) {
        TheBest theBest = new TheBest();


        Podcast triboDeJava = new Podcast("Tribo de Java", 60, "Rafael Del Nero", "Sheldon", "Java", "OOP in Java");
        triboDeJava.showTechnicalSheet();

        //space between the results
        System.out.println();

        Music motherMother = new Music("Mother", 3, "Danzing", "Punk", "Rock");
        motherMother.showTechnicalSheet();



        /*
        *   Testing the methods theBest
         */

        //incremnting play loop
        for (int i = 0; i < 1005; i++) {
            motherMother.play(true);
        }


        //incremnting likes loop
        for (int i = 0; i < 15; i++) {
            triboDeJava.setlike(true);
        }

        /*
        * classifying the audios
         */

        System.out.println("Music: motherMother ");
        theBest.theBest(motherMother);

        //space between the results
        System.out.println();

        System.out.println("Podcast: triboDeJava ");
        theBest.theBest(triboDeJava);



    }




}
