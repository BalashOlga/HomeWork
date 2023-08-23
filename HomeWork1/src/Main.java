import java.util.Scanner;
//Операторы сравнения и логические операторы
// 1 - обязательное
public class Main {

    public static void main(String[] args) {
        {
            Scanner CeloeChislo = new Scanner(System.in);
            System.out.print("Ведите целое число ");
            int Num = CeloeChislo.nextInt();
            if (Num % 2 == 0) {
                System.out.println("Число является четным");
            } else if (Num % 2 == 1) {
                System.out.println("Число является нечетным");
            } else {
                System.out.println("Что-то пошло не так");
            }
        }


// 2 - обязательное
        {
            Scanner CeloeChislo = new Scanner(System.in);
            System.out.println("Ведите номер дня недели от 1 до 7(включительно)");
            int Num = CeloeChislo.nextInt();
            System.out.println("Реализация через If-else");
            if (Num == 1) {
                System.out.println(Num + "-ый день недели понедельник");
            } else if (Num == 2) {
                System.out.println(Num + "-ой день недели вторник");
            } else if (Num == 3) {
                System.out.println(Num + "-ий день  недели среда");
            } else if (Num == 4) {
                System.out.println(Num + "-ый день недели четверг");
            } else if (Num == 5) {
                System.out.println(Num + "-ый день недели пятница");
            } else if (Num == 6) {
                System.out.println(Num + "-ый день недели суббота");
            } else if (Num == 7) {
                System.out.println(Num + "-ой день недели воскресенье");
            } else {
                System.out.println(Num + "-такого дня недели нет");
            }
            System.out.println("Реализация через Switch");
            switch (Num) {
                case 1:
                    System.out.println(Num + "-ый день недели понедельник");
                    break;
                case 2:
                    System.out.println(Num + "-ой день недели вторник");
                    break;
                case 3:
                    System.out.println(Num + "-ий день  недели среда");
                    break;
                case 4:
                    System.out.println(Num + "-ый день недели четверг");
                    break;
                case 5:
                    System.out.println(Num + "-ый день недели пятница");
                    break;
                case 6:
                    System.out.println(Num + "-ый день недели суббота");
                    break;
                case 7:
                    System.out.println(Num + "-ой день недели воскресенье");
                    break;
                default:
                    System.out.println(Num + "-такого дня недели нет");
            }
        }

// 3 - обязательное

        {
            int a,b,c;
            // a= (int)((Math.random()*(100-1))+1);
            // b= (int)((Math.random()*(100-1))+1);
            // c= (int)((Math.random()*(100-1))+1);
            a=1; b=-1;c=-1;
            System.out.println("a="+a);
            System.out.println("b="+b);
            System.out.println("c="+c);
            if (a==b & b==c) {
                System.out.println("все введенные числа равны");
            } else if ((a==b && b<c) || (a==c && c<b) || (b==c && c<a)){
                System.out.println("нет двух максимальных");
            } else if (a>c && b>c) {
                System.out.println("a+b="+(a+b));
            } else if (a>b && c>b) {
                System.out.println("a+c="+(a+c));
            } else if (b>a && c>a) {
                System.out.println("b+c="+(b+c));
            } else {
                System.out.println("что-то пошло не так ");
            }
        }


// 4 - обязательное
        {
            int year = (int) ((Math.random() * (2023 - 1)) + 1);
            System.out.println("выбран год - " + year);
            // int year = 2020;
            boolean ifYear = ((year % 4 == 0) && ! ((year % 100 == 0) && (year % 400 != 0)));
            if (ifYear) {
                System.out.println("в " + year + " году 366 дней");
            } else {
                System.out.println("в " + year + " году 365 дней");
            }
        }

// Циклы
// 1 - обязательное
        {
            int a = (int) ((Math.random() * (20 - 1)) + 1);
            System.out.println("Выбрано число - " + a);
            int b = 1;
            while (b <=a) {
                System.out.print("Task" + b + ". ");
                b++;
            }
        }


// 2 - обязательное
        {
            int a=1;
            int b=100;
            do{
                if(a % 5 ==0){
                    if (a!=b){
                        System.out.print(a+",");
                    } else if (a==b){
                        System.out.print(a+".");
                    } else {
                        System.out.print("Что-то пошло не так, ");
                    }
                }
                a++;
            } while (a <= b);
        }

// 3 - обязательное
        {
            int a= (int)((Math.random()*(20-1))+1);
            System.out.println("Выбрано число - "+a);
            int factorial=0;
            for (int i=1; i<=a; i++){
                factorial *=i;
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("факториал числа "+a+" = "+factorial);
        }



// 4 -обязательное
        {
            int a = (int) ((Math.random() * (20 - 1)) + 1);
            int b = a + (int) ((Math.random() * (20 - 1)) + 1);
            int n = 0;

            System.out.println("Выбрано a = " + a);
            System.out.println("Выбрано b = " + b);
            if (a == b) {
                System.out.println("числа равны");
            } else if (a > b) {
                System.out.println("что-то пошло не так");
            } else if (a < b) {
                b--;
                for (; a < b; b--) {
                    System.out.print(b + " ");
                    n++;
                }
                System.out.println();
                System.out.println("количество чисел " + n);
            } else {
                System.out.println("что-то пошло не так ");
            }
        }

        {

        }
    }}



