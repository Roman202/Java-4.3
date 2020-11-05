package com.company;

public class Factorial {

    // Цей метод вичисляє факторіал за допомогою цикла
    long computeI(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++)
            result *= i;

        return result;
    }

    // Цей метод вичисляє факторіал за допомогою рекурсії
    long computeR(int n) {
        if (n == 1) return n;
        return computeR(n - 1) * n;
    } // compute(int)
} // Factorial class
