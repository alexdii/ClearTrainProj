package newPackage;

public class GetCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Mercedes");
        car1.setColor("black");
        car1.setPower(250);
        car1.getInfo();

        Car car2 = new Car();
        car2.setName("BMW");
        car2.setColor("white");
        car2.setPower(350);
        car2.getInfo();

        Moto moto = new Moto();
        moto.setName("Harley Davidson");
        moto.setPrice(10000);
        moto.getInfo();

        TV tv = new TV();
        tv.setName("Sony");
        tv.setPrice(5000);
        tv.getInfo();

        Audio au = new Audio();
        au.setName("Benq & Olufsen");
        au.setPrice(15000);
        au.getInfo();

    }
}

class Car{
    private String name;
    private String color;
    private int power;

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void getInfo(){
        System.out.println("My car is "+name+", "+color+" color, "+power+" h/p");

    }
}

class Moto{
    private String name;
    private int price;

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void getInfo(){
        System.out.println("My newPackage.Moto is "+name+", that price is "+price+" US dollars");
    }
}

class TV{
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void getInfo(){
        System.out.println("My newPackage.TV is "+name+", price is "+price+" US dollars");
    }
}

class Audio{
    private String name;
    private int price;
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void getInfo(){
        System.out.println("My audio system is "+name+", price is "+price+" US dollars");
    }
}
