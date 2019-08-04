package legacycode.decouple.wrapclass;

import java.io.InputStream;

public class HttpPostedFile {
    public String getFilename() {
        return "";
    }

    public int getContentLength() {
        return 1000000;
    }

    public InputStream getInputStream() {
        return null;
    }
}
