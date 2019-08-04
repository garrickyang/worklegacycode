package legacycode.changecode.wrapclass;

public class Car implements Vehicle {
    public String move() {

        return "Car moved";
    }

    public void accept(Visitor visitor) {

    }
}
