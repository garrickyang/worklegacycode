package legacycode.changecode.wrapclass;

public interface Vehicle {
    public String move();
    public void accept(Visitor visitor);
}
