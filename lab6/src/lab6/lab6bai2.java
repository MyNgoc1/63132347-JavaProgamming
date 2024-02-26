package lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class lab6bai2 {
    private String tenSp;
    private double donGia;
    private String hang;

    public lab6bai2(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void xuatThongTin() {
        System.out.println("Tên: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<lab6bai2> danhSachSanPham = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
            System.out.print("Tên: ");
            String tenSp = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line còn lại
            System.out.print("Hãng: ");
            String hang = scanner.nextLine();

            lab6bai2 sp = new lab6bai2(tenSp, donGia, hang);
            danhSachSanPham.add(sp);
        }

        System.out.println("Các sản phẩm có hãng là Nokia:");
        for (lab6bai2 sp : danhSachSanPham) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuatThongTin();
            }
        }
    }
}