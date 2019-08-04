package legacycode.changecode.wrapmethod;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Employ {
    private List<Timecard> timecards;
    private List<Date> payPeriod;
    private int payRate;
    private PayDispatcher payDispatcher;
    private Date date;

    public Employ() {
    }

    public Employ(List<Timecard> timecards, List<Date> payPeriod, int payRate, PayDispatcher payDispatcher) {
        this.timecards = timecards;
        this.payPeriod = payPeriod;
        this.payRate = payRate;
        this.payDispatcher = payDispatcher;
    }

    //task: how to add function to log file before dispatch?
    public void pay() {
        Money amount = new Money();
        for (Iterator<Timecard> iterator = timecards.iterator(); iterator.hasNext(); ) {
            Timecard card = iterator.next();
            if (payPeriod.contains(date)) {
                amount.add(card.getHours() * payRate);
            }
            payDispatcher.pay(this, date, amount);
        }

    }

}
