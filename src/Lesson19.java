public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(50);
        human1.setName("Alex");
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(35);
        human2.setName("John");
        human2.getInfo();
    }
}
class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("My name is "+name+","+"I'm "+age+" years old.");
    }
}
