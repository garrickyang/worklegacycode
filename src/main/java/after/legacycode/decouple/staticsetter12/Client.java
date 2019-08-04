package after.legacycode.decouple.staticsetter12;

import after.legacycode.changecode.wrapmethod.Timecard;

import java.util.List;

public class Client {

    //task: how to test without connect db in calculateRule.getRule()?
    public double payCalculator(Timecard timecard) {
        CalculateRule calculateRule = CalculateRule.getInstance();
        List rules = calculateRule.getRule();
        return calculateByRule(rules, timecard);
    }

    private double calculateByRule(List rules, Timecard timecard) {
        double amount = 0;
        //calculate arithmatic
        return amount;
    }
}
