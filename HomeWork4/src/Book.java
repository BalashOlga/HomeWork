public class Book {
    private String name;
    private String authorName;
    private String text = "содержание";
    public Book(String name, String authorName, String text){
        this(name, authorName);
        setText(text);
    }
    public Book(String name,  String authorName){
        this(name);
        setAuthorName(authorName);
    }

    public Book(String name){
        setName(name);
    }
    void printBook(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getText() {
        return text;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setText(String text) {
        this.text = text;
    }
}
