package legacycode.decouple.extractrewritefactory7;

public class WorkflowEngin {
    private TransactionManager transactionManager;

    public WorkflowEngin() {
        this(new ModelReader(Appconfig.getDryconfiguration()), new XMLStore(Appconfig.getDryconfiguration()));
    }

    public WorkflowEngin(ModelReader reader, Persister persister) {
        this(new TransactionManager(reader, persister));
    }

    public WorkflowEngin(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    //task: how to test this method? what is the dependancy?
    public boolean triggerJob() {
        boolean status = false;
        transactionManager.fetchTransaction();
        return status;
    }
}
