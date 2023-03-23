/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class Hinh {
    private float dienTich;

    public Hinh() {
    }

    public Hinh(float dienTich) {
        this.dienTich = dienTich;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void dienTich(){
        System.out.println("Day la dien tich");
    }
}
