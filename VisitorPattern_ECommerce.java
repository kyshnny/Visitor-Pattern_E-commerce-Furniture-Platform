/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitorpattern_e.commerce;

import java.util.*;
/**
 *
 * @author shaniamaeucag
 */
public class VisitorPattern_ECommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Furniture> items = new ArrayList<>();

        items.add(new Chair(5));
        items.add(new Table(2.5));
        items.add(new Sofa(10, 20));

        ShippingVisitor visitor = new ShippingCostCalculator();

        for (Furniture item : items) {
            item.accept(visitor);
        }
        
    }
    
}
