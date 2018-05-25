package view;

import java.util.ArrayList;
import java.util.List;
import model.GraphPanel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.AcoesSimulacao1;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import java.awt.Cursor;
import javax.swing.DebugGraphics;
public class Simulacao1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField PotenciaAtiva_text;
	private JTextField PotenciaReativa_text;
	private JTextField PotenciaAparente_text;
	private JTextField FatordePotencia_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulacao1 frame = new Simulacao1();
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
	public Simulacao1() {
		setResizable(false);
		setTitle("Fluxo de Potência Fundamental");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Objetos da interface gráfica
		
		JLabel Entrada = new JLabel("Entradas");
		Entrada.setHorizontalAlignment(SwingConstants.CENTER);
		Entrada.setFont(new Font("Dialog", Font.BOLD, 20));
		Entrada.setBounds(300, 12, 176, 24);
		contentPane.add(Entrada);
		
		JLabel saidas = new JLabel("Saídas");
		saidas.setBounds(300, 300, 176, 24);
		contentPane.add(saidas);
		saidas.setHorizontalAlignment(SwingConstants.CENTER);
		saidas.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JLabel veff = new JLabel("Veff");
		veff.setBounds(315, 45, 114, 15);
		contentPane.add(veff);
		
		JProgressBar Veff = new JProgressBar();
		Veff.setMaximum(220);
		Veff.setOrientation(SwingConstants.VERTICAL);
		Veff.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		Veff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Veff.setAutoscrolls(true);
		Veff.setBounds(320, 70, 14, 50);
		contentPane.add(Veff);
		
		JLabel subtitulo_saida = new JLabel("Potência Instantânea");
		subtitulo_saida.setBounds(70, 330, 198, 15);
		contentPane.add(subtitulo_saida);
		
		JLabel PotenciaAtiva = new JLabel("Potência Ativa");
		PotenciaAtiva.setBounds(10, 480, 198, 15);
		contentPane.add(PotenciaAtiva);
		
		PotenciaAtiva_text = new JTextField();
		PotenciaAtiva_text.setEditable(false);
		PotenciaAtiva_text.setBounds(200, 480, 114, 19);
		contentPane.add(PotenciaAtiva_text);
		PotenciaAtiva_text.setColumns(10);
		
		JLabel PotenciaReativa = new JLabel("Potência Reativa");
		PotenciaReativa.setBounds(10, 510, 198, 15);
		contentPane.add(PotenciaReativa);
		
		PotenciaReativa_text = new JTextField();
		PotenciaReativa_text.setEditable(false);
		PotenciaReativa_text.setColumns(10);
		PotenciaReativa_text.setBounds(200, 510, 114, 19);
		contentPane.add(PotenciaReativa_text);
		
		JLabel PotenciaAparente = new JLabel("Potência Aparente");
		PotenciaAparente.setBounds(10, 540, 198, 15);
		contentPane.add(PotenciaAparente);
		
		PotenciaAparente_text = new JTextField();
		PotenciaAparente_text.setEditable(false);
		PotenciaAparente_text.setColumns(10);
		PotenciaAparente_text.setBounds(200, 540, 114, 19);
		contentPane.add(PotenciaAparente_text);
		
		JLabel FatordePotencia = new JLabel("Fator de Potência");
		FatordePotencia.setBounds(10, 570, 198, 15);
		contentPane.add(FatordePotencia);
		
		FatordePotencia_text = new JTextField();
		FatordePotencia_text.setEditable(false);
		FatordePotencia_text.setColumns(10);
		FatordePotencia_text.setBounds(200, 570, 114, 19);
		contentPane.add(FatordePotencia_text);
		
		JLabel tensao = new JLabel("Tensão");
		tensao.setBounds(70, 10, 198, 15);
		contentPane.add(tensao);
		
		JLabel corrente = new JLabel("Corrente");
		corrente.setBounds(70, 160, 198, 15);
		contentPane.add(corrente);
		
		JLabel aeff = new JLabel("Aeff");
		aeff.setBounds(315, 180, 114, 15);
		contentPane.add(aeff);
		
		JProgressBar progress = new JProgressBar();
		progress.setOrientation(SwingConstants.VERTICAL);
		progress.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		progress.setAutoscrolls(true);
		progress.setBounds(320, 205, 14, 50);
		contentPane.add(progress);
		
		JLabel TituloAngulo1 = new JLabel("Angulo de Fase [θ°] ");
		TituloAngulo1.setBounds(426, 50, 198, 15);
		contentPane.add(TituloAngulo1);
		
		JSpinner angulo = new JSpinner();
		angulo.setModel(new SpinnerNumberModel(0, -180, 180, 1));		
		angulo.setBounds(426, 70, 151, 20);
		contentPane.add(angulo);
		
		JLabel Amp_label = new JLabel("Amplitude");
		Amp_label.setBounds(426, 105, 198, 15);
		contentPane.add(Amp_label);
		
		JSpinner Amp = new JSpinner();
		Amp.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		Amp.setBounds(426, 126, 151, 20);
		contentPane.add(Amp);
		
		JLabel TituloAngulo2 = new JLabel("Angulo de Fase [θ°] ");
		TituloAngulo2.setBounds(426, 180, 198, 15);
		contentPane.add(TituloAngulo2);
		
		JSpinner angulo2 = new JSpinner();
		angulo2.setModel(new SpinnerNumberModel(0, -180, 180, 1));
		angulo2.setBounds(426, 200, 151, 20);
		contentPane.add(angulo2);
		
		JLabel Amp2_label = new JLabel("Amplitude");
		Amp2_label.setBounds(426, 243, 198, 15);
		contentPane.add(Amp2_label);
		
		JSpinner Amp2 = new JSpinner();
		Amp2.setModel(new SpinnerNumberModel(0, 0, 220, 1));
		Amp2.setBounds(426, 268, 151, 20);
		contentPane.add(Amp2);
		
		List<Double> scores = new ArrayList<>();
		int maxDataPoints = 50;
		GraphPanel panel3 = new model.GraphPanel(scores);
		panel3.setOpaque(false);
		panel3.setBorder(null);
		panel3.setBackground(new Color(238, 238, 238));
		panel3.setBounds(10,330,300,175);
		panel3.setPreferredSize(new Dimension(800, 600));
		contentPane.add(panel3);
		
		
		List<Double> scores2 = new ArrayList<>();
		GraphPanel panel2 = new model.GraphPanel(scores2);
		panel2.setOpaque(false);
		panel2.setBorder(null);
		panel2.setBackground(new Color(238, 238, 238));
		panel2.setBounds(10,160,300,175);
		panel2.setPreferredSize(new Dimension(800, 600));
		contentPane.add(panel2);
		
		
		List<Double> scores3 = new ArrayList<>();
		GraphPanel panel = new model.GraphPanel(scores3);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setBackground(new Color(238, 238, 238));
		panel.setBounds(10,12,300,175);
		panel.setPreferredSize(new Dimension(800, 600));
		contentPane.add(panel);
		
		
		//Ações da interface gráfica
		
		
		
		JButton button1 = new JButton("SIMULAR");
		button1.addActionListener(new AcoesSimulacao1(Veff, progress, Amp, Amp2, panel, panel2, panel3, angulo, angulo2, maxDataPoints, PotenciaAtiva_text,
				PotenciaReativa_text, PotenciaAparente_text, FatordePotencia_text));
		button1.setBounds(400, 570, 100, 20);
		contentPane.add(button1);
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(0, 150, 800, 4);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 290, 800, 40);
		contentPane.add(separator_1);
		
		JTextArea triang = new JTextArea();
		triang.setLineWrap(true);
		triang.setFont(new Font("Dialog", Font.BOLD, 18));
		triang.setEditable(false);
		triang.setText("Triângulo de  Potência indisponível no momento");
		triang.setBounds(426, 342, 308, 80);
		contentPane.add(triang);
	}
}

