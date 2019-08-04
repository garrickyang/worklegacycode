package after.legacycode.decouple.primitiveparameter16;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try{
            String content=pupulateContent(request.getRequestURI(),request.getProtocol(),
                    request.getPathInfo(),request.getRemoteAddr());
            out.println(content);
        }finally {
            out.close();
        }
    }

    private String pupulateContent(String uri,String protocol, String pathInfo,String address) {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html>");
        builder.append("<html><head>");
        builder.append("<meta http-quiv='Content-Type' content='text/html;charset=UTF-8'>");
        builder.append("<title>hello, world</titmle></head>");
        builder.append("<body>");
        builder.append("<h1>Hello, world!</h1>");
        builder.append("<p>Request URI:"+uri+"</p>");
        builder.append("<p>Protocol:"+protocol+"</p>");
        builder.append("<p>PathInfo:"+pathInfo+"</p>");
        builder.append("<p>Remote Address:"+address+"</p>");
        builder.append("<p>A random number:"+new Random(11).nextDouble()+"</p>");
        return builder.toString();
    }
}
