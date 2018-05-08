import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import component.AnTable;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class GradeInfoPanel extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private AnTable table;
	public GradeInfoPanel() {
		setSize(1145, 770);
		setBackground(Color.PINK);
		setLayout(null);
		
		JLabel label = new JLabel("插入-修改成级");
		label.setBounds(10, 10, 99, 15);
		add(label);
		
		JLabel label_1 = new JLabel("学号：");
		label_1.setBounds(43, 44, 36, 15);
		add(label_1);
		
		textField = new JTextField();
		textField.setBounds(85, 41, 99, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("姓名：");
		label_2.setBounds(209, 44, 36, 15);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 41, 99, 21);
		add(textField_1);
		
		JLabel label_3 = new JLabel("课程名");
		label_3.setBounds(381, 44, 41, 15);
		add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(420, 40, 99, 23);
		add(comboBox);
		
		JLabel label_4 = new JLabel("任课老师");
		label_4.setBounds(545, 44, 54, 15);
		add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(598, 40, 92, 23);
		add(comboBox_1);
		
		JLabel label_5 = new JLabel("平时分");
		label_5.setBounds(714, 44, 36, 15);
		add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(756, 41, 99, 21);
		add(textField_2);
		
		JLabel label_6 = new JLabel("卷面成级：");
		label_6.setBounds(887, 44, 67, 15);
		add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(950, 41, 41, 21);
		add(textField_3);
		
		JLabel label_7 = new JLabel("查询-删除成级");
		label_7.setBounds(10, 136, 146, 15);
		add(label_7);
		
		JButton button = new JButton("修改成绩");
		button.setBounds(355, 85, 83, 37);
		add(button);
		
		JButton button_1 = new JButton("插入成绩");
		button_1.setBounds(478, 85, 83, 37);
		add(button_1);
		
		JLabel label_8 = new JLabel("专业：");
		label_8.setBounds(43, 172, 54, 15);
		add(label_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"ALL"}));
		comboBox_2.setBounds(85, 168, 99, 23);
		add(comboBox_2);
		
		JLabel label_9 = new JLabel("学号：");
		label_9.setBounds(209, 172, 36, 15);
		add(label_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(251, 169, 99, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_10 = new JLabel("班级：");
		label_10.setBounds(381, 172, 36, 15);
		add(label_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(420, 169, 99, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_11 = new JLabel("课程名");
		label_11.setBounds(545, 172, 41, 15);
		add(label_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(596, 169, 99, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel label_12 = new JLabel("学期：");
		label_12.setBounds(714, 172, 36, 15);
		add(label_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(756, 169, 99, 21);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_13 = new JLabel("成绩范围：");
		label_13.setBounds(887, 172, 67, 15);
		add(label_13);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"ALL"}));
		comboBox_3.setBounds(950, 168, 99, 23);
		add(comboBox_3);
		
		JButton btnNewButton = new JButton("查询成绩");
		btnNewButton.setBounds(435, 213, 84, 25);
		add(btnNewButton);
		
		JButton button_2 = new JButton("删除成绩");
		button_2.setBackground(Color.PINK);
		button_2.setBounds(10, 302, 95, 37);
		add(button_2);
		
		JButton button_3 = new JButton("导出成绩");
		button_3.setBackground(Color.PINK);
		button_3.setBounds(117, 302, 95, 37);
		add(button_3);
		
		JLabel label_14 = new JLabel("课程总数：");
		label_14.setBounds(435, 318, 67, 15);
		add(label_14);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(493, 315, 54, 21);
		add(textField_8);
		textField_8.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 344, 1145, 426);
		add(scrollPane);
		
		table = new AnTable();
		scrollPane.setViewportView(table);
	}
}
