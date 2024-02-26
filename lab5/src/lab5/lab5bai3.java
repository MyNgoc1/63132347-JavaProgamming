/**
 * 
 */
package lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 */
class SanPham {
    String ten;
    double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }
}
public class lab5bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-------- MENU --------");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap(danhSachSanPham, scanner);
                    break;
                case 2:
                    sapxep(danhSachSanPham);
                    xuat(danhSachSanPham);
                    break;
                case 3:
                    xoa(danhSachSanPham, scanner);
                    break;
                case 4:
                    xuatGiaTrungBinh(danhSachSanPham);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }

    public static void nhap(ArrayList<SanPham> danhSachSanPham, Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            double gia = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line

            SanPham sanPham = new SanPham(ten, gia);
            danhSachSanPham.add(sanPham);
        }
    }

    public static void sapxep(ArrayList<SanPham> danhSachSanPham) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getGia(), o1.getGia());
            }
        };

        Collections.sort(danhSachSanPham, comp);
    }

    public static void xuat(ArrayList<SanPham> danhSachSanPham) {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println("Tên: " + sanPham.getTen() + ", Giá: " + sanPham.getGia());
        }
    }

    public static void xoa(ArrayList<SanPham> danhSachSanPham, Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenSanPhamCanXoa = scanner.nextLine();

        SanPham sanPhamCanXoa = null;
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getTen().equals(tenSanPhamCanXoa)) {
                sanPhamCanXoa = sanPham;
                break;
            }
        }

        if (sanPhamCanXoa != null) {
            danhSachSanPham.remove(sanPhamCanXoa);
            System.out.println("Đã xóa sản phẩm " + tenSanPhamCanXoa);
        } else {
            System.out.println("Không tìm thấy sản phẩm " + tenSanPhamCanXoa);
        }
    }

    public static void xuatGiaTrungBinh(ArrayList<SanPham> danhSachSanPham) {
        if (danhSachSanPham.size() == 0) {
            System.out.println("Danh sách sản phẩm rỗng");
            return;
        }

        double tongGia = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongGia += sanPham.getGia();
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
	}

}
