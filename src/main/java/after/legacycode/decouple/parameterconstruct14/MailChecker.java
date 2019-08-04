package after.legacycode.decouple.parameterconstruct14;

public class MailChecker {
    private MailReceiver receiver;
    private int checkPeriodSeconds;

    public MailChecker(int checkPeriodSeconds) {
        this(checkPeriodSeconds, new MailReceiver());
    }

    public MailChecker(int checkPeriodSeconds, MailReceiver receiver) {
        this.receiver = receiver;
        this.checkPeriodSeconds = checkPeriodSeconds;
    }

    //task: how to test this method? what if mailrecever is hard to instance?
    public boolean checkMailBox() {
        boolean status = false;
        status = receiver.checkMailServer();
        return status;
    }
}
