package HomeWork6;

public class Main {
 /*   1. Создать классы Собака и Кот с наследованием от класса Животное.
            2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
            3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
            4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
            5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/
 public static void main (String[] args) {
         Cats Сat = new Cats ("Матроскин","blue",5);
         Dogs Dog = new Dogs ("Шарик","braun",5, 400);
         Dogs Dog2 = new Dogs ("Барбос","braun",5, 600);

         extracted (Dog, 400);
         extracted (Dog2, 400);

         extractedjamp (Dog, 4);
         extractedjampCat (Сat, 4);
         extractedjamp (Dog2, 0.2);

         extractedswim (Dog, 400);
         extractedswim (Dog2, 400);

 }

    private static void extracted (Dogs Dog,int l) {
        if (Dog.Run (l) ) {
            System.out.println (Dog.name + " пробежал " + l);
        }else {
            System.out.println (Dog.name + " не смог столько бегать " + l);}
    }

    private static void extractedjamp (Dogs Dog,double l) {
        if (Dog.Jamp (l) ) {
            System.out.println (Dog.name + " прыгнул " + l);
        }else {
            System.out.println (Dog.name + " не смог прыгнуть " + l);}
    }

    private static void extractedswim (Dogs Dog,int l) {
        if (Dog.swim (l) ) {
            System.out.println (Dog.name + " плавал " + l);
        }else {
            System.out.println (Dog.name + " утонул " + l);}
    }
    private static void extractedjampCat (Cats Cat,int l) {
        if (Cat.Run (l) ) {
            System.out.println (Cat.name + " пробежал " + l);
        }else {
            System.out.println (Cat.name + " не смог столько бегать " + l);}
    }

    private static void extractedjampcat (Cats Cat,double l) {
        if (Cat.Jamp (l) ) {
            System.out.println (Cat.name + " прыгнул " + l);
        }else {
            System.out.println (Cat.name + " не смог прыгнуть " + l);}
    }

    private static void extractedswimcat (Cats Cat,int l) {
        if (Cat.swim (l) ) {
            System.out.println (Cat.name + " плавал " + l);
        }else {
            System.out.println (Cat.name + " утонул " + l);}
    }
}
