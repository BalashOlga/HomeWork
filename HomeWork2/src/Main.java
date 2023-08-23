import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int[] array = new int[4];
            int arrayMax = 0;
            //Scanner CeloeChislo = new Scanner(System.in);
            //System.out.print("Ведите целое число ");
            for (int i = 0; i < 4; i++) {
                array[i] = (int) ((Math.random() * (100 - 10)) + 10);
                //array[i] = CeloeChislo.nextInt();
                System.out.print(array[i] + " ");
                if (i > 0 && array[i] > array[i - 1]) {
                    arrayMax++;
                }
            }
            if (arrayMax == array.length - 1) {
                System.out.println(" - массив является строго возрастающей последовательностью");
            } else {
                System.out.println(" - массив НE является строго возрастающей последовательностью");
            }
        }
//2 - обязательное
        {
            Scanner CeloeChislo = new Scanner(System.in);
            System.out.print("Ведите размер массива ");
            int l = CeloeChislo.nextInt();
            System.out.print("нижний диапазон значений ");
            int min = CeloeChislo.nextInt();
            System.out.print("верхний диапазон значений ");
            int max = CeloeChislo.nextInt() + 1;

            while (l <=0 || min > max) {
                if (l <=0) {
                    System.out.println("длина массива не может быть <=0, повторите ввод ");
                    l = CeloeChislo.nextInt();
                }
                if (min > max) {
                    System.out.println("верхний диапазон не может быть меньше нижнего, повторите ввод ");
                    System.out.print("нижний ");
                    min = CeloeChislo.nextInt();
                    System.out.print("верхний ");
                    max = CeloeChislo.nextInt();
                }
            };
            System.out.print("выводим массив: ");
            int[] array = new int[l];
            for (int i = 0; i < l; i++) {
                array[i] = (int) ((Math.random() * (max - min)) + min);
                System.out.print(array[i] + " ");
            }
            // 3 - обязательное будет как продолжение 2 обязательного
            // будем считать,что массив в предыдущем задании
            System.out.println();
            System.out.print("индекс максимального элемента: ");
            int[] arrayOfIndex = new int[l];
            int elementMax = array[0];
            int j = 0;
            for (int i = 1; i < l; i++) {
                if (array[i] > elementMax) {
                    elementMax = array[i];
                    j = 0;
                    arrayOfIndex[j] = i;
                } else if (array[i] == elementMax) {
                    arrayOfIndex[++j] = i;
                }
            }
            for (int i = 0; i <= j; i++) {
                System.out.print(arrayOfIndex[i] + " ");
            }
            System.out.println(" (значение максимального элемента: " + elementMax + ")");
// 4 -обязательнное продолжим 2 и 3
// массив есть -  теперь отсортртируем
            elementMax = array[0];
            for (int n = 0; n < l; n++) {
                for (int i = 0; i < l - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        elementMax = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = elementMax;
                    }
                }

            }
            System.out.print("отсортированный массив: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
// Строки
// 1 - обязательное
        {
            System.out.println();
            Scanner str = new Scanner(System.in);
            System.out.print("Введите строку символов: ");
            String stroka = str.nextLine();//
            while (stroka.isEmpty()){
                System.out.print("Строка не может быть пустой, введите строку: ");
                stroka = str.nextLine();
            };
            char[] strokaArray = stroka.toCharArray();
            System.out.print("Введите символ: ");
            String simvol = str.nextLine();//
            while (simvol.isEmpty()){
                System.out.print("искомый символ должен быть введен, введите символ: ");
                simvol= str.nextLine();
            };
            char[] simvolArray = simvol.toCharArray();
            int c = 0;
            for (char i : strokaArray) {
                if (i == simvolArray[0]) {
                    c++;
                }
            }
            System.out.println("Cимвол " + simvolArray[0] + " " + c + " раз встречается в строке ");
        }
//    2 - обязательное
        {
            System.out.println();
            Scanner str = new Scanner(System.in);
            System.out.print("Введите строку символов: ");
            String stroka = str.nextLine();
            System.out.print("А - ведите символ: ");
            String a = str.nextLine();
            System.out.print("B - ведите символ: ");
            String b = str.nextLine();
            while (stroka.isEmpty() || a.isEmpty() || b.isEmpty() ) {
                if (stroka.isEmpty()) {
                    System.out.print("строка не может быть пустой, ведите строку символов: ");
                    stroka = str.nextLine();
                } else if (a.isEmpty()) {
                    System.out.print("А - символ должен быть введен, введите символ: ");
                    a = str.nextLine();
                } else if (b.isEmpty()) {
                    System.out.print("А - символ должен бытьвведен, введите символ: ");
                    b = str.nextLine();
                } else break;
            }
            char[] strokaArray = stroka.toCharArray();
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            System.out.print("Новая строка: ");
            for (int  i = 0; i < strokaArray.length; i++) {
                if (strokaArray[i] == aArray[0]) {
                    strokaArray[i] = bArray[0];
                }                   // System.out.print(bArray[0]);
            }
            for (char  i: strokaArray){
                System.out.print(i);
                }
        }
        System.out.println();
    }}