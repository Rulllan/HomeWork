package HomeWork5;

public class Main {
    public static void main (String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        persArray[1] = new Person("Petrov Ivan", "Engineer", "ivivan@mailbox.com", "892312454", 35000, 43);
        persArray[2] = new Person("Sidorov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 36000, 35);
        persArray[3] = new Person("Grshev Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 37000, 40);
        persArray[4] = new Person("Smit Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 35000, 55);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age>40){
                System.out.println (persArray[i]);

            }

        }
    }

}
