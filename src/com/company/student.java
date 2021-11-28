package com.company;

public abstract class student implements abiturient{

    @Override
    public boolean speakEnglish() {
        return true ;
    }

    @Override
    public boolean zaochno() {
        return false;
    }
}
