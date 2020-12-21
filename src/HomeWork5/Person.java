package HomeWork5;

public class Person {
    String Name;
    String position;
    String email;
    String telefon;
    int salary;
    int age;

    public Person (String name, String position, String email, String telefon, int salary, int age) {
        this.Name = name;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
/*public printInfo(){
      System.out.println (name);
      System.out.println (position);
      System.out.println (email);
      System.out.println (telefon);
      System.out.println (salary);
      System.out.println (age);

  }*/

/*    * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
    Пример:
    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    persArray[1] = new Person(...);
...
    persArray[4] = new Person(...);

* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    string Name;*/

}
