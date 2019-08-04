package legacycode.decouple.primitiveparameter16;

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
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-quiv='Content-Type' content='text/html;charset=UTF-8'>");
            out.println("<title>hello, world</titmle></head>");
            out.println("<body>");
            out.println("<h1>Hello, world!</h1>");
            out.println("<p>Request URI:"+request.getRequestURI()+"</p>");
            out.println("<p>Protocol:"+request.getProtocol()+"</p>");
            out.println("<p>PathInfo:"+request.getPathInfo()+"</p>");
            out.println("<p>Remote Address:"+request.getRemoteAddr()+"</p>");
            out.println("<p>A random number:"+new Random(11).nextDouble()+"</p>");
        }finally {
            out.close();
        }
    }
}
