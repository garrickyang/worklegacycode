package after.legacycode.decouple.staticsetter12;

import java.util.ArrayList;
import java.util.List;

public class CalculateRule {
    private volatile static CalculateRule singleInstance;

    private CalculateRule() {
    }

    public static CalculateRule getInstance() {
        if (singleInstance == null) {
            synchronized (CalculateRule.class) {
                if (singleInstance == null) {
                    singleInstance = new CalculateRule();
                }
            }
        }
        return singleInstance;
    }

    public List getRule() {
        List rules = new ArrayList();
        //connect DB to fetch rule list;
        return rules;
    }

    public void setInstance(CalculateRule calculateRule) {
        singleInstance = calculateRule;
    }
}
