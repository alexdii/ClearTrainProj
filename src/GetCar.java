public class GetCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Mersedes");
        car1.setColor("black");
        car1.setPower(250);
        car1.getInfo();

        Car car2 = new Car();
        car2.setName("BMW");
        car2.setColor("white");
        car2.setPower(350);
        car2.getInfo();
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

