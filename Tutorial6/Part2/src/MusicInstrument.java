abstract class Instrument{
    protected String name;

    public Instrument(String name){
        this.name = name;
    }

    public abstract void play();
    public abstract void tune();
}

class Guitar extends Instrument{
    public Guitar(String name){
        super(name);
    }

    @Override
    public void play(){
        System.out.println("Strumming the " + name + " strings...");
    }

    @Override
    public void tune(){
        System.out.println("Tuning the " + name + "...");
    }
}

class Piano extends Instrument{
    public Piano(String name){
        super(name);
    }

    @Override
    public void play(){
        System.out.println("Playing the " + name + " keys...");
    }

    @Override
    public void tune(){
        System.out.println("Tuning the " + name + "...");
    }
}

class Drums extends Instrument{
    public Drums(String name){
        super(name);
    }

    @Override
    public void play(){
        System.out.println("Hitting the " + name + "...");
    }

    @Override
    public void tune(){
        System.out.println("Tuning the " + name + "...");
    }
}

public class MusicInstrument{
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar("Guitar");
        instruments[1] = new Piano("Piano");
        instruments[2] = new Drums("Drums");

        for (Instrument instrument : instruments)
        {
            instrument.play();
            instrument.tune();
            System.out.println();
        }
    }
}