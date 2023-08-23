public class Phone {
    private int number = 0;
    private int model = 0;
    private double weight = 0.0;
    public Phone() {
    }
    public Phone(int number, int model, double weight) {
        this (number, model);
        setWeight(weight);
    }
    public Phone(int number, int model) {
        setNumber(number);
        setModel(model);
    }
    static void recieveCall(String name) {
        //System.out.println();
        System.out.print("Звонит " + name);
    }
    static void recieveCall(String name, Integer nomer) {
        //System.out.println();
        System.out.println("Звонит " + name + " номер телефона " + nomer);
    }
    static void sendMessage(int ... nomera){
        System.out.print("Отправим сообщения номерам: ");
        for (int i:nomera) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getNumber() {
        return number;
    }
    public int getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
}