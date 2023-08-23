import java.util.Date;

public class Reader {
    private String fio;
    private int nomerChitBileta;
    private String facultet;
    private Date birthDate;
    private int phone;
    private Book[] bookList = new Book[3];
    private int len = 0; // считаем, скольколько реально книг взято
    private static int n =1;//автоматическая нумерация читательского

    public Reader(String fio) {
        nomerChitBileta = n++;
        setFio(fio);
    }

    public void printStatus() {
        System.out.print(" Читатель: " + fio + " с номером читательского "+ nomerChitBileta+ " взял " + len + " книг(и): ");
        printBooks();
        System.out.println();
    }

    public int takeBook (Book book){
        int control = 0;
        if (book.getName().length() == 0){
            control = 3;
        } else {
            for (int i = 0; i < bookList.length; i++) {
                if  (bookList[i] != null && bookList[i].getName().equals(book.getName())) {
                    control = 1;
                    break;
                } else if (bookList[i] == null) {
                    bookList[i] = book;
                    len++;
                    control = 2;
                    break;
                }
            }
        }
        return control;
    }

    public int returnBook (Book book){
        int control = 0;
        if (book.getName().length() == 0){
            control = 2;
        } else {
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null && bookList[i].getName().equals(book.getName())) {
                    for (int j = i; j < len-2; j++) {
                        bookList[j] = bookList[j + 1];
                    }
                    control = 1;
                    len--;
                    break;
                }
            }
        }
        return control;


    }
    public void printBooks() {
        for (int i=0; i<len; i++) {
            System.out.print(" " + bookList[i].getName() + ";");
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
