package view;
import java.awt.EventQueue;

import view.Menu;

public class Main{
	
	public static void menu() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		menu();
		
	}

}
