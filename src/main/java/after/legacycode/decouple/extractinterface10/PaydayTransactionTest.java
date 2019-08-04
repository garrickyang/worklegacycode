package after.legacycode.decouple.extractinterface10;

import org.junit.Test;

public class PaydayTransactionTest {
    @Test
    void testPayday() {
        FakeTransactionLog aLog = new FakeTransactionLog();
        PaydayTransaction transaction = new PaydayTransaction(getTransactionDatabse(), aLog);
        transaction.run();
        //assert
    }

    private Payrolldatebase getTransactionDatabse() {
        return new Payrolldatebase();
    }
}
