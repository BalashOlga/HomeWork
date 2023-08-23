public class Main{
    public static void main(String[] args){
        Playable[] instrument = new Instrument[3];
        instrument[0]= new Guiter("с шестью струнами");
        instrument[1]= new Drum("среднего размера");
        instrument[2]= new Tuba("с диметром 30см");
        for (Playable i:instrument){
            i.play();
        }
    }
}
