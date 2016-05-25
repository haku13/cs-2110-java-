import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;


public class MenuBar extends JMenuBar implements ActionListener{
	
	public MenuBar() {		//control space
		// TODO Auto-generated constructor stub
		
		
		JMenu first = new JMenu("Menu 1");
		first.setMnemonic(KeyEvent.VK_M);		//underline M in Menu
		JMenu second = new JMenu("Menu 2");
		second.setMnemonic(KeyEvent.VK_E);
		
		
		JMenuItem bacon = new JMenuItem("BACON", KeyEvent.VK_B);
		bacon.setActionCommand("Bacon");
		bacon.addActionListener(this);
		JMenuItem cheese = new JMenuItem("cheese", KeyEvent.VK_C);
		cheese.setActionCommand("cheese");
		cheese.addActionListener(this);
		JMenuItem both = new JMenuItem("Why no both?", KeyEvent.VK_Y);
		both.setActionCommand("Both is good");
		both.addActionListener(this);
		
		JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("choice 1");
		JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("choice 2");
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);		//can only select choice 1 or 2 not both
		
		JMenu sub = new JMenu("sub menu");
		JMenuItem test = new JMenuItem("test!");
		sub.add(test);
		
		first.add(bacon);
		first.add(cheese);
		first.add(both);
		first.addSeparator();     //have a seperation bar between the choices
		first.add(rb1);
		first.add(rb2);
		second.add(sub);
		
		add(first);
		add(second);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Menu Item" + e.getActionCommand() + "selected");
	}

}
//add imports is command shift o