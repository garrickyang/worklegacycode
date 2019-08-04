package legacycode.changecode.wrapclass;

public class CarDecorator implements  Vehicle{
    private Car car;

    public CarDecorator(Car car){
        this.car=car;
    }

    public String move() {
        return "Decorator for" + this.car.move();
    }

    public void accept(Visitor visitor) {

    }
}
