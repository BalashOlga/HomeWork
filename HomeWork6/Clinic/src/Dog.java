public class Dog extends Animal{
    public Dog(String name, double age){
        super (name,age);
    }
    @Override
    public void makeNoise(){
        System.out.println(getName() +"- 'gav-gav'");
    }
}