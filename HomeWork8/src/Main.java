import jdk.nashorn.api.tree.ArrayLiteralTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        int action;

        ArrayList<Reader> readers = new ArrayList<>(); //Максимум 10 читателей
        System.out.println("1 - добавить нового читателя");
        System.out.println("2 - читатель хочет взять книгу");
        System.out.println("3 - читатель хочет вернуть книгу");
        System.out.println("4 - вывести статус читателя");
        System.out.println("5 - вывести статусы всех читателей");
        System.out.println("6 - выйти из программы");

        do {
            System.out.println();
            System.out.print("Введите номер действия: ");
            action =  stroka.nextInt(); stroka.nextLine();

            switch (action) {
                case 1: {
                    if (readers.size()>=10) {
                        System.out.print("Количество читателей уже максимальное");
                    } else {
                        System.out.print("Введите фамилию читателя: ");
                        String fio =  stroka.nextLine();
                        if (readers.add(new Reader(fio))){
                            System.out.print("Читатель добавлен ");
                        } else {
                            System.out.print("Читатель не добавлен ");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Введите название книги: ");
                    String name = stroka.nextLine();
                    Book book1 = new Book(name);
                    System.out.print("Введите номер читательского билета: ");
                    int nomerChitBileta = stroka.nextInt();
                    stroka.nextLine();
                    boolean found = false;
                    for (Reader listOfReaders : readers) {
                        if (listOfReaders.getNomerChitBileta() == nomerChitBileta) {
                            found = true;
                            switch (listOfReaders.takeBook(book1)) {
                                case (0):
                                    System.out.println("Почему-то книга не добавлена ");
                                    break;
                                case (1):
                                    System.out.println("Такая книга уже есть у читателя, вторая не добавлена ");
                                    break;
                                case (2):
                                    System.out.println("Книга добавлена");
                                    break;
                                case (3):
                                    System.out.println("Книга не введена, ничего не добавлено");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.print("Читатель не найден");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Введите название книги: ");
                    String name =  stroka.nextLine();
                    Book book1 = new Book(name);
                    System.out.print("Введите номер читательского билета: ");
                    int nomerChitBileta = stroka.nextInt();
                    stroka.nextLine();
                    boolean found = false;
                    for (Reader listOfReaders : readers) {
                        if (listOfReaders.getNomerChitBileta() == nomerChitBileta) {
                            found = true;
                            switch (listOfReaders.returnBook(book1)) {
                                case (0):
                                    System.out.println("У читателя на руках такой книги нет");
                                    break;
                                case (1):
                                    System.out.println("Читатель вернул книгу ");
                                    break;
                                case (2):
                                    System.out.println("Название книги не введено, читатель ничего не вернул");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.print("Читатель не найден");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Введите номер читательского билета: ");
                    int nomerChitBileta = stroka.nextInt();
                    boolean found = false;
                    for (Reader  listOfReaders  : readers){
                        if (listOfReaders .getNomerChitBileta() == nomerChitBileta){
                            listOfReaders .printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.print("Читатель не найден");
                    }
                    break;
                }
                case 5:{
                    for (Reader  listOfReaders  : readers){
                        listOfReaders.printStatus();
                    }
                    if (readers.size() == 0 ) {
                        System.out.print("Не заведено ни одного читателя");
                    }
                    break;
                }

                case 6: {
                    System.out.print("Завершаем программу");
                    break;
                }
                default: {
                    System.out.print("Нет такой команды");

                }
            }
        } while (action != 6);
    }
}
