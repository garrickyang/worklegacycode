package after.legacycode.decouple.wrapclass;

import java.io.InputStream;

public class HttpFosterdFileWrapper implements HttpPostedFileInteface {
    private HttpPostedFile httpPostedFile;

    public HttpFosterdFileWrapper(HttpPostedFile httpPostedFile) {
        this.httpPostedFile = httpPostedFile;
    }

    public String getFilename() {
        return httpPostedFile.getFilename();
    }

    public InputStream getInputStream() {
        return httpPostedFile.getInputStream();
    }

    public int getContentLengh() {
        return httpPostedFile.getContentLength();
    }
}
