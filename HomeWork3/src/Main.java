import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2 создание - первый вариант
        Phone Name1 = new Phone();
        Phone Name2 = new Phone();
        Phone Name3 = new Phone();
        // 3 вывод - первый вариант
        System.out.println(Name1.getNumber() + " " + Name1.getModel() + " " + Name1.getWeight());
        System.out.println(Name2.getNumber() + " " + Name2.getModel() + " " + Name2.getWeight());
        System.out.println(Name3.getNumber() + " " + Name3.getModel() + " " + Name3.getWeight());
        // 5,6 создание при помощи конструкторов с разным количеством параметров
        Phone Name4 = new Phone(111,8);
        Phone Name5 = new Phone(878,8778,8.9);
        Phone Name6 = new Phone (88555,666, 888.3);
        System.out.println(Name4.getNumber() + " " + Name4.getModel() + " " + Name4.getWeight());
        System.out.println(Name5.getNumber() + " " + Name5.getModel() + " " + Name5.getWeight());
        System.out.println(Name6.getNumber() + " " + Name6.getModel() + " " + Name6.getWeight());
        // 4 - первый вариант
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String str = scanner.nextLine();
        Phone.recieveCall(str);
        // 4 - второй вариант
        System.out.println();
        System.out.println("Или: ");
        // System.out.println();
        Name1.recieveCall(str);
        System.out.println(" телефон "+Name4.getNumber());
        System.out.print("Введите номер телефона: ");
        str = scanner.nextLine();
        Name5.recieveCall(str);
        System.out.println(" телефон "+Name5.getNumber());
        System.out.print("Введите номер телефона: ");
        str = scanner.nextLine();
        Name6.recieveCall(str);
        System.out.println(" телефон "+ Name6.getNumber());
        // 9 перегрузка метода
        Phone.recieveCall("Первый звонящий ", 545454);
        //-or
        Name2.recieveCall("Второй звонящий ", 88878878);
        // 10 - аргументы переменной длины
        Phone.sendMessage(897787,87877,87887,787878,7787);
        Phone.sendMessage(777);
    }
}