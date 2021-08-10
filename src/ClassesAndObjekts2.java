public class ClassesAndObjekts2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(50);
        person1.sayHello();
        person1.speak();
        int year1 = person1.calculateYearsToRetirement();

        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(35);
        person2.sayHello();
        person2.speak();
        int year2 = person2.calculateYearsToRetirement();

        System.out.println("John to retirement: "+year1+" years");
        System.out.println("Bob to retirement: "+year2+" years");

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("This figure is not mast be empty!");
        }else{
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Age mast be more than zero!");
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){                                                       //  method speak
        System.out.println("My name "+name+", I'm "+age+" years old");
    }
    void sayHello(){                                                    //  method sayHello
        System.out.println("Hello");
    }
}
