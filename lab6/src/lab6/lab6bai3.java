package lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class lab6bai3 {
    private String hoTen;
    private String email;
    private String soDienThoai;
    private String cmnd;

    public lab6bai3(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(regex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\d{10}$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<lab6bai3> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("CMND: ");
            String cmnd = scanner.nextLine();

            lab6bai3 sinhVien = new lab6bai3(hoTen, email, soDienThoai, cmnd);
            danhSachSinhVien.add(sinhVien);
        }

        System.out.println("Danh sách sinh viên:");
        for (lab6bai3 sinhVien : danhSachSinhVien) {
            System.out.println("Họ tên: " + sinhVien.getHoTen());
            System.out.println("Email: " + sinhVien.getEmail());
            System.out.println("Số điện thoại: " + sinhVien.getSoDienThoai());
            System.out.println("CMND: " + sinhVien.getCmnd());
            System.out.println();
        }
    }
}