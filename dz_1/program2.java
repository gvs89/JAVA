package dz_1;

class Answer {
    public static void printPrimeNums() {
     // Напишите свое решение ниже

     // Проход начинается с 2, т.к. это число является наименьшим простым
     for (int i = 2; i <= 1000; i++) {

         boolean isPrime = true;

         // Проверка, является ли число i простым
         // Проход по циклу до корня числа,
         // т.к. дальше нет смысла искать, делителей нет.
         for (int j = 2; j <= Math.sqrt(i); j++) {
             if (i % j == 0) {
                 isPrime = false;
                 break;
             }
         }
         // Если число i простое, вывод его на экран
         if (isPrime)
             System.out.println(i);
     }
 }
}

public class program2{ 
 public static void main(String[] args) { 

 
 }
}