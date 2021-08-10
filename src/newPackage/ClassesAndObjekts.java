package newPackage;

public class ClassesAndObjekts {
    public static void main(String[] args) {
        Person person1 = new Person();                          // создание первого объекта класса newPackage.Person
        person1.setNameAndAge("John", 50);
        person1.sayHello();                                     // вызов метода sayHello для Person1
        person1.speak();                                        // вызов метода speak для Person1
        int year1 = person1.calculateYearsToRetirement();

        Person person2 = new Person();                          // создание второго объекта класса newPackage.Person
        String s1 = "Bob";
        person2.setNameAndAge(s1, 45);
        person2.sayHello();                                     // вызов метода sayHello для Person2
        person2.speak();                                        // вызов метода speak для Person2
        int year2 = person2.calculateYearsToRetirement();

        System.out.println("John to retirement: "+year1+" years");
        System.out.println("Bob to retirement: "+year2+" years");
    }
}

class Person{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    void getName(){

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
