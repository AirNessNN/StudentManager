import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import component.AnTable;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

/**
 * 课程信息界面
 * @author AN
 *
 */
public class ClassPanel extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private AnTable table;
	public ClassPanel() {
		setBackground(Color.PINK);
		setSize(1145, 770);
		setLayout(null);
		
		JLabel label = new JLabel("插入/修改课程信息：");
		label.setBounds(10, 10, 114, 15);
		add(label);
		
		JLabel label_1 = new JLabel("*课程号");
		label_1.setBounds(42, 35, 42, 15);
		add(label_1);
		
		textField = new JTextField();
		textField.setBounds(85, 32, 42, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("*课程名");
		label_2.setBounds(146, 35, 42, 15);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 32, 100, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("*任课老师：");
		label_3.setBounds(308, 35, 66, 15);
		add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(373, 32, 107, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_4 = new JLabel("*学分：");
		label_4.setBounds(490, 35, 42, 15);
		add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(531, 32, 42, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("*平时分比例%");
		label_5.setBounds(583, 35, 79, 15);
		add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(661, 32, 48, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*类别：");
		lblNewLabel.setBounds(750, 35, 42, 15);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(802, 31, 84, 23);
		add(comboBox);
		
		JLabel label_6 = new JLabel("*学期：");
		label_6.setBounds(920, 35, 42, 15);
		add(label_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(972, 31, 84, 23);
		add(comboBox_1);
		
		JLabel label_7 = new JLabel("备注：");
		label_7.setBounds(42, 92, 54, 15);
		add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(86, 89, 236, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton button = new JButton("添加课程");
		button.setBounds(411, 87, 95, 25);
		add(button);
		
		JButton button_1 = new JButton("修改课程");
		button_1.setBounds(531, 87, 95, 25);
		add(button_1);
		
		JLabel label_8 = new JLabel("查询课程信息：（选择查询依据）");
		label_8.setBounds(10, 149, 214, 15);
		add(label_8);
		
		JRadioButton radioButton = new JRadioButton("课程号");
		radioButton.setBackground(Color.PINK);
		radioButton.setBounds(94, 206, 66, 23);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("课程名");
		radioButton_1.setBackground(Color.PINK);
		radioButton_1.setBounds(198, 206, 66, 23);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("任课老师");
		radioButton_2.setBackground(Color.PINK);
		radioButton_2.setBounds(293, 206, 79, 23);
		add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("类别");
		radioButton_3.setBackground(Color.PINK);
		radioButton_3.setBounds(392, 206, 62, 23);
		add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("学期");
		radioButton_4.setBackground(Color.PINK);
		radioButton_4.setBounds(456, 206, 54, 23);
		add(radioButton_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(531, 207, 131, 21);
		add(textField_6);
		textField_6.setColumns(10);
		
		JButton button_2 = new JButton("查询课程");
		button_2.setBounds(672, 205, 84, 25);
		add(button_2);
		
		JButton button_3 = new JButton("删除课程");
		button_3.setBackground(Color.PINK);
		button_3.setBounds(10, 332, 86, 39);
		add(button_3);
		
		JButton button_4 = new JButton("导出数据");
		button_4.setBackground(Color.PINK);
		button_4.setBounds(106, 332, 86, 39);
		add(button_4);
		
		JLabel label_9 = new JLabel("课程总数：");
		label_9.setBounds(392, 353, 62, 15);
		add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(454, 350, 66, 21);
		add(textField_7);
		textField_7.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 381, 1145, 389);
		add(scrollPane);
		
		table = new AnTable();
		scrollPane.setViewportView(table);
	}
}
