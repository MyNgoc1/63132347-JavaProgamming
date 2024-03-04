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

public class MainTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblNhpSC;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTinhToan frame = new MainTinhToan();
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
	public MainTinhToan() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC HAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NHẬP SỐ A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 104, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSB = new JLabel("NHẬP SỐ B");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(10, 71, 104, 32);
		contentPane.add(lblNhpSB);
		
		txtA = new JTextField();
		txtA.setBounds(172, 19, 159, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(172, 79, 159, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(172, 136, 159, 20);
		contentPane.add(txtC);
		
		JButton btnNewButton = new JButton("KẾT QUẢ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inKQ();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 198, 104, 23);
		contentPane.add(btnNewButton);
		
		lblNhpSC = new JLabel("NHẬP SỐ C");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(10, 125, 104, 32);
		contentPane.add(lblNhpSC);
		
		txtKetQua = new JTextField();
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(172, 201, 159, 20);
		contentPane.add(txtKetQua);
	}
	protected void inKQ() {
		// TODO Auto-generated method stub
		String str_a = txtA.getText();
		String str_b = txtB.getText();
		String str_c = txtC.getText();
		double a = Double.parseDouble(str_a);
		double b = Double.parseDouble(str_b);
		double c = Double.parseDouble(str_c);
		String ketqua = null;
        
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
        // tính delta
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1 
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
         
        txtKetQua.setText(ketqua);
	}
}
