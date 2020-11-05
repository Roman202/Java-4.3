package com.company;

class RecursionDemo {
    public static void main(String[] args) {

        Factorial f = new Factorial();

        System.out.println("Факторіал, розрахований в циклі ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + f.computeI(i));
        }

        System.out.println("Факторіал, розрахований з допомогою рекурсії");
        for (int r = 1; r <= 6; r++) {
            System.out.println(r + "! = " + f.computeR(r));
        }
    }
}
