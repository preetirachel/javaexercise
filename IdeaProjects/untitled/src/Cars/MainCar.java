package Cars;

public class MainCar {
    public static void main(String[] args) {
        Car c=new Car("red","zero1","Honda",345);
        System.out.println(c.IncreaseMiles(12));


        Driver d= new Driver(c);
        d.Drive(8);

    Positions p= new Positions(20,34);
        System.out.println(p.getX());
        System.out.println(p.getY());



    }
}
