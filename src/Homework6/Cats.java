package HomeWork6;

public class Cats extends Animals{
    protected static int longswim = 0;
    protected static int longjamp = 2;
    protected static int longRun = 200;

    public Cats (String name, String color, int age) {
        super (name, color, age);
    }
    public boolean Run (int i) {
        if(i<this.longRun){
            return  true;
        }
        return false;
    }

    public boolean Jamp (double i) {
        if(i<this.longjamp){
            return  true;
        }
        return false;
    }

    public boolean swim (int i) {
        if(i<this.longswim){
            return  true;
        }
        return false;
    }


}

