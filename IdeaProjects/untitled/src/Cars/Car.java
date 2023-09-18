package Cars;

public class Car {

    private String colour;
    private String reg;
    private String make;
    private double miles;
    private double position;
    public Car(String colour, String reg, String make, double miles) {
        this.colour = colour;
        this.reg = reg;
        this.make = make;
        this.miles = miles;

    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }



    public double IncreaseMiles(int m) {
        m +=m;
        return m;

    }

    public double get() {
        return miles;

    }

    public void set() {
        this.miles = miles;


}

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
