package quanlinhanvien;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSachNhanVien {

    Scanner scanner = new Scanner(System.in);

    public static ArrayList<NhanVien> listStaff = new ArrayList<>();

    public void inputs() {
        String choose = "Yes";
        do {
            NhanVien nv = new NhanVien();
            nv.input();
            listStaff.add(nv);
            System.out.println("ban muon tiep tuc (Yes/No) : ");
            choose = scanner.next();

        } while (choose.equalsIgnoreCase("Yes"));

    }

    public void outputs() {
        for (NhanVien nhanVien : listStaff) {
            nhanVien.output();

        }
    }
// khởi tạo phương thức tìm vị trí nhân viên theo mã:

    public int findByID(String maNV) {
        for (int i = 0; i < listStaff.size(); i++) {
            NhanVien nv = listStaff.get(i);
            if (nv.getMaNhanVien().equalsIgnoreCase(maNV)) {
                System.out.println("Da tim thay tai vi tri : " + i);
                nv.output();
                return i;

            }
        }
        return -6;
    }

    public void daTa() {
        listStaff.add(new NhanVien("NV01", "Lady Killer 1", 20, 100000));
        listStaff.add(new NhanVien("NV02", "Lady Killer 2", 21, 110000));
        listStaff.add(new NhanVien("NV03", "Lady Killer 3", 22, 120000));
        listStaff.add(new NhanVien("NV04", "Lady Killer 4", 23, 130000));
        listStaff.add(new NhanVien("NV05", "Lady Killer 5", 24, 140000));
        listStaff.add(new NhanVien("NV06", "Lady Killer 6", 25, 150000));
        listStaff.add(new NhanVien("NV07", "Lady Killer 7", 26, 160000));
        listStaff.add(new NhanVien("NV08", "Lady Killer 8", 27, 170000));
        listStaff.add(new NhanVien("NV09", "Lady Killer 9", 28, 180000));
        listStaff.add(new NhanVien("NV10", "Lady Killer 10", 29, 1900000));
        listStaff.add(new NhanVien("NV11", "Lady Killer 11", 30, 200000));
        listStaff.add(new NhanVien("NV12", "Lady Killer 12", 31, 210000));

    }

    public void getSortByLuong() {
        for (int i = 0; i < listStaff.size() - 1; i++) {
            for (int j = i+1 ; j < listStaff.size(); j++) {
                NhanVien nvi = listStaff.get(i);
                NhanVien nvj = listStaff.get(j);
                
            if(nvi.getLuongNhanVien()<nvj.getLuongNhanVien()){
                Collections.swap(listStaff, i, j);
                
            }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
