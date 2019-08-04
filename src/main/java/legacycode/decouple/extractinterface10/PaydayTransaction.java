package legacycode.decouple.extractinterface10;

import java.util.Date;
import java.util.Iterator;

public class PaydayTransaction extends Transaction {
    private Date date;

    public PaydayTransaction(Payrolldatebase db, Transactionlog log) {
        super(db, log);
    }

    //task: how to test run() without save transaction to database(saveTransaction)?
    public void run() {
        for (Iterator it = db.getEmployees(); it.hasNext(); ) {
            Employee e = (Employee) it.next();
            if (e.isPayday(date)) {
                e.pay();
            }
        }
        log.saveTransaction(this);
    }
}
