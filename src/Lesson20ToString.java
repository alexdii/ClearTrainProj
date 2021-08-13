public class Lesson20ToString {
    public static void main(String[] args) {
        Human1 h1 = new Human1("Bob", 45);
        System.out.println(h1);          //  System.out.println(h1.toString) -> скрыто
    }
}

class Human1{
    private String name;
    private int age;

    public Human1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {          // переопределение метода toString, который наследуется по умолчанию
        return name+","+age;            // из класса Object. и класс Object и метод toString мы не видим, но они есть
    }
}