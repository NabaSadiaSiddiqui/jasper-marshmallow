package foo.twiddle.jasper;

import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReport {

    public SimpleReport() {
        JasperPrint jasperPrint = null;
        try {
            JasperCompileManager.compileReportToFile("reports/treats.jrxml");
            jasperPrint = JasperFillManager.fillReport("reports/treats.jasper", new HashMap());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint);
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    	new SimpleReport();
    }

}
