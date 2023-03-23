/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class HinhTron extends Hinh{
    private float r;

    public HinhTron(float r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }

    @Override
    public void dienTich() {
        float dt;
        dt = (float)(4*Math.PI*this.r*this.r);
        System.out.println("Dien tich hinh tron: " +dt);
    }

    
    
}
