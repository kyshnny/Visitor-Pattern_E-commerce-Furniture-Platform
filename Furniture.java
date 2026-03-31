/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package visitorpattern_e.commerce;

/**
 *
 * @author shaniamaeucag
 */
public interface Furniture {
    void accept(ShippingVisitor visitor);
}
