public class TrainAgain {
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setName("Alex");
        man1.setAge(50);
        man1.sayHallo();
        man1.getInfo();

        Man man2 = new Man();
        man2.setAge(51);
        man2.setName("John");
        man2.sayHallo();
        man2.getInfo();
    }
}

class Man {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("My name is " + name + ", I'm " + age + " years old");
    }

    public void sayHallo() {
        System.out.println("Hallo");
    }
}

