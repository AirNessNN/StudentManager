import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

/**
 * 主窗口类
 * @author AN
 *
 */
public class MainWindow extends JFrame{
	
	StudentInfoPanel studentInfoPanel=new StudentInfoPanel();
	GradeInfoPanel gradeInfoPanel=new GradeInfoPanel();
	ClassPanel classPanel =new ClassPanel();
	
	
	public MainWindow() {
		setTitle("学生成绩管理系统");
		setResizable(false);
		getContentPane().setBackground(new Color(255, 182, 193));
		getContentPane().setLayout(new BorderLayout(0, 0));
		// TODO Auto-generated constructor stub
		setSize(1150, 827);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		setJMenuBar(menuBar);
		
		JLabel btnImport = new JLabel("  导入数据  ");
		menuBar.add(btnImport);
		btnImport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.BLACK);
			}
		});
		
		JLabel btnStud = new JLabel("  学生信息操作  ");
		menuBar.add(btnStud);
		btnStud.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				addPanel(studentInfoPanel);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.BLACK);
			}
		});
		
		JLabel btnClass = new JLabel("  课程信息操作  ");
		menuBar.add(btnClass);
		btnClass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				addPanel(classPanel);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.BLACK);
			}
		});
		
		JLabel btnGrade = new JLabel("  成绩信息操作  ");
		menuBar.add(btnGrade);
		btnGrade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				addPanel(gradeInfoPanel);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				JLabel lb=(JLabel) e.getSource();
				lb.setForeground(Color.BLACK);
			}
		});
		
		
		addPanel(studentInfoPanel);
	}
	
	void addPanel(JPanel panel) {
		getContentPane().removeAll();
		getContentPane().add(panel);
		repaint();
	}
}
