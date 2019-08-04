package after.legacycode.decouple.wrapclass;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UploadFacility {
    private static final int MIN_LEN = 100000;

    //how to test this meothod, we cannot extends httpfilCollection
    public List<InputStream> getTestStream(OurHttpFileCollection files) {
        List<InputStream> list = new ArrayList<InputStream>();
        for (String name : files.getNameList()) {
            HttpPostedFile file = files.getFile(name);
            if (file.getFilename().endsWith(".test") || (file.getFilename().endsWith(".txt") && file.getContentLength() > MIN_LEN)) {
                //...
                list.add(file.getInputStream());
                //...
            }
        }
        return list;
    }
}
