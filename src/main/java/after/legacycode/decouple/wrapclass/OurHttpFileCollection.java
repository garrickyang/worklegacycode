package after.legacycode.decouple.wrapclass;

import java.util.List;
import java.util.Map;

public class OurHttpFileCollection {
    private Map<String, HttpFosterdFileWrapper> fileWrapCollection;

    public OurHttpFileCollection(HttpFileCollection fileCollection) {
        wrapHttpFileCollection(fileCollection);
    }

    private void wrapHttpFileCollection(HttpFileCollection fileCollection) {
        //wrap httpFileCllection to ourHttpCollection
    }

    public String[] getNameList() {
        return (String[]) fileWrapCollection.keySet().toArray();
    }

    public HttpFosterdFileWrapper getFile(String name) {
        return fileWrapCollection.get(name);
    }
}
