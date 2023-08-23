public abstract class Animal {
    private String name;
    private double age;
    public Animal(String name, double age) {
        setName(name);
        setAge(age);
    }
    public abstract void makeNoise();
    public String getName() {
        return name;
    }
    public double getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(double age) {
        this.age = age;
    }
}



