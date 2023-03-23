/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CX {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private double doanhThu;

    public CX() {
    }

    public CX(int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public float getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap ma so chuyen: ");
        maSoChuyen = nhap.nextInt();
        System.out.print("Nhap ho ten tai xe: ");
        hoTenTaiXe = nhap.nextLine();
        nhap.nextLine();
        System.out.print("Nhap so xe: ");
        soXe = nhap.nextInt();
    }
    
    public void Xuat(){
        System.out.println("Ma so chuyen: " +maSoChuyen);
        System.out.println("Ho ten tai xe: " +hoTenTaiXe);
        
        System.out.println("So xe: " +soXe);
    }
    
    public void doanhThu(float doanhthu){
        System.out.println("Doanh thu");
    }
}
