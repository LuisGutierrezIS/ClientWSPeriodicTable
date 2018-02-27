/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsperiodictable;


import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class NewDataSet1 {

    @Element
    private Elemento Table;

    public Elemento getTable() {
        return Table;
    }

    public void setTable(Elemento Table) {
        this.Table = Table;
    }


   



}
