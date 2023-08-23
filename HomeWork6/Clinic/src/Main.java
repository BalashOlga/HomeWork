public class Main {
    public static void main(String[] args) {
        Animal[] kto_to= new Animal[3];
        kto_to[0] = new Cat("Rizik", 5);
        kto_to[1] = new Dog("Zluka", 2);
        kto_to[2] = new Rat("Pinky", 1);
        for (Animal i:kto_to){
            i.makeNoise();
        }

        new Cat("Pushok", 5).makeNoise();
        new Dog("Torpeda", 2).makeNoise();
        new Rat("Mega Mozg", 1).makeNoise();
    }
}