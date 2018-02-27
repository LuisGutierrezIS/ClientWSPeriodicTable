package clientwsperiodictable;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ClientWSPeriodicTable {

    public static void main(String[] args) throws Exception {
        Serializer serializer = new Persister();
        NewDataSet1 element = new NewDataSet1();
        String result = getAtomicNumber("gold");
        serializer.read(element, result);
        System.out.println(element.getTable().getAtomicNumber());
        //System.out.println(getAtomicNumber("gold"));
        //System.out.println(getAtomicWeight("gold"));
        //System.out.println(getAtoms());
        //System.out.println(getElementSymbol_1("gold"));
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    
    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol_1(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
}
