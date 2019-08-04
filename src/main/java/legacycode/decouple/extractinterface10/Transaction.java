package legacycode.decouple.extractinterface10;

public abstract class Transaction {
    Payrolldatebase db;
    Transactionlog log;

    public Transaction(Payrolldatebase db, Transactionlog log) {
        this.db = db;
        this.log = log;
    }

    public abstract void run();
}
