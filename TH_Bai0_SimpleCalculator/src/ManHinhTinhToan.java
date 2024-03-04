import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TxtA;
	private JTextField TxtKetQua;
	private JTextField TxtB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhTinhToan frame = new ManHinhTinhToan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setTitle("Chuong Trinh Tinh Toan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(83, 56, 149, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai(b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(83, 117, 149, 24);
		contentPane.add(lblNhpSTh);
		
		TxtA = new JTextField();
		TxtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TxtA.setBounds(268, 60, 173, 20);
		contentPane.add(TxtA);
		TxtA.setColumns(10);
		
		TxtKetQua = new JTextField();
		TxtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TxtKetQua.setColumns(10);
		TxtKetQua.setBounds(268, 223, 173, 20);
		contentPane.add(TxtKetQua);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xu li cong o day
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(108, 172, 69, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(199, 172, 69, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(289, 172, 69, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(379, 172, 69, 23);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả tính toán");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(83, 221, 149, 24);
		contentPane.add(lblKtQu);
		
		TxtB = new JTextField();
		TxtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		TxtB.setColumns(10);
		TxtB.setBounds(268, 119, 173, 20);
		contentPane.add(TxtB);
	}
	protected void HamXuLyChia() {
		// TODO Auto-generated method stub
			String str_soA = TxtA.getText();
			String str_soB = TxtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double thuong = soA/soB;
			TxtKetQua.setText(String.valueOf(thuong));
	}

		protected void HamXuLyNhan() {
		// TODO Auto-generated method stub
			String str_soA = TxtA.getText();
			String str_soB = TxtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double tich = soA*soB;
			TxtKetQua.setText(String.valueOf(tich));
	}

		protected void HamXuLyTru() {
		// TODO Auto-generated method stub
			String str_soA = TxtA.getText();
			String str_soB = TxtB.getText();
			double soA = Double.parseDouble(str_soA);
			double soB = Double.parseDouble(str_soB);
			double hieu = soA-soB;
			TxtKetQua.setText(String.valueOf(hieu));
	}

		protected void HamXuLyCong() {
		// TODO Auto-generated method stub
		String str_soA = TxtA.getText();
		String str_soB = TxtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA+soB;
		TxtKetQua.setText(String.valueOf(tong));
		
	}
}
