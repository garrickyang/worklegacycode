package legacycode.decouple.parameterconstruct14;

public class MailChecker {
    private MailReceiver receiver;
    private int checkPeriodSeconds;

    public MailChecker(int checkPeriodSeconds){
        this.receiver = new MailReceiver();
    }

    //task: how to test this method? what if mailrecever is hard to instance?
    public boolean checkMailBox(){
        boolean status = false;
        status = receiver.checkMailServer();
        return status;
    }
}
