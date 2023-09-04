import java.util.ArrayList;
import java.util.Date;

public class Reader {
    private String fio;
    private int nomerChitBileta;
    private String facultet;
    private Date birthDate;
    private int phone;
    private ArrayList<Book> bookList = new ArrayList<>();
    private static int n =1;//автоматическая нумерация читательского

    public Reader(String fio) {
        nomerChitBileta = n++;
        setFio(fio);
    }

    public void printStatus() {
        System.out.print(" Читатель: " + fio + " с номером читательского "+ nomerChitBileta+ " взял " + bookList.size() + " книг(и): ");
        printBooks();
        System.out.println();
    }

    public int takeBook (Book book){
        int control = 0;
        if (book.getName().length() == 0) {
            control = 3;
        }
        if (bookList.size()>0){
            for (Book listOfBooks : bookList) {
                if (listOfBooks.compareTo(book)==0) {
                    control = 1;
                }
            }
        }
        if (control != 1 && bookList.add(book)){
            control = 2;
        }
        return control;
    }

    public int returnBook (Book book) {
        int control = 0;
        Book delBook = null;

        if (book.getName().length() == 0) {
            control = 2;
        } else {
            for (Book listOfBooks : bookList) {
                if (listOfBooks.compareTo(book) == 0) {
                    delBook = listOfBooks;
                }
            }
        }

        if  (bookList.remove(delBook)) {
                    control = 1;
        }
        return control;
    }

    public void printBooks() {
        for (Book listOfBooks : bookList){
            System.out.print(" " + listOfBooks.getName() + ";");
        }
    }

    public String getFio() {
        return fio;
    }
    public int getNomerChitBileta() {
        return nomerChitBileta;
    }
    public String getFacultet() {
        return facultet;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public int getPhone() {
        return phone;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
}
