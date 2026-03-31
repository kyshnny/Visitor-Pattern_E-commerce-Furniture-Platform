/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern_e.commerce;

import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author shaniamaeucag
 */
public class ShippingCostCalculator implements ShippingVisitor {
    
    private NumberFormat pesoFormat;

    public ShippingCostCalculator() {
        pesoFormat = NumberFormat.getCurrencyInstance(new Locale("en", "PH"));
    }

    @Override
    public void visit(Chair chair) {
        double cost = 250; // flat rate in PHP
        System.out.println("Chair shipping cost: " + pesoFormat.format(cost));
    }

    @Override
    public void visit(Table table) {
        double cost = table.getLength() * 500; // size-based (PHP)
        System.out.println("Table shipping cost: " + pesoFormat.format(cost));
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getVolume() * sofa.getDistance() * 20; // bulky + distance (PHP)
        System.out.println("Sofa shipping cost: " + pesoFormat.format(cost));
    }
    
}
