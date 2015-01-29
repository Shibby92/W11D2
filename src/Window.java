import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window {
	public Window(){
		JFrame window = new JFrame();
		window.setSize(1024, 768);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setUndecorated(true);
		window.setOpacity(0.25f);
		JPanel panel = new JPanel();
		window.setContentPane(panel);
		MouseCoordinates listener = new MouseCoordinates();
		panel.addMouseListener(listener);
		panel.addMouseMotionListener(listener);
		window.setVisible(true);
	}

}
