package lab4;

import java.util.Scanner;

public class lab4bai1 {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public lab4bai1(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }

    public static void main(String[] args) {
        lab4bai1 sp1 = new lab4bai1("", 0, 0);
        lab4bai1 sp2 = new lab4bai1("", 0, 0);

        System.out.println("Nhập thông tin sản phẩm 1:");
        sp1.nhap();

        System.out.println("Nhập thông tin sản phẩm 2:");
        sp2.nhap();

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}