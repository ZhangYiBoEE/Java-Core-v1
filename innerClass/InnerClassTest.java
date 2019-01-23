package innerClass;
/*
 * ÄÚ²¿Àà
 */
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class InnerClassTest {
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}

class TalkingClock {
	private int internal;
	private boolean beep;
	
	public TalkingClock(int internal, boolean beep) {
		this.internal = internal;
		this.beep = beep;
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(internal, listener);
		t.start();
	}
	
	public class TimePrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is " + new Date());
			if(beep)
				Toolkit.getDefaultToolkit().beep();
		}
		
	}
}