package Cars;

public class Driver {
    public Driver(Car car) {
        this.car = car;
    }

    private  Car car;

    public Car getC() {
        return car;
    }

    public void setC(Car c) {
        this.car = c;
    }

    public void Drive(int n)
    {
       double p=  car.getPosition() ;
               p+= n;
    car.setPosition(p);


    }


}
