/**
 * 
 */
package lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 */
public class lab5bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> danhSachHoTen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-------- MENU --------");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    nhap(danhSachHoTen, scanner);
                    break;
                case 2:
                    xuat(danhSachHoTen);
                    break;
                case 3:
                    ngaunhien(danhSachHoTen);
                    break;
                case 4:
                    sapxep(danhSachHoTen);
                    break;
                case 5:
                    xoa(danhSachHoTen, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 6);
    }

    public static void nhap(ArrayList<String> danhSachHoTen, Scanner scanner) {
        System.out.print("Nhập số lượng họ và tên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ và tên thứ " + (i + 1) + ": ");
            String hoTen = scanner.nextLine();
            danhSachHoTen.add(hoTen);
        }
    }

    public static void xuat(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void ngaunhien(ArrayList<String> danhSachHoTen) {
        Collections.shuffle(danhSachHoTen);
        System.out.println("Danh sách ngẫu nhiên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void sapxep(ArrayList<String> danhSachHoTen) {
        Collections.sort(danhSachHoTen, Collections.reverseOrder());
        System.out.println("Danh sách sắp xếp giảm dần:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    public static void xoa(ArrayList<String> danhSachHoTen, Scanner scanner) {
        System.out.print("Nhập họ và tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();

        boolean removed = danhSachHoTen.remove(hoTenCanXoa);
        if (removed) {
            System.out.println("Đã xóa họ và tên " + hoTenCanXoa);
        } else {
            System.out.println("Không tìm thấy họ và tên " + hoTenCanXoa);
        }
	}

}
