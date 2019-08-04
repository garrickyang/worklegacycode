package after.legacycode.changecode.newmethod;

import java.util.Iterator;
import java.util.List;

public class TransactionGate {
    private TransactionBuilder transactionBuilder;

    public TransactionGate(){
        transactionBuilder = new TransactionBuilder();
    }

    //how to add code to remove duplicate object from transactionBuilder before call postDate?
    public void postEntries(List<Entry> entries){
        for(Iterator<Entry> it = entries.iterator(); it.hasNext();){
            Entry entry = (Entry) it.next();
            entry.postDate();
        }
        transactionBuilder.getManagerList().add(entries);
    }
}
