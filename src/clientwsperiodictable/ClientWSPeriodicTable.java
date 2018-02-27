package clientwsperiodictable;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class ClientWSPeriodicTable {

    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce el nombre de un elemento(íngles): ");
        String elemento=in.nextLine();
        Serializer serializer = new Persister();
        NewDataSet1 element = new NewDataSet1();
        String result = getAtomicNumber(elemento);
        serializer.read(element, result);
        System.out.println("Numero atómico: "+element.getTable().getAtomicNumber());
        System.out.println("Símbolo: "+element.getTable().getSymbol());
        System.out.println("Nombre: "+element.getTable().getElementName());
        System.out.println("Peso atómico: "+element.getTable().getAtomicWeight());
        System.out.println("Punto de ebullición: "+element.getTable().getBoilingPoint());
        System.out.println("Potencial ionizante: "+element.getTable().getIonisationPotential());
        System.out.println("Electronegatividad: "+element.getTable().getEletroNegativity());
        System.out.println("Radio atómico: "+element.getTable().getAtomicRadius());
        System.out.println("Densidad: "+element.getTable().getDensity());
        System.out.println("Punto de fusión: "+element.getTable().getMeltingPoint());
        
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
