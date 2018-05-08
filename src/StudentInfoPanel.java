import component.AnTable;

import javax.swing.*;
import java.awt.*;

public class StudentInfoPanel extends JPanel{
	private JTextField txNum;
	private JTextField txName;
	private JTextField txClass;
	private JTextField txEnter;
	private JTextField txNative;
	private JTextField txCollege;
	private JTextField txPhone;
	private JTextField txMajor;
	private JTextField txTag;
	private JTextField txFNum;
	private JTextField txFName;
	private JTextField txFCollege;
	private JTextField txFMajor;
	private JTextField txFEnter;
	private JTextField txFClass;
	private JTextField txTotalNum;
	private AnTable table;
	public StudentInfoPanel() {
		setSize(1145, 770);
		setBackground(Color.PINK);
		setLayout(null);
		
		JLabel label = new JLabel("添加/修改学生信息：");
		label.setBounds(10, 10, 133, 15);
		add(label);
		
		JLabel label_1 = new JLabel("*学号：");
		label_1.setBounds(55, 35, 54, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("*班级：");
		label_2.setBounds(55, 75, 54, 15);
		add(label_2);
		
		txNum = new JTextField();
		txNum.setColumns(10);
		txNum.setBounds(99, 32, 113, 21);
		add(txNum);
		
		txName = new JTextField();
		txName.setColumns(10);
		txName.setBounds(322, 32, 113, 21);
		add(txName);
		
		txClass = new JTextField();
		txClass.setColumns(10);
		txClass.setBounds(99, 72, 113, 21);
		add(txClass);
		
		txEnter = new JTextField();
		txEnter.setColumns(10);
		txEnter.setBounds(322, 72, 113, 21);
		add(txEnter);
		
		JLabel label_3 = new JLabel("*姓名：");
		label_3.setBounds(258, 35, 54, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("*入学时间：");
		label_4.setBounds(239, 75, 73, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("*性别：");
		label_5.setBounds(461, 35, 54, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("籍贯：");
		label_6.setBounds(464, 75, 36, 15);
		add(label_6);
		
		txNative = new JTextField();
		txNative.setColumns(10);
		txNative.setBounds(510, 72, 113, 21);
		add(txNative);
		
		JComboBox cobSex = new JComboBox();
		cobSex.setBounds(525, 32, 61, 21);
		add(cobSex);
		
		JLabel label_7 = new JLabel("*院系：");
		label_7.setBounds(640, 35, 54, 15);
		add(label_7);
		
		JLabel label_8 = new JLabel("电话：");
		label_8.setBounds(650, 75, 36, 15);
		add(label_8);
		
		JLabel label_9 = new JLabel("*专业：");
		label_9.setBounds(814, 35, 54, 15);
		add(label_9);
		
		txCollege = new JTextField();
		txCollege.setColumns(10);
		txCollege.setBounds(680, 32, 113, 21);
		add(txCollege);
		
		txPhone = new JTextField();
		txPhone.setColumns(10);
		txPhone.setBounds(680, 72, 113, 21);
		add(txPhone);
		
		JLabel label_10 = new JLabel("备注：");
		label_10.setBounds(814, 75, 44, 15);
		add(label_10);
		
		txMajor = new JTextField();
		txMajor.setColumns(10);
		txMajor.setBounds(862, 32, 113, 21);
		add(txMajor);
		
		txTag = new JTextField();
		txTag.setColumns(10);
		txTag.setBounds(862, 72, 113, 21);
		add(txTag);
		
		JButton btnAlter = new JButton("修改数据");
		btnAlter.setBounds(995, 27, 103, 31);
		add(btnAlter);
		
		JButton btnInsert = new JButton("插入数据");
		btnInsert.setBounds(995, 67, 103, 31);
		add(btnInsert);
		
		JLabel label_11 = new JLabel("查询学生信息（选择查询依据）：");
		label_11.setBounds(10, 123, 247, 15);
		add(label_11);
		
		JLabel label_12 = new JLabel("学号");
		label_12.setBounds(55, 162, 54, 15);
		add(label_12);
		
		txFNum = new JTextField();
		txFNum.setColumns(10);
		txFNum.setBounds(99, 159, 113, 21);
		add(txFNum);
		
		JLabel label_13 = new JLabel("姓名");
		label_13.setBounds(239, 162, 36, 15);
		add(label_13);
		
		txFName = new JTextField();
		txFName.setColumns(10);
		txFName.setBounds(270, 159, 113, 21);
		add(txFName);
		
		JLabel label_14 = new JLabel("院系");
		label_14.setBounds(393, 162, 54, 15);
		add(label_14);
		
		txFCollege = new JTextField();
		txFCollege.setColumns(10);
		txFCollege.setBounds(423, 159, 113, 21);
		add(txFCollege);
		
		JLabel label_15 = new JLabel("专业");
		label_15.setBounds(556, 162, 54, 15);
		add(label_15);
		
		txFMajor = new JTextField();
		txFMajor.setColumns(10);
		txFMajor.setBounds(592, 159, 113, 21);
		add(txFMajor);
		
		JLabel label_16 = new JLabel("入学时间");
		label_16.setBounds(715, 162, 54, 15);
		add(label_16);
		
		txFEnter = new JTextField();
		txFEnter.setColumns(10);
		txFEnter.setBounds(779, 159, 113, 21);
		add(txFEnter);
		
		JLabel label_17 = new JLabel("班级");
		label_17.setBounds(902, 162, 29, 15);
		add(label_17);
		
		txFClass = new JTextField();
		txFClass.setColumns(10);
		txFClass.setBounds(941, 159, 121, 21);
		add(txFClass);
		
		JButton btnSearching = new JButton("查询");
		btnSearching.setBounds(441, 221, 95, 25);
		add(btnSearching);
		
		JButton btnDelete = new JButton("删除数据");
		btnDelete.setBackground(Color.PINK);
		btnDelete.setBounds(10, 318, 95, 25);
		add(btnDelete);
		
		JButton btnExport = new JButton("导出数据");
		btnExport.setBackground(Color.PINK);
		btnExport.setBounds(115, 318, 95, 25);
		add(btnExport);
		
		JLabel label_18 = new JLabel("总人数：");
		label_18.setBounds(423, 323, 62, 15);
		add(label_18);
		
		txTotalNum = new JTextField();
		txTotalNum.setEditable(false);
		txTotalNum.setColumns(10);
		txTotalNum.setBounds(486, 320, 66, 21);
		add(txTotalNum);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 348, 1145, 422);
		add(scrollPane);
		
		table = new AnTable();
		scrollPane.setViewportView(table);
	}

}
