import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Servlet", urlPatterns = "/time")
public class ServerTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Date now = new Date();
        writer.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Timer</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div style=\"width: 100%;text-align: center;padding-top:10em;\">\n" +
                "    <h1 style=\"color: red;\" id=\"time\"></h1>\n" +
                "</div>\n" +
                "<script>\n" +
                "    function timeCount() {\n" +
                "        let today = new Date();\n" +
                "        let h = today.getHours();\n" +
                "        let m = today.getMinutes();\n" +
                "        let s = today.getSeconds();\n" +
                "        let day = today.getDay();\n" +
                "        let month = today.getMonth();\n" +
                "        let year = today.getFullYear();\n" +
                "\n" +
                "        document.getElementById(\"time\").innerHTML =\n" +
                "            day + \"/\" + month + \"/\" + year +\n" +
                "            \"<br>\" +\n" +
                "            h + \" : \" + m + \" : \" + s;\n" +
                "        setTimeout(timeCount, 1000)\n" +
                "    }\n" +
                "    timeCount();\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>");
    }
}
