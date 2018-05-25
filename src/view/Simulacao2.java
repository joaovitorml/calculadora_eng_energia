package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import controllers.AcoesSimulacao2;
import model.GraphPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JProgressBar;
import javax.swing.DebugGraphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Simulacao2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1431519479620208282L;
	private JPanel normalPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulacao2 frame = new Simulacao2();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Simulacao2() throws IOException {
		setTitle("Distorção Harmônica");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 2000);
		normalPane = new JPanel();
		normalPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		normalPane.setLayout(null);
		
		JScrollPane contentPane = new JScrollPane(normalPane);
		contentPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		
		//Objetos da interface gráfica
		
		JLabel Entradas = new JLabel("Entradas");
		normalPane.add(Entradas);
		Entradas.setFont(new Font("Dialog", Font.BOLD, 20));
		Entradas.setBounds(300, 12, 176, 24);
		
		JLabel ComponenteFundamental = new JLabel("Componente Fundamental");
		ComponenteFundamental.setBounds(30, 50, 198, 15);
		normalPane.add(ComponenteFundamental);
		
		JLabel amplitude = new JLabel("Amplitude");
		amplitude.setBounds(300, 70, 100, 15);
		normalPane.add(amplitude);
		
		JProgressBar amp = new JProgressBar();
		amp.setMaximum(220);
		amp.setOrientation(SwingConstants.VERTICAL);
		amp.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		amp.setAutoscrolls(true);
		amp.setBounds(326, 100, 14, 50);
		normalPane.add(amp);
		
		JLabel Angulo1 = new JLabel("Angulo de Fase [θ°] ");
		Angulo1.setBounds(460, 50, 198, 15);
		normalPane.add(Angulo1);
		
		JSpinner Ang = new JSpinner();
		Ang.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		Ang.setBounds(460, 70, 150, 20);
		normalPane.add(Ang);
		
		JLabel Ampl = new JLabel("Amplitude ");
		Ampl.setBounds(460, 95, 198, 15);
		normalPane.add(Ampl);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		spinner.setBounds(460, 110, 150, 20);
		normalPane.add(spinner);
		
		
		JButton button = new JButton("OK");
		button.setBounds(702, 99, 68, 20);
		normalPane.add(button);
		
		JLabel NumdeHarmonicas = new JLabel("Número de Ordens Harmônicas");
		NumdeHarmonicas.setBounds(370, 159, 267, 15);
		normalPane.add(NumdeHarmonicas);
		
		JSpinner Harm = new JSpinner();
		Harm.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		Harm.setBounds(412, 186, 150, 20);
		normalPane.add(Harm);
		
		JLabel Harmon = new JLabel("Harmônicos");
		Harmon.setBounds(649, 159, 92, 15);
		normalPane.add(Harmon);
		
		JRadioButton imp = new JRadioButton("Ímpares");
		imp.setBounds(649, 184, 100, 23);
		normalPane.add(imp);
		
		JRadioButton par = new JRadioButton("Pares");
		par.setBounds(649, 211, 100, 23);
		normalPane.add(par);
		
		JLabel saida = new JLabel("Saídas");
		saida.setFont(new Font("Dialog", Font.BOLD, 20));
		saida.setBounds(300, 260, 176, 24);
		normalPane.add(saida);
		
		JLabel Result = new JLabel("Resultante");
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setBounds(50, 300, 198, 15);
		normalPane.add(Result);
		
		JLabel Ser = new JLabel("Série de Fourier Amplitude-Fase");
		Ser.setBounds(400, 300, 267, 15);
		normalPane.add(Ser);
		
		JLabel Resulted = new JLabel("Resulted");
		Resulted.setFont(new Font("Dialog", Font.BOLD, 10));
		Resulted.setVerticalAlignment(SwingConstants.TOP);
		Resulted.setBounds(400, 340, 800, 15);
		normalPane.add(Resulted);
		
		//Forma de onda 1
		
		JLabel ampliond1 = new JLabel("Amplitude");
		ampliond1.setBounds(300, 240, 100, 15);
		ampliond1.setVisible(false);
		normalPane.add(ampliond1);
		
		JProgressBar ond1 = new JProgressBar();
		ond1.setMaximum(220);
		ond1.setOrientation(SwingConstants.VERTICAL);
		ond1.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		ond1.setAutoscrolls(true);
		ond1.setBounds(326, 270, 14, 50);
		ond1.setVisible(false);
		normalPane.add(ond1);
		
		JLabel spinner1_label = new JLabel("Angulo de Fase [θ°] ");
		spinner1_label.setBounds(410, 250, 198, 15);
		spinner1_label.setVisible(false);
		normalPane.add(spinner1_label);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(410, 280, 150, 20);
		spinner1.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		spinner1.setVisible(false);
		normalPane.add(spinner1);
		
		JLabel Ampl1 = new JLabel("Amplitude ");
		Ampl1.setBounds(410, 305, 198, 15);
		Ampl1.setVisible(false);
		normalPane.add(Ampl1);
		
		JSpinner ampl1 = new JSpinner();
		ampl1.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		ampl1.setBounds(410, 320, 150, 20);
		ampl1.setVisible(false);
		normalPane.add(ampl1);
		
		JLabel Ordem1 = new JLabel("Ordem Harmônica");
		Ordem1.setBounds(605, 250, 170, 15);
		Ordem1.setVisible(false);
		normalPane.add(Ordem1);
		
		JSpinner Ordem_spinner = new JSpinner();
		Ordem_spinner.setBounds(605, 280, 150, 20);
		Ordem_spinner.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Ordem_spinner.setVisible(false);
		normalPane.add(Ordem_spinner);
		
		//Forma de onda 2
		
		JLabel ampliond2 = new JLabel("Amplitude");
		ampliond2.setBounds(300, 370, 100, 15);
		ampliond2.setVisible(false);
		normalPane.add(ampliond2);
		
		JProgressBar ond2 = new JProgressBar();
		ond2.setMaximum(220);
		ond2.setOrientation(SwingConstants.VERTICAL);
		ond2.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		ond2.setAutoscrolls(true);
		ond2.setBounds(326, 400, 14, 50);
		ond2.setVisible(false);
		normalPane.add(ond2);
		
		JLabel spinner1_label2 = new JLabel("Angulo de Fase [θ°] ");
		spinner1_label2.setBounds(410, 380, 198, 15);
		spinner1_label2.setVisible(false);
		normalPane.add(spinner1_label2);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(410, 410, 150, 20);
		spinner2.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		spinner2.setVisible(false);
		normalPane.add(spinner2);
		
		JLabel Ampl2 = new JLabel("Amplitude ");
		Ampl2.setBounds(410, 435, 198, 15);
		Ampl2.setVisible(false);
		normalPane.add(Ampl2);
		
		JSpinner ampl2 = new JSpinner();
		ampl2.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		ampl2.setBounds(410, 450, 150, 20);
		ampl2.setVisible(false);
		normalPane.add(ampl2);
		
		JLabel Ordem2 = new JLabel("Ordem Harmônica");
		Ordem2.setBounds(605, 380, 170, 15);
		Ordem2.setVisible(false);
		normalPane.add(Ordem2);
		
		JSpinner Ordem_spinner2 = new JSpinner();
		Ordem_spinner2.setBounds(605, 410, 150, 20);
		Ordem_spinner2.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Ordem_spinner2.setVisible(false);
		normalPane.add(Ordem_spinner2);
		
		//Forma de onda 3
		
		JLabel ampliond3 = new JLabel("Amplitude");
		ampliond3.setBounds(300, 500, 100, 15);
		ampliond3.setVisible(false);
		normalPane.add(ampliond3);
		
		JProgressBar ond3 = new JProgressBar();
		ond3.setMaximum(220);
		ond3.setOrientation(SwingConstants.VERTICAL);
		ond3.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		ond3.setAutoscrolls(true);
		ond3.setBounds(326, 530, 14, 50);
		ond3.setVisible(false);
		normalPane.add(ond3);
		
		JLabel spinner1_label3 = new JLabel("Angulo de Fase [θ°] ");
		spinner1_label3.setBounds(410, 510, 198, 15);
		spinner1_label3.setVisible(false);
		normalPane.add(spinner1_label3);
		
		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(410, 540, 150, 20);
		spinner3.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		spinner3.setVisible(false);
		normalPane.add(spinner3);
		
		JLabel Ampl3 = new JLabel("Amplitude ");
		Ampl3.setBounds(410, 565, 198, 15);
		Ampl3.setVisible(false);
		normalPane.add(Ampl3);
		
		JSpinner ampl3 = new JSpinner();
		ampl3.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		ampl3.setBounds(410, 580, 150, 20);
		ampl3.setVisible(false);
		normalPane.add(ampl3);
		
		JLabel Ordem3 = new JLabel("Ordem Harmônica");
		Ordem3.setBounds(605, 510, 170, 15);
		Ordem3.setVisible(false);
		normalPane.add(Ordem3);
		
		JSpinner Ordem_spinner3 = new JSpinner();
		Ordem_spinner3.setBounds(605, 540, 150, 20);
		Ordem_spinner3.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Ordem_spinner3.setVisible(false);
		normalPane.add(Ordem_spinner3);
		
		//Forma de onda 4
		
		JLabel ampliond4 = new JLabel("Amplitude");
		ampliond4.setBounds(300, 630, 100, 15);
		ampliond4.setVisible(false);
		normalPane.add(ampliond4);
		
		JProgressBar ond4 = new JProgressBar();
		ond4.setMaximum(220);
		ond4.setOrientation(SwingConstants.VERTICAL);
		ond4.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		ond4.setAutoscrolls(true);
		ond4.setBounds(326, 660, 14, 50);
		ond4.setVisible(false);
		normalPane.add(ond4);
		
		JLabel spinner1_label4 = new JLabel("Angulo de Fase [θ°] ");
		spinner1_label4.setBounds(410, 640, 198, 15);
		spinner1_label4.setVisible(false);
		normalPane.add(spinner1_label4);
				
		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(410, 670, 150, 20);
		spinner4.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		spinner4.setVisible(false);
		normalPane.add(spinner4);
		
		JLabel Ampl4 = new JLabel("Amplitude ");
		Ampl4.setBounds(410, 695, 198, 15);
		Ampl4.setVisible(false);
		normalPane.add(Ampl4);
		
		JSpinner ampl4 = new JSpinner();
		ampl4.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		ampl4.setBounds(410, 710, 150, 20);
		ampl4.setVisible(false);
		normalPane.add(ampl4);
				
		JLabel Ordem4 = new JLabel("Ordem Harmônica");
		Ordem4.setBounds(605, 640, 170, 15);
		Ordem4.setVisible(false);
		normalPane.add(Ordem4);
				
		JSpinner Ordem_spinner4 = new JSpinner();
		Ordem_spinner4.setBounds(605, 670, 150, 20);
		Ordem_spinner4.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Ordem_spinner4.setVisible(false);
		normalPane.add(Ordem_spinner4);
		
		//Forma de onda 5
		
		JLabel ampliond5 = new JLabel("Amplitude");
		ampliond5.setBounds(300, 760, 100, 15);
		ampliond5.setVisible(false);
		normalPane.add(ampliond5);
		
		JProgressBar ond5 = new JProgressBar();
		ond5.setMaximum(220);
		ond5.setOrientation(SwingConstants.VERTICAL);
		ond5.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		ond5.setAutoscrolls(true);
		ond5.setBounds(326, 790, 14, 50);
		ond5.setVisible(false);
		normalPane.add(ond5);
		
		JLabel spinner1_label5 = new JLabel("Angulo de Fase [θ°] ");
		spinner1_label5.setBounds(410, 770, 198, 15);
		spinner1_label5.setVisible(false);
		normalPane.add(spinner1_label5);
						
		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(410, 800, 150, 20);
		spinner5.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		spinner5.setVisible(false);
		normalPane.add(spinner5);
		
		JLabel Ampl5 = new JLabel("Amplitude ");
		Ampl5.setBounds(410, 825, 198, 15);
		Ampl5.setVisible(false);
		normalPane.add(Ampl5);
		
		JSpinner ampl5 = new JSpinner();
		ampl5.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		ampl5.setBounds(410, 840, 150, 20);
		ampl5.setVisible(false);
		normalPane.add(ampl5);
						
		JLabel Ordem5 = new JLabel("Ordem Harmônica");
		Ordem5.setBounds(605, 770, 170, 15);
		Ordem5.setVisible(false);
		normalPane.add(Ordem5);
						
		JSpinner Ordem_spinner5 = new JSpinner();
		Ordem_spinner5.setBounds(605, 800, 150, 20);
		Ordem_spinner5.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		Ordem_spinner5.setVisible(false);
		normalPane.add(Ordem_spinner5);
		
		//Gráficos
		
		List<Double> scores = new ArrayList<>();
		int maxDataPoints = 50;
		GraphPanel panel = new model.GraphPanel(scores);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setBounds(10,50,300,175);
		panel.setBackground(new Color(238, 238, 238));
		normalPane.add(panel);
		
		List<Double> scores2 = new ArrayList<>();
		GraphPanel panel2 = new model.GraphPanel(scores2);
		panel2.setOpaque(false);
		panel2.setBorder(null);
		panel2.setBackground(new Color(238, 238, 238));
		panel2.setBounds(10,220,300,175);
		panel2.setPreferredSize(new Dimension(800, 600));
		panel2.setVisible(false);
		normalPane.add(panel2);
		
		List<Double> scores3 = new ArrayList<>();
		GraphPanel panel3 = new model.GraphPanel(scores3);
		panel3.setOpaque(false);
		panel3.setBorder(null);
		panel3.setBackground(new Color(238, 238, 238));
		panel3.setBounds(10,350,300,175);
		panel3.setPreferredSize(new Dimension(800, 600));
		panel3.setVisible(false);
		normalPane.add(panel3);
		
		List<Double> scores4 = new ArrayList<>();
		GraphPanel panel4 = new model.GraphPanel(scores4);
		panel4.setOpaque(false);
		panel4.setBorder(null);
		panel4.setBackground(new Color(238, 238, 238));
		panel4.setBounds(10,480,300,175);
		panel4.setPreferredSize(new Dimension(800, 600));
		panel4.setVisible(false);
		normalPane.add(panel4);
		
		List<Double> scores5 = new ArrayList<>();
		GraphPanel panel5 = new model.GraphPanel(scores5);
		panel5.setOpaque(false);
		panel5.setBorder(null);
		panel5.setBackground(new Color(238, 238, 238));
		panel5.setBounds(10,610,300,175);
		panel5.setPreferredSize(new Dimension(800, 600));
		panel5.setVisible(false);
		normalPane.add(panel5);
		
		List<Double> scores6 = new ArrayList<>();
		GraphPanel panel6 = new model.GraphPanel(scores6);
		panel6.setOpaque(false);
		panel6.setBorder(null);
		panel6.setBackground(new Color(238, 238, 238));
		panel6.setBounds(10,740,300,175);
		panel6.setPreferredSize(new Dimension(800, 600));
		panel6.setVisible(false);
		normalPane.add(panel6);
		
		List<Double> scores7 = new ArrayList<>();
		GraphPanel panel7 = new model.GraphPanel(scores7);
		panel7.setOpaque(false);
		panel7.setBorder(null);
		panel7.setBackground(new Color(238, 238, 238));
		panel7.setBounds(10,300,300,175);
		panel7.setPreferredSize(new Dimension(800, 600));
		normalPane.add(panel7);
		
		//Ações da interface gráfica
		
		
		button.addActionListener(new AcoesSimulacao2(amp, ond1, ond2, ond3, ond4, ond5,
				spinner, Ang, panel, panel2, panel3,
				panel4, panel5, panel6, panel7, maxDataPoints,
				Ordem_spinner, Ordem_spinner2, Ordem_spinner3, Ordem_spinner4,
				Ordem_spinner5, spinner1, spinner2, spinner3,
				spinner4, spinner5, Resulted, Result, saida, Ser,
				ampliond1, ampliond2, ampliond3, ampliond4, ampliond5,
				Ampl1, Ampl2, Ampl3, Ampl4, Ampl5, ampl1,
				ampl2, ampl3, ampl4, ampl5, spinner1_label,
				spinner1_label2, spinner1_label3, spinner1_label4, spinner1_label5,
				Ordem1, Ordem2, Ordem3, Ordem4, Ordem5, Harm));
		
			
		}
	}
