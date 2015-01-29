import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseCoordinates extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.printf("(x: %3d, y: %3d)\n", e.getX(), e.getY());
		super.mousePressed(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.printf("(x: %3d, y: %3d)\n", e.getX(), e.getY());
		super.mouseMoved(e);
	}

}
