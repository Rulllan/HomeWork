package HomeWork6;

public abstract class Animals<run> {
    protected String name;
    private String Color;
    protected int Age;

    public Animals (String name, String color, int age) {
        this.name = name;
        Color = color;
        Age = age;
    }




  /*  public void run1 (int high) {
    }
    public swim (int long) {
    }*/
    @Override
    public String toString () {
        return "Animals{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", Age=" + Age +
                '}';
    }
}