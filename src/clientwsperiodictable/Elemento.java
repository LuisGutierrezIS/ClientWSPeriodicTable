package clientwsperiodictable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Elemento {
    @Element
    private String AtomicNumber;
    @Element
    private String Symbol;
    @Element
    private String ElementName;
    @Element
    private String AtomicWeight;
    @Element
    private String BoilingPoint;
    @Element
    private String IonisationPotential;
    @Element
    private String EletroNegativity;
    @Element
    private String AtomicRadius;
    @Element
    private String MeltingPoint;
    @Element
    private String Density;
    
    public Elemento(){
        super();
    }
    public Elemento(String atomicNumber, String elementName, String Symbol, String AtomicWeight, String boilingPoint, String ionisationPotential, String EletroNegativity, String atomicRadius, String meltingPoint, String density) {
        this.AtomicNumber = atomicNumber;
        this.ElementName = elementName;
        this.Symbol = Symbol;
        this.AtomicWeight = AtomicWeight;
        this.BoilingPoint = boilingPoint;
        this.IonisationPotential = ionisationPotential;
        this.EletroNegativity = EletroNegativity;
        this.AtomicRadius = atomicRadius;
        this.MeltingPoint = meltingPoint;
        this.Density = density;
    }

    public String getAtomicNumber() {
        return AtomicNumber;
    }

    public String getElementName() {
        return ElementName;
    }

    public String getSymbol() {
        return Symbol;
    }

    public String getAtomicWeight() {
        return AtomicWeight;
    }

    public String getBoilingPoint() {
        return BoilingPoint;
    }

    public String getIonisationPotential() {
        return IonisationPotential;
    }

    public String getEletroNegativity() {
        return EletroNegativity;
    }

    public String getAtomicRadius() {
        return AtomicRadius;
    }

    public String getMeltingPoint() {
        return MeltingPoint;
    }

    public String getDensity() {
        return Density;
    }

    public void setAtomicNumber(String atomicNumber) {
        this.AtomicNumber = atomicNumber;
    }

    public void setElementName(String elementName) {
        this.ElementName = elementName;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public void setAtomicWeight(String AtomicWeight) {
        this.AtomicWeight = AtomicWeight;
    }

    public void setBoilingPoint(String boilingPoint) {
        this.BoilingPoint = boilingPoint;
    }

    public void setIonisationPotential(String ionisationPotential) {
        this.IonisationPotential = ionisationPotential;
    }

    public void setEletroNegativity(String EletroNegativity) {
        this.EletroNegativity = EletroNegativity;
    }

    public void setAtomicRadius(String atomicRadius) {
        this.AtomicRadius = atomicRadius;
    }

    public void setMeltingPoint(String meltingPoint) {
        this.MeltingPoint = meltingPoint;
    }

    public void setDensity(String density) {
        this.Density = density;
    }
    
}
