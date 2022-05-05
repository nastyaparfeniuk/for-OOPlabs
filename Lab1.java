package com.forlabs;

public class Lab1 {
    public static void main(String[] args) {
        //1514 - номер залікової книжки

        //Визначаємо константи відповідно до варіанту
        final int C2 = 1514 % 2;
        System.out.println("C2 = " + C2 + " - operation O1 '-'");
        final int C3 = 1514 % 3;
        System.out.println("C3 = " + C3);
        final int C5 = 1514 % 5;
        System.out.println("C5 = " + C5 + " - operation O2: '-'");
        final int C7 = 1514 % 7;
        System.out.println("C7 = " + C7 + " type of i,j: int");

        final int C = C3;
        System.out.println("C = " + C);

        //Значення змінних для обрахунку циклу
        int a = 3;
        int b = 2;
        int n = 5;
        int m = 4;

        //Умова, за якої знаменник буде рівний нулю
        if (a < C && C < n){
            System.out.println("Can't be divided by 0!");
            System.exit(0);
        }

        //Вкладені цикли для обрахунку заданої формули
        double s = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                s += (double)(i - j) / (i - C);
            }
        }
        //Вивід кінцевого значення
        System.out.println("S = " + s);
    }
}
