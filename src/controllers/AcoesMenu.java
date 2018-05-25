package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Simulacao1;
import view.Simulacao2;

public class AcoesMenu implements ActionListener{
	private int x;
	
	public AcoesMenu(int x) {
		this.x = x;
	}

	public void actionPerformed(ActionEvent e) {
		if(x==1) {
			Simulacao1.main(null);
		}
		else if(x==2) {
			Simulacao2.main(null);
		}
		else if(x==3) {
			System.exit(0);
		}
		
	}
	
}
