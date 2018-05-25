package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import model.GraphPanel;

public class AcoesSimulacao1 implements ActionListener{
	private JProgressBar Veff;
	private JProgressBar progress;
	private JSpinner Amp;
	private JSpinner Amp2;
	private GraphPanel panel;
	private GraphPanel panel2;
	private GraphPanel panel3;
	private JSpinner angulo;
	private JSpinner angulo2;
	private int maxDataPoints;
	private JTextField PotenciaReativa_text;
	private JTextField PotenciaAtiva_text;
	private JTextField PotenciaAparente_text;
	private JTextField FatordePotencia_text;
	
	public AcoesSimulacao1(JProgressBar Veff, JProgressBar progress, JSpinner Amp, JSpinner Amp2, GraphPanel panel,
		GraphPanel panel2, GraphPanel panel3, JSpinner angulo, JSpinner angulo2, int maxDataPoints,JTextField PotenciaAtiva_text, JTextField PotenciaReativa_text, 
		JTextField PotenciaAparente_text,JTextField FatordePotencia_text) {
		
			this.Veff = Veff;
			this.progress = progress;
			this.Amp = Amp;
			this.Amp2 = Amp2;
			this.panel = panel;
			this.panel2 = panel2;
			this.panel3 = panel3;
			this.angulo = angulo;
			this.angulo2 = angulo2;
			this.maxDataPoints = maxDataPoints;
			this.PotenciaAtiva_text = PotenciaAtiva_text;
			this.PotenciaReativa_text = PotenciaReativa_text;
			this.PotenciaAparente_text = PotenciaAparente_text;
			this.FatordePotencia_text = FatordePotencia_text;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		Veff.setValue((Integer)Amp.getValue());
		progress.setValue((Integer)Amp2.getValue());
		List<Double> scores = new ArrayList<>();
		for (int i = 0; i < maxDataPoints; i++) {
	          scores.add((double)Veff.getValue()*Math.cos(Math.toRadians(2 * Math.PI*60*i+(Integer)angulo.getValue())));
	        }
		panel.setScores(scores);
		List<Double> scores2 = new ArrayList<>();
		for (int i = 0; i < maxDataPoints; i++) {
	          scores2.add((double)progress.getValue()*Math.cos(Math.toRadians(2 * Math.PI*60*i+(Integer)angulo2.getValue())));
	        }
		panel2.setScores(scores2);
		List<Double> scores3 = new ArrayList<>();
        for (int i = 0; i < maxDataPoints; i++) {
          scores3.add((double)Veff.getValue()*Math.cos(Math.toRadians(2 * Math.PI*60*i+(Integer)angulo.getValue()))*(double)(progress.getValue()*Math.cos(Math.toRadians(2 * Math.PI*60*i+(Integer)angulo2.getValue()))));
        }
        panel3.setScores(scores3);
		try {
		    angulo2.commitEdit();
		} catch ( java.text.ParseException e ) { }
		int value = (Integer) angulo.getValue();
		try {
		    angulo.commitEdit();
		} catch ( java.text.ParseException e ) { }
		int value2 = (Integer) angulo2.getValue();
		if(value > 180 || value < -180 || value2 > 180 || value2 < -180) {
			JOptionPane.showMessageDialog(null,"Valor de ângulo inválido");
		}
		else {
		try {
		PotenciaAtiva_text.setText(String.valueOf((int)(progress.getValue()*Veff.getValue()*((float)Math.cos(Math.toRadians(value-value2))))+"  Watt"));
		PotenciaReativa_text.setText(String.valueOf((int)(progress.getValue()*Veff.getValue()*((float)Math.sin(Math.toRadians(value-value2))))+"  VAR"));
		PotenciaAparente_text.setText(String.valueOf(progress.getValue()*Veff.getValue()+ "  VA"));
		FatordePotencia_text.setText(String.valueOf((float)Math.cos((Math.toRadians(value-value2)))));
		}
		catch(NumberFormatException exp){
			System.exit(0);
			}
		}
		
	}
	
}
