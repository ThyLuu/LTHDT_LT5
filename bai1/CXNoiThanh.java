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
public class CXNoiThanh extends CX{
    private int soTuyen;
    private int soKM;

    public CXNoiThanh() {
    }

    public CXNoiThanh(int soTuyen, int soKM, int maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    public void XuatCXNnoiThanh() {
        System.out.println("So tuyen: " +soTuyen);
        System.out.println("So km: " +soKM);
    }

    public void NhapCXNnoiThanh() {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so tuyen: ");
        soTuyen = nhap.nextInt();
        System.out.print("Nhap so km di duoc: ");
        soKM = nhap.nextInt();
    }

    @Override
    public void doanhThu(float doanhthu) {
        System.out.println("Day la doanh thu Chuyen xe noi thanh");
    }

    

    
}
