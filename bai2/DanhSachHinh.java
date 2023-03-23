/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DanhSachHinh {
    List<Hinh> hinh;

    public DanhSachHinh() {
    }
    
    public void Them(Hinh hh){
       hinh.add(hh);
    }
    
    public void InDanhSach(){
        for(Hinh h : hinh){
            h.dienTich();
        }
    }
}
