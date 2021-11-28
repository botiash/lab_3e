package com.company;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r=new Random();
        abiturient random=null;
        if(r.nextBoolean())
            random=new student() {
                @Override
                public boolean speakEnglish() {
                    return super.speakEnglish();
                }

                @Override
                public boolean zaochno() {
                    return super.zaochno();
                }
            };
        else random=new studzaoch();
        System.out.println("Abiturient:"+random);
        System.out.print(random.speakEnglish()?"Adil soilei alady ":" Adil soilei almaidy");
        System.out.print(random.zaochno()?"Adil zaochno":" Adil zaochno emes");
    }
}