package sem2;

import java.util.Scanner;

class Example{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }
    static void area(String figure, int x){
        if(figure.equals("Круг")){
            System.out.println(Math.PI*x*x);
        }
        
        
        if(figure.equals("Квадрат")){
            System.out.println(x*x);
        }
    }
    //разместите свои функции, например здесь
}