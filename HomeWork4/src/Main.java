import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        int action;

        Reader[] readers = new Reader[10]; //Максимум 10 читателей
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
                    boolean isFull = true; //максимальное количество читателей
                    for (int i = 0; i < readers.length; i++){
                        if (readers[i] == null) {
                            System.out.print("Введите фамилию читателя: ");
                            String fio =  stroka.nextLine();
                            readers[i] = new Reader(fio);
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull){
                        System.out.print("Количество читателей уже максимальное");
                    }
                    break;
                }
                case 2:{
                    System.out.print("Введите название книги: ");
                    String name =  stroka.nextLine();
                    Book book1 = new Book(name);
                    System.out.print("Введите номер читательского билета: ");
                    int nomerChitBileta = stroka.nextInt();
                    stroka.nextLine();
                    boolean found = false;
                    for (int i=0; i< readers.length; i++){
                        if (readers[i] != null && readers[i].getNomerChitBileta() == nomerChitBileta){
                            found = true;
                            switch (readers[i].takeBook(book1)) {
                                case (0):
                                    System.out.println("Читатель взял максимальное количество книг. Книга не добавлена ");
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
                        System.out.println("Читватель не найден");
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
                    for (int i=0; i< readers.length; i++){
                        if (readers[i] != null && readers[i].getNomerChitBileta() == nomerChitBileta){
                            found = true;
                            switch (readers[i].returnBook(book1)) {
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
                        System.out.println("Читатель не найден");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Введите номер читательского билета: ");
                    int nomerChitBileta = stroka.nextInt();
                    boolean found = false;
                    for (Reader  r : readers){
                        if (r != null  && r.getNomerChitBileta() == nomerChitBileta){
                            r.printStatus();
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
                    boolean found = false;
                    for (Reader  r : readers){
                        if (r != null){
                            r.printStatus();
                            found = true;
                        }
                    }
                    if (!found) {
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
