package geekbrains.java_level1.lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        menu();
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.print("Введитеде а=");
            int a = scanner.nextInt();
            System.out.print("Введитеде b=");
            int b = scanner.nextInt();
            System.out.print("Введитеде c=");
            int c = scanner.nextInt();
            System.out.print("Введитеде d=");
            int d = scanner.nextInt();
            System.out.print("Ваш результат = " + formula(a, b, c, d));
        } else if (operation == 2) {
            System.out.print("Введитеде x=");
            int x = scanner.nextInt();
            System.out.print("Введитеде y=");
            int y = scanner.nextInt();
            System.out.print("Ваш результат = " + sravni(x, y));
        }   else if (operation == 3) {
            System.out.print("Введитеде z=");
            int z = scanner.nextInt();
            System.out.print("Чило " + positive_negative(z));
        }   else if (operation == 4) {
            System.out.print("Введитеде кого хотите поприветствовать ");
            String name = scanner.next();
            System.out.print(hello(name));
        }   else if (operation == 5) {
            System.out.println("Введите год в формате yyyy");
            int year = scanner.nextInt();
            System.out.print(year+" год"+ " "+ leap(year));

        } else System.out.println("До свидания");

    }

    private static void menu() {
        System.out.println("Выберите программу");
        System.out.println("1.Вычисление формулы a*(b+c/d)");
        System.out.println("2.Проверить x 20=< x+y >10 ");
        System.out.println("3.Проверить знак числа");
        System.out.println("4.Поприветствовать");
        System.out.println("5.Узнать високосный год или обычный");
    }

    public static float formula ( int a, int b, int c, int d)
    {
        float  e, f, j, h;
        e = a;
        f = b;
        j = c;
        h = d;
        return e * (f + j / h);
    }
    private static boolean sravni(int x,int y){
        boolean flag;
        if (x+y>10&&x+y<=20) flag=true;
        else flag=false;
        return flag;
    }
    private static String positive_negative(int z){
        String s;
        if (z>=0)  s="положительное";
        else s="отрицательное";
        return s;
    }
    private static String hello(String name){
        String s;
        s="Привет, " + name;
        return s;
    }
    private static String leap(int year) {
        String s;
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
            s = "обычный";
        else s = "високосный";
        return s;
    }
}
