package after.legacycode.decouple.wrapclass;

import java.io.InputStream;

public interface HttpPostedFileInteface {
    String getFilename();
    InputStream getInputStream();
    int getContentLengh();
}
