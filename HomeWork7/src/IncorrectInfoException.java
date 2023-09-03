public class IncorrectInfoException  extends Exception{
    private String fio;
    private Integer age;

    public IncorrectInfoException (String message, String fio ){
        super (message);
        setFio(fio);
    }
    public IncorrectInfoException (String message, Integer age ){
        super (message);
        setAge(age);
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }
}
