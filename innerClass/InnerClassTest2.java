package innerClass;
/*
 * 内部匿名类
 */
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest2 {
	public static void main (String[] args) {
		TalkingClock2 clock = new TalkingClock2();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}

class TalkingClock2 {
	public void start(int interval, boolean beep) {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep)
					Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
