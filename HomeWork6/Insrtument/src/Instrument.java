public abstract class Instrument implements Playable{
    private String name;
    private String aboutMySelf;
    public Instrument (String name, String aboutMySelf){
        setName(name);
        setAboutMySelf(aboutMySelf);
    }
    public void play(){
        System.out.println("Играет "+ getName() + " " + getAboutMySelf());
    }

    private void setName(String name) {
        this.name = name;
    }
    public void setAboutMySelf(String aboutMySelf) {
        this.aboutMySelf = aboutMySelf;
    }
    public  String getName(){
        return name;
    }
    public String getAboutMySelf() {
        return aboutMySelf;
    }

}
