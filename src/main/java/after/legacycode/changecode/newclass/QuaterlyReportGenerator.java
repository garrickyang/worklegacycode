package after.legacycode.changecode.newclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuaterlyReportGenerator extends Generate {
    //task: add header for reprot table
    public String generateReport() {
        String sql = "select * from reprot";

        ResultSet resultSet = null;
        try {
            resultSet = ObjectDb.populate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String pageText = "";
        pageText += "<html><head><title>Quaterly Report " + "</title></head><table>";

        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    pageText += "<tr>";
                    pageText += "<td>" + resultSet.getString(1) + "</td>";
                    pageText += "<td>" + resultSet.getString(2) + "</td>";
                    pageText += "<td>" + resultSet.getString(3) + "</td>";
                    pageText += "</tr>";
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            pageText += "No results";
        }
        pageText += "</table>";
        pageText += "</body";
        pageText += "</html>";

        return pageText;
    }

}
