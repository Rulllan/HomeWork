package HomeWork6;

public class Dogs extends Animals {
    protected static int longswim = 10;
    protected static double longjamp = 0.5;

    protected int longRun;
    public Dogs (String name, String color, int age, int longRun) {
        super (name, color, age);
        this.longRun = longRun;
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
