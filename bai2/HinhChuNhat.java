/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat extends Hinh{
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }

    @Override
    public void dienTich() {
        float dt;
        dt = this.cd * this.cr;
        System.out.println("Dien tich hinh chu nhat: " +dt);
    }

    

    

    
    
}
