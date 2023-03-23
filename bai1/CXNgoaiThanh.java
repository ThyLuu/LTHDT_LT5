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
public class CXNgoaiThanh extends CX{
    private String noiDen;
    private int soNgay;

    public CXNgoaiThanh() {
    }

    public CXNgoaiThanh(String noiDen, int soNgay, int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public void XuatCXNgoaiThanh() {
        System.out.println("Noi den: " +noiDen);
        System.out.println("So ngay: " +soNgay);
    }

    public void NhapCXNgoaiThanh() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap noi den: ");
        noiDen = nhap.nextLine();
        System.out.print("Nhap so ngay di duoc: ");
        soNgay = nhap.nextInt();
    }

    @Override
    public void doanhThu(float doanhthu) {
        System.out.println("Day la doanh thu Chuyen xe ngoai thanh");
    }
    
}
