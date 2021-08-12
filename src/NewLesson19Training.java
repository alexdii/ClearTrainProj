public class NewLesson19Training {
    public static void main(String[] args) {
        Hum h1 = new Hum();                  // создание объекта класса
        h1.setAge(50);                      // присвоение значения переменным класса
        h1.setName("Alex");
        h1.getInfo();                      // вызов метода getInfo в методе main

        Hum h2 = new Hum();
        h2.setName("John");
        h2.setAge(51);
        h2.getInfo();
    }
}

class Hum {                                 // создание класса
    private String name;                   // инициализация переменных класса
    private int age;

    public void setName(String name) {     // сеттеры
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){                  // метод getInfo
        System.out.println(name+","+age);
    }





}