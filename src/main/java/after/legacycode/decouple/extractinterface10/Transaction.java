package after.legacycode.decouple.extractinterface10;

public abstract class Transaction {
    Payrolldatebase db;
    TransactionRecorder log;

    public Transaction(Payrolldatebase db, TransactionRecorder log) {
        this.db = db;
        this.log = log;
    }

    public abstract void run();
}
