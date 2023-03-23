/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author Administrator
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CXNoiThanh cxnoithanh = new CXNoiThanh();
        cxnoithanh.Nhap();
        cxnoithanh.NhapCXNnoiThanh();
        cxnoithanh.Xuat();
        cxnoithanh.XuatCXNnoiThanh();
        cxnoithanh.doanhThu(5000000);
        
        CXNgoaiThanh cxngoaithanh = new CXNgoaiThanh();
        cxngoaithanh.Nhap();
        cxngoaithanh.NhapCXNgoaiThanh();
        cxngoaithanh.Xuat();
        cxngoaithanh.NhapCXNgoaiThanh();
        cxngoaithanh.doanhThu(10000000);
    }
    
}
