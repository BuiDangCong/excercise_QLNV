package quanlinhanvien;

import java.awt.BorderLayout;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
//        TruyVan listNhanvien = new TruyVan();
//        listNhanvien.inputs();
//        listNhanvien.outputs();
        menu();

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        DanhSachNhanVien listNhanVien = new DanhSachNhanVien();
        int choose = 0;

        while (true) {
            System.out.println("____________________");
            System.out.println("0.Load daTa :");
            System.out.println("1.Nhap danh sach : ");
            System.out.println("2.Xuat danh sach : ");
            System.out.println("3.Tim kiem nhan vien theo ma :");
            System.out.println("4.Sap xep nhan vien theo luong :");
            System.out.println("5.Thoat chuong trinh :");
            System.out.println("____________________");
            System.out.print("chon : ");
            choose = sc.nextInt();
            switch (choose) {
               case 5: {
                    return;
                }
                case 4:
                    listNhanVien.getSortByLuong();
                    listNhanVien.outputs();
                    break;

                case 0:
                    listNhanVien.daTa();
                    break;

                case 1:
                    listNhanVien.inputs();
                    break;
                case 2:
                    listNhanVien.outputs();
                    break;
                case 3:
                    System.out.println("Nhap ma nhan vien can tim : ");
                    String findMaNV = sc.next();
                    int oder = listNhanVien.findByID(findMaNV);
                    if (oder < 0) {
                        System.out.println("Khong tim thay nhan vien");
                        break;

//                    
//                    case 4:
//                     listNhanVien. getSortByLuong();
//                     listNhanVien.outputs();
//                
                    }
                    break;

                default:
                    throw new AssertionError();
            }

        }
    }
}
