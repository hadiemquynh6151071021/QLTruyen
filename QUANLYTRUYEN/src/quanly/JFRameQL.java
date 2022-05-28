package quanly;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.ls.LSException;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;


public class JFRameQL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFRameQL frame = new JFRameQL();
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
	public JFRameQL() {
		setTitle("Story Rental Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1009, 771);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 10, 985, 104);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("Phi\u1EBFu M\u01B0\u1EE3n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelPM(panel_1);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_1_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1_1.setBounds(399, 10, 195, 75);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("T\u00E1c Gi\u1EA3");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelTG(panel_1);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_1_1_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1_1_1.setBounds(586, 10, 195, 75);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Truy\u1EC7n");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelT(panel_1);
			}
		});
		btnNewButton_1_1_1_1.setBounds(205, 10, 195, 75);
		panel.add(btnNewButton_1_1_1_1);
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton_1_1_1_1.setBackground(new Color(32, 178, 170));
		
		JButton btnNewButton = new JButton("Nh\u00E2n Vi\u00EAn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelNV(panel_1);
			}
		});
		btnNewButton.setBounds(10, 10, 195, 75);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JButton btncGi = new JButton("\u0110\u1ED9c Gi\u1EA3");
		btncGi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				creaPanelDG(panel_1);
			}
		});
		btncGi.setBounds(781, 10, 195, 75);
		panel.add(btncGi);
		btncGi.setForeground(Color.BLACK);
		btncGi.setFont(new Font("Tahoma", Font.BOLD, 26));
		btncGi.setBackground(new Color(32, 178, 170));
	}
	public void creaPanelNV(JPanel x) {
		x.setVisible(false);
		JTextField txtmanv;
		JTextField txttennv;
		JTextField txtemail;
		JTextField txtphone;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		JTextField txtaddress;
		JTextField txtnn;
		JTable table;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 nh\u00E2n vi\u00EAn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 24, 96, 29);
		panel_2.add(lblNewLabel);
		
		JComboBox boxsex = new JComboBox();
		boxsex.setBackground(SystemColor.info);
		boxsex.setModel(new DefaultComboBoxModel(new String[] {"Nam", "N\u1EEF"}));
		boxsex.setBounds(157, 178, 62, 34);
		panel_2.add(boxsex);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 126, 96, 29);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn nh\u00E2n vi\u00EAn");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 75, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 178, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 232, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 286, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(122, 277, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(174, 277, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(226, 277, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(130, 292, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(183, 292, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(233, 292, 26, 29);
		panel_2.add(txtnam);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 338, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Ch\u1EE9c v\u1EE5");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 394, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		txtmanv = new JTextField();
		txtmanv.setBackground(SystemColor.info);
		txtmanv.setBounds(130, 25, 141, 29);
		panel_2.add(txtmanv);
		txtmanv.setColumns(10);
		
		txttennv = new JTextField();
		txttennv.setColumns(10);
		txttennv.setBackground(SystemColor.info);
		txttennv.setBounds(130, 76, 141, 29);
		panel_2.add(txttennv);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBackground(SystemColor.info);
		txtemail.setBounds(130, 132, 141, 29);
		panel_2.add(txtemail);
		
		txtphone = new JTextField();
		txtphone.setColumns(10);
		txtphone.setBackground(SystemColor.info);
		txtphone.setBounds(130, 238, 141, 29);
		panel_2.add(txtphone);
		
		
		txtaddress = new JTextField();
		txtaddress.setColumns(10);
		txtaddress.setBackground(SystemColor.info);
		txtaddress.setBounds(130, 344, 141, 29);
		panel_2.add(txtaddress);
		
		txtnn = new JTextField();
		txtnn.setColumns(10);
		txtnn.setBackground(SystemColor.info);
		txtnn.setBounds(130, 395, 141, 29);
		panel_2.add(txtnn);
		
		JButton btlammoi = new JButton("L\u00E0m m\u1EDBi");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmanv.setText("");
				txttennv.setText("");
				txtemail.setText("");
				txtphone.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
				txtaddress.setText("");
				txtnn.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(111, 460, 85, 21);
		panel_2.add(btlammoi);
		

		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"MANV", "TENNV", "EMAIL", "GIOITINH", "SDT", "NGAYSINH","THANGSINH","NAMSINH", "DIACHI", "CHUCVU"
			}
		));
		
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		showDataNV(ConnJDBC.showAllnv(), table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		
		JButton btthem = new JButton("Th\u00EAm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.setmaNv(txtmanv.getText());
				nVien.settenNv(txttennv.getText());
				nVien.setgioiTinh((String)boxsex.getSelectedItem());
				nVien.setemail(txtemail.getText());
				nVien.setsdt(txtphone.getText());
				nVien.setngays(Integer.parseInt(txtngay.getText()));
				nVien.setthangs(Integer.parseInt(txtthang.getText()));
				nVien.setnams(Integer.parseInt(txtnam.getText()));
				nVien.setdiaChi(txtaddress.getText());
				nVien.setchucVu(txtnn.getText());
				ConnJDBC.insertNV(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataNV(ConnJDBC.showAllnv(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.settenNv(txttennv.getText());
				showDataNV(ConnJDBC.findNameNV(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("X\u00F3a");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.setmaNv(txtmanv.getText());
				ConnJDBC.deletaNV(nVien);
				showDataNV(ConnJDBC.showAllnv(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("S\u1EEDa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NhanVien nVien=new NhanVien();
				nVien.setmaNv(txtmanv.getText());
				nVien.settenNv(txttennv.getText());
				nVien.setgioiTinh((String)boxsex.getSelectedItem());
				nVien.setemail(txtemail.getText());
				nVien.setsdt(txtphone.getText());
				nVien.setngays(Integer.parseInt(txtngay.getText()));
				nVien.setthangs(Integer.parseInt(txtthang.getText()));
				nVien.setnams(Integer.parseInt(txtnam.getText()));
				nVien.setdiaChi(txtaddress.getText());
				nVien.setchucVu(txtnn.getText());
				ConnJDBC.updateNV(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataNV(ConnJDBC.showAllnv(), table);
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataNV(List<NhanVien> nv,JTable table ) {
		List<NhanVien> listnNhanViens=new ArrayList<>();
		listnNhanViens=nv;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listnNhanViens.size();i++) {
			tableModel.addRow(new Object [] {
					listnNhanViens.get(i).getmaNv(), listnNhanViens.get(i).gettenNv(),listnNhanViens.get(i).getemail(),listnNhanViens.get(i).getgioiTinh(),listnNhanViens.get(i).getsdt(),listnNhanViens.get(i).getngays(),listnNhanViens.get(i).getthangs(), listnNhanViens.get(i).getnams(),listnNhanViens.get(i).getdiaChi(),listnNhanViens.get(i).getchucVu()});
		}
	}
	public void creaPanelT(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtmat;
		JTextField txttent;
		JTextField txtsl;
		JTextField txtnxb;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtmat = new JTextField();
		txtmat.setColumns(10);
		txtmat.setBackground(SystemColor.info);
		txtmat.setBounds(68, 60, 141, 29);
		panel_2.add(txtmat);
		
		txttent = new JTextField();
		txttent.setColumns(10);
		txttent.setBackground(SystemColor.info);
		txttent.setBounds(68, 148, 141, 29);
		panel_2.add(txttent);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn truy\u1EC7n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 109, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 truy\u1EC7n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 21, 96, 29);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("S\u1ED1 l\u01B0\u1EE3ng");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 201, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtsl = new JTextField();
		txtsl.setColumns(10);
		txtsl.setBackground(SystemColor.info);
		txtsl.setBounds(68, 240, 141, 29);
		panel_2.add(txtsl);
		
		txtnxb = new JTextField();
		txtnxb.setColumns(10);
		txtnxb.setBackground(SystemColor.info);
		txtnxb.setBounds(68, 346, 141, 29);
		panel_2.add(txtnxb);
		
		JButton btlammoi = new JButton("L\u00E0m m\u1EDBi");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmat.setText("");
				txttent.setText("");
				txtsl.setText("");
				txtnxb.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 415, 85, 21);
		panel_2.add(btlammoi);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nh\u00E0 xu\u1EA5t b\u1EA3n");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(88, 301, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"MAT", "TENT", "MATL", "NXB"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		showDataT(ConnJDBC.showAllT(), table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Th\u00EAm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.setmat(txtmat.getText());
				nVien.settenT(txttent.getText());
				nVien.setsoLuong(Integer.parseInt(txtsl.getText()));
				nVien.setnxb(txtnxb.getText());
				ConnJDBC.insertT(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.settenT(txttent.getText());
				showDataT(ConnJDBC.findNameT(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("X\u00F3a");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.setmat(txtmat.getText());
				ConnJDBC.deletaT(nVien);
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("S\u1EEDa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Truyen nVien=new Truyen();
				nVien.setmat(txtmat.getText());
				nVien.settenT(txttent.getText());
				nVien.setsoLuong(Integer.parseInt(txtsl.getText()));
				nVien.setnxb(txtnxb.getText());
				ConnJDBC.updateT(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataT(ConnJDBC.showAllT(), table);
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBounds(289, 25, 134, 44);
		btsua.setBackground(new Color(65, 105, 225));
		panel_4.add(btsua);
		panel_1.setVisible(true);
		
	}
	public void showDataT(List<Truyen> truyens,JTable table ) {
		List<Truyen> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaT(), listTruyens.get(i).gettenT(),listTruyens.get(i).getsoLuong(),listTruyens.get(i).getnxb()});
		}
		
	}
	public void creaPanelPM(JPanel x) {
		JTable table;
		JTextField txtmaP;
		JTextField txtmadg;
		JTextField txtsl;
		JTextField txtngaymuon;
		JTextField txtthangmuon;
		JTextField txtnammuon;
		JTextField txtnamtra;
		JTextField txtthangtra;
		JTextField txtngaytra ;
		
		x.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		txtmaP = new JTextField();
		txtmaP.setColumns(10);
		txtmaP.setBackground(SystemColor.info);
		txtmaP.setBounds(68, 30, 141, 29);
		panel_2.add(txtmaP);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(57, 158, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(112, 158, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(164, 158, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngaymuon = new JTextField();
		txtngaymuon.setColumns(10);
		txtngaymuon.setBackground(SystemColor.info);
		txtngaymuon.setBounds(68, 181, 26, 29);
		panel_2.add(txtngaymuon);
		
		txtthangmuon = new JTextField();
		txtthangmuon.setColumns(10);
		txtthangmuon.setBackground(SystemColor.info);
		txtthangmuon.setBounds(120, 181, 26, 29);
		panel_2.add(txtthangmuon);
		
		txtnammuon = new JTextField();
		txtnammuon.setColumns(10);
		txtnammuon.setBackground(SystemColor.info);
		txtnammuon.setBounds(177, 181, 26, 29);
		panel_2.add(txtnammuon);
		
		JLabel lblNewLabel_10 = new JLabel("Mã độc giả");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(110, 60, 96, 29);
		panel_2.add(lblNewLabel_10);
		
		txtmadg = new JTextField();
		txtmadg.setColumns(10);
		txtmadg.setBackground(SystemColor.info);
		txtmadg.setBounds(68, 87, 141, 29);
		panel_2.add(txtmadg);
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y m\u01B0\u1EE3n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 119, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 phi\u1EBFu m\u01B0\u1EE3n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 3, 96, 29);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ng\u00E0y tr\u1EA3");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 218, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtsl = new JTextField();
		txtsl.setColumns(10);
		txtsl.setBackground(SystemColor.info);
		txtsl.setBounds(68, 356, 141, 29);
		panel_2.add(txtsl);
		
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("T\u1ED5ng truy\u1EC7n");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(88, 311, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Năm");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(57, 254, 45, 13);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Tháng");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setBounds(112, 254, 45, 13);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(164, 254, 45, 13);
		panel_2.add(lblNewLabel_2_1_1_1);
		
		txtnamtra = new JTextField();
		txtnamtra.setColumns(10);
		txtnamtra.setBackground(SystemColor.info);
		txtnamtra.setBounds(68, 272, 26, 29);
		panel_2.add(txtnamtra);
		
		txtthangtra = new JTextField();
		txtthangtra.setColumns(10);
		txtthangtra.setBackground(SystemColor.info);
		txtthangtra.setBounds(120, 272, 26, 29);
		panel_2.add(txtthangtra);
		
		txtngaytra = new JTextField();
		txtngaytra.setColumns(10);
		txtngaytra.setBackground(SystemColor.info);
		txtngaytra.setBounds(177, 272, 26, 29);
		panel_2.add(txtngaytra);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("L\u00E0m m\u1EDBi");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmaP.setText("");
				txtmadg.setText("");
				txtngaymuon.setText("");
				txtthangmuon.setText("");
				txtnammuon.setText("");
				txtsl.setText("");
				txtngaytra.setText("");
				txtthangtra.setText("");
				txtnamtra.setText("");
			}
		});

		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 425, 85, 21);
		panel_2.add(btlammoi);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
				{null, null, null, null,null, null, null, null, null},
			},
			new String[] {
				"MAPM","MADG","NGAYMUON","THANGMUON","NAMMUON", "NGAYTRA","THANGTRA","NAMTRA", "TONGSL"
			}
		));
		showDataPM(ConnJDBC.showAllPM(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Th\u00EAm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				nVien.setmaPm(txtmaP.getText());
				nVien.setmaDg(txtmadg.getText());
				nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText()));
				nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText()));
				nVien.setnammuon(Integer.parseInt(txtnammuon.getText()));
				nVien.setngaytra(Integer.parseInt(txtngaytra.getText()));
				nVien.setthangtra(Integer.parseInt(txtthangtra.getText()));
				nVien.setnamtra(Integer.parseInt(txtnamtra.getText()));
				nVien.settong(Integer.parseInt(txtsl.getText()));
				System.out.println(txtmaP);
				
				ConnJDBC.insertPM(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataPM(ConnJDBC.showAllPM(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				nVien.setmaPm(txtmaP.getText());
				showDataPM(ConnJDBC.findNamePM(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("X\u00F3a");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhieuMuon nVien=new PhieuMuon();
				nVien.setmaPm(txtmaP.getText());
				ConnJDBC.deletaPM(nVien);
				showDataPM(ConnJDBC.showAllPM(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("S\u1EEDa");
			btsua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PhieuMuon nVien=new PhieuMuon();
					nVien.setmaPm(txtmaP.getText());
					nVien.setmaDg(txtmadg.getText());
					nVien.setngaymuon(Integer.parseInt(txtngaymuon.getText()));
					nVien.setthangmuon(Integer.parseInt(txtthangmuon.getText()));
					nVien.setnammuon(Integer.parseInt(txtnammuon.getText()));
					nVien.setngaytra(Integer.parseInt(txtngaytra.getText()));
					nVien.setthangtra(Integer.parseInt(txtthangtra.getText()));
					nVien.setnamtra(Integer.parseInt(txtnamtra.getText()));
					nVien.settong(Integer.parseInt(txtsl.getText()));
					ConnJDBC.updatePM(nVien);
					JOptionPane.showMessageDialog(null, "Lưu thành công!");
					showDataPM(ConnJDBC.showAllPM(), table);
				}
			});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);

	}
	public void showDataPM(List<PhieuMuon> truyens,JTable table ) {
		List<PhieuMuon> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaPm(),listTruyens.get(i).getmaDg(), listTruyens.get(i).getngaymuon(),listTruyens.get(i).getthangmuon(),listTruyens.get(i).getnammuon(),listTruyens.get(i).getngaytra(),listTruyens.get(i).getthangtra(),listTruyens.get(i).getnamtra(),listTruyens.get(i).gettong()});
		}
		
	}
	public void creaPanelTG(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtten;
		JTextField txtmatg;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(88, 296, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBackground(SystemColor.info);
		txtten.setBounds(68, 210, 141, 29);
		panel_2.add(txtten);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(88, 172, 96, 29);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 t\u00E1c gi\u1EA3");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(88, 32, 96, 29);
		panel_2.add(lblNewLabel);
		
		txtmatg = new JTextField();
		txtmatg.setColumns(10);
		txtmatg.setBackground(SystemColor.info);
		txtmatg.setBounds(68, 81, 141, 29);
		panel_2.add(txtmatg);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(54, 335, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(109, 335, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(164, 335, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(67, 356, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(120, 356, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(175, 356, 26, 29);
		panel_2.add(txtnam);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("L\u00E0m m\u1EDBi");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmatg.setText("");
				txtten.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(99, 415, 85, 21);
		panel_2.add(btlammoi);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null,null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
				{null, null, null,null, null},
			},
			new String[] {
				"MATG", "TEN", "NGAYSINH","THANGSINH","NAMSINH"
			}
		));
		showDataTG(ConnJDBC.showAllTG(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Th\u00EAm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.setmaTG(txtmatg.getText());
				nVien.settenTG(txtten.getText());
				nVien.setngays(Integer.parseInt(txtngay.getText()));
				nVien.setthangs(Integer.parseInt(txtthang.getText()));
				nVien.setnams(Integer.parseInt(txtnam.getText()));
				
				ConnJDBC.insertTG(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.settenTG(txtten.getText());
				showDataTG(ConnJDBC.findNameTG(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("X\u00F3a");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.setmaTG(txtmatg.getText());
				ConnJDBC.deletaTG(nVien);
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("S\u1EEDa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TacGia nVien=new TacGia();
				nVien.setmaTG(txtmatg.getText());
				nVien.settenTG(txtten.getText());
				nVien.setngays(Integer.parseInt(txtngay.getText()));
				nVien.setthangs(Integer.parseInt(txtthang.getText()));
				nVien.setnams(Integer.parseInt(txtnam.getText()));
				ConnJDBC.updateTG(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataTG(ConnJDBC.showAllTG(), table);
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataTG(List<TacGia> truyens,JTable table ) {
		List<TacGia> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaTG(), listTruyens.get(i).gettenTG(),listTruyens.get(i).getngays(),listTruyens.get(i).getthangs(),listTruyens.get(i).getnams(),listTruyens.get(i).getnams()});
		}
		
	}
	public void creaPanelDG(JPanel x) {
		x.setVisible(false);
		JTable table;
		JTextField txtmadg;
		JTextField txtten;
		JTextField txtsdt;
		JTextField txtemail;
		JTextField txtdiachi;
		JTextField txtngay;
		JTextField txtthang;
		JTextField txtnam;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 118, 985, 606);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 10, 281, 491);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 \u0111\u1ED9c gi\u1EA3");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 27, 96, 29);
		panel_2.add(lblNewLabel);
		
		txtmadg = new JTextField();
		txtmadg.setColumns(10);
		txtmadg.setBackground(SystemColor.info);
		txtmadg.setBounds(116, 27, 141, 29);
		panel_2.add(txtmadg);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("T\u00EAn");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 100, 96, 29);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 179, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(107, 162, 45, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tháng");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(162, 162, 45, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Ngày");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setBounds(217, 162, 45, 13);
		panel_2.add(lblNewLabel_2_1_1);
		
		txtngay = new JTextField();
		txtngay.setColumns(10);
		txtngay.setBackground(SystemColor.info);
		txtngay.setBounds(116, 180, 26, 29);
		panel_2.add(txtngay);
		
		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBackground(SystemColor.info);
		txtthang.setBounds(174, 180, 26, 29);
		panel_2.add(txtthang);
		
		txtnam = new JTextField();
		txtnam.setColumns(10);
		txtnam.setBackground(SystemColor.info);
		txtnam.setBounds(226, 180, 26, 29);
		panel_2.add(txtnam);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblNewLabel_1_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(10, 403, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(10, 350, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(10, 236, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 292, 96, 29);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		
		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBackground(SystemColor.info);
		txtten.setBounds(116, 100, 141, 29);
		panel_2.add(txtten);
		
		txtsdt = new JTextField();
		txtsdt.setColumns(10);
		txtsdt.setBackground(SystemColor.info);
		txtsdt.setBounds(116, 292, 141, 29);
		panel_2.add(txtsdt);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBackground(SystemColor.info);
		txtemail.setBounds(116, 350, 141, 29);
		panel_2.add(txtemail);
		
		txtdiachi = new JTextField();
		txtdiachi.setColumns(10);
		txtdiachi.setBackground(SystemColor.info);
		txtdiachi.setBounds(116, 409, 141, 29);
		panel_2.add(txtdiachi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nam", "N\u1EEF"}));
		comboBox.setBounds(116, 236, 64, 26);
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(291, 10, 684, 491);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 664, 471);
		panel_3.add(scrollPane);
		
		JButton btlammoi = new JButton("L\u00E0m m\u1EDBi");
		btlammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmadg.setText("");
				txtten.setText("");
				txtngay.setText("");
				txtthang.setText("");
				txtnam.setText("");
				txtsdt.setText("");
				txtemail.setText("");
				txtdiachi.setText("");
			}
		});
		btlammoi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btlammoi.setBackground(new Color(65, 105, 225));
		btlammoi.setBounds(107, 460, 85, 21);
		panel_2.add(btlammoi);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
				{null, null, null, null, null, null, null, null,null},
			},
			new String[] {
				"MADG", "TEN", "NGAYSINH","THANGSINH","NAMSINH", "GIOITINH", "SDT", "EMAIL", "DIACHI"
			}
		));
		showDataDG(ConnJDBC.showAllDG(), table);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(96);
		table.getColumnModel().getColumn(3).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(10, 501, 965, 95);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btthem = new JButton("Th\u00EAm");
		btthem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocGia nVien=new DocGia();
				nVien.setmaDg(txtmadg.getText());
				nVien.settenDg(txtten.getText());
				nVien.setngays(Integer.parseInt(txtngay.getText()));
				nVien.setthangs(Integer.parseInt(txtthang.getText()));
				nVien.setnams(Integer.parseInt(txtnam.getText()));
				nVien.setgioiTinh((String)comboBox.getSelectedItem());;
				nVien.setsdt(txtsdt.getText());
				nVien.setemail(txtemail.getText());
				nVien.setdiaChi(txtdiachi.getText());
				ConnJDBC.insertDG(nVien);
				JOptionPane.showMessageDialog(null, "Lưu thành công!");
				showDataDG(ConnJDBC.showAllDG(), table);
			}
		});
		btthem.setBackground(new Color(65, 105, 225));
		btthem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btthem.setBounds(28, 25, 134, 44);
		panel_4.add(btthem);
		
		JButton bttimkiem = new JButton("T\u00ECm ki\u1EBFm");
		bttimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocGia nVien=new DocGia();
				nVien.settenDg(txtten.getText());
				showDataDG(ConnJDBC.findNameDG(nVien), table);
			}
		});
		bttimkiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		bttimkiem.setBackground(new Color(65, 105, 225));
		bttimkiem.setBounds(792, 25, 134, 44);
		panel_4.add(bttimkiem);
		
		JButton btxoa = new JButton("X\u00F3a");
		btxoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btxoa.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DocGia nVien=new DocGia();
						nVien.setmaDg(txtmadg.getText());
						ConnJDBC.deletaDG(nVien);
						showDataDG(ConnJDBC.showAllDG(), table);
					}
				});
			}
		});
		btxoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btxoa.setBackground(new Color(65, 105, 225));
		btxoa.setBounds(547, 25, 134, 44);
		panel_4.add(btxoa);
		
		JButton btsua = new JButton("S\u1EEDa");
		btsua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btsua.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						DocGia nVien=new DocGia();
						nVien.setmaDg(txtmadg.getText());
						nVien.settenDg(txtten.getText());
						nVien.setngays(Integer.parseInt(txtngay.getText()));
						nVien.setthangs(Integer.parseInt(txtthang.getText()));
						nVien.setnams(Integer.parseInt(txtnam.getText()));
						nVien.setgioiTinh((String)comboBox.getSelectedItem());;
						nVien.setsdt(txtsdt.getText());
						nVien.setemail(txtemail.getText());
						nVien.setdiaChi(txtdiachi.getText());
						ConnJDBC.updateDG(nVien);
						JOptionPane.showMessageDialog(null, "Lưu thành công!");
						showDataDG(ConnJDBC.showAllDG(), table);
					}
				});
			}
		});
		btsua.setFont(new Font("Tahoma", Font.BOLD, 20));
		btsua.setBackground(new Color(65, 105, 225));
		btsua.setBounds(289, 25, 134, 44);
		panel_4.add(btsua);
		panel_1.setVisible(true);
	}
	public void showDataDG(List<DocGia> truyens,JTable table ) {
		List<DocGia> listTruyens=new ArrayList<>();
		listTruyens=truyens;
		DefaultTableModel tableModel=new DefaultTableModel();
		table.getModel();
		tableModel=(DefaultTableModel)table.getModel();
		tableModel.setRowCount(0);
		for(int i=0;i<listTruyens.size();i++) {
			tableModel.addRow(new Object [] {
					listTruyens.get(i).getmaDg(),listTruyens.get(i).gettenDg(),listTruyens.get(i).getngays(),listTruyens.get(i).getthangs(),listTruyens.get(i).getnams(), listTruyens.get(i).getgioiTinh(),listTruyens.get(i).getsdt(),listTruyens.get(i).getemail(),listTruyens.get(i).getdiaChi()});
		}
		
	}
}