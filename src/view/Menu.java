package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AcoesMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
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
	
	/**
	 * Create the frame.
	 */
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Menu.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Menu Inicial");
		titulo.setForeground(SystemColor.menuText);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Dialog", Font.BOLD, 20));
		titulo.setBounds(58, 20, 305, 15);
		contentPane.add(titulo);
		
		JLabel BoasVindas = new JLabel("Bem-vindo(a) ao Aprenda QEE.");
		BoasVindas.setFont(new Font("Dialog", Font.BOLD, 16));
		BoasVindas.setBounds(70, 70, 300, 15);
		contentPane.add(BoasVindas);
		
		JButton btnSimulao1 = new JButton("Simular Fluxo de Potência Fundamental");
		btnSimulao1.addActionListener(new AcoesMenu(1));
		btnSimulao1.setBackground(UIManager.getColor("Button.background"));
		btnSimulao1.setBounds(50, 140, 320, 25);
		contentPane.add(btnSimulao1);
		
		JButton btnSimulao2 = new JButton("Simular Distorção Harmônica");
		btnSimulao2.addActionListener(new AcoesMenu(2));
		btnSimulao2.setBounds(50, 190, 320, 25);
		contentPane.add(btnSimulao2);
		
		JButton Sair = new JButton("Sair");
		Sair.addActionListener(new AcoesMenu(3));
		Sair.setBackground(UIManager.getColor("Button.background"));
		Sair.setBounds(50, 240, 320, 25);
		contentPane.add(Sair);
	
	}
}
	