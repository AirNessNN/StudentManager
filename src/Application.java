import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 程序类，启动程序，配置数据库，提供方法
 * @author AN
 *
 */
public class Application {
	static MainWindow mainWindow=null;
	
	
	static void start() {
		if(mainWindow!=null) {
			if(!mainWindow.isVisible())
				mainWindow.setVisible(true);
		}else {
			mainWindow=new MainWindow();
			mainWindow.setVisible(true);
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		start();
	}

}
