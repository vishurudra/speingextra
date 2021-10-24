package com.training;

public class Main {

    public static void main(String[] args) {
        Pqr pqr =  new Pqr();
        pqr.display();
        Abc a =(Abc)pqr;
        a.display();
        Abc abc = new Pqr();
        abc.display();
        Pqr second =(Pqr)abc;
        second.display();;

    }
}
