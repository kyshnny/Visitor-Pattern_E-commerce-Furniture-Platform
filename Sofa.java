/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitorpattern_e.commerce;

/**
 *
 * @author shaniamaeucag
 */
public class Sofa implements Furniture {
    private double volume;
    private double distance;

    public Sofa(double volume, double distance) {
        this.volume = volume;
        this.distance = distance;
    }

    public double getVolume() {
        return volume;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
