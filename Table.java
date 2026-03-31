/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern_e.commerce;

/**
 *
 * @author shaniamaeucag
 */
public class Table implements Furniture {
    private double length;

    public Table(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
