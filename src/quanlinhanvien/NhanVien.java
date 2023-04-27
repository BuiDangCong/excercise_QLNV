/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

import java.awt.BorderLayout;
import java.util.Scanner;

public class NhanVien {

    private String maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private double luongNhanVien;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double luongNhanVien) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public void setLuongNhanVien(double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", tuoiNhanVien=" + tuoiNhanVien + ", luongNhanVien=" + luongNhanVien + '}';
    }

    public void input() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ma Nhan vien : ");
        setMaNhanVien(Sc.next());
        System.out.println("Ten Nhan Vien : ");
        Sc = new Scanner(System.in);
        setTenNhanVien(Sc.nextLine());
        System.out.println("Tuoi nhan vien : ");

        setTuoiNhanVien(Sc.nextInt());
        System.out.println("Luong nhan vien : ");

        setLuongNhanVien(Sc.nextDouble());

    }

    public void output() {
        System.out.println("=>" + getMaNhanVien() + "-" + getTenNhanVien() + "-" + getTuoiNhanVien() + "-" + getLuongNhanVien());

    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.input();
        nv.output();
    }
}
