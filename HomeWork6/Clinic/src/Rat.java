public class Rat extends Animal{
    public Rat(String name, double age){
        super (name,age);
    }
    @Override
    public void makeNoise(){
        System.out.println(getName() + "- 'pi-pi'");
    }
}