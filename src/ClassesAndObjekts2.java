public class ClassesAndObjekts2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(50);
        person1.speak();

    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("This figure is not mast be empty!");
        }else{
            name = userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if(userAge<0){
            System.out.println("Age mast be more than zero!");
        }else{
            age = userAge;
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
