/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern_e.commerce;

/**
 *
 * @author shaniamaeucag
 */
public class Chair implements Furniture {
    private double weight;

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
