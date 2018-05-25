package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;

import model.GraphPanel;


public class AcoesSimulacao2 implements ActionListener{
	
	private JProgressBar amp;
	private JProgressBar ond1;
	private JProgressBar ond2;
	private JProgressBar ond3;
	private JProgressBar ond4;
	private JProgressBar ond5;
	private JSpinner spinner;
	private JSpinner Ang;
	private GraphPanel panel;
	private GraphPanel panel2;
	private GraphPanel panel3;
	private GraphPanel panel4;
	private GraphPanel panel5;
	private GraphPanel panel6;
	private GraphPanel panel7;
	private int maxDataPoints;
	private JSpinner Ordem_spinner;
	private JSpinner Ordem_spinner2;
	private JSpinner Ordem_spinner3;
	private JSpinner Ordem_spinner4;
	private JSpinner Ordem_spinner5;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JSpinner spinner4;
	private JSpinner spinner5;
	private JLabel Resulted;
	private JLabel Result;
	private JLabel saida;
	private JLabel Ser;
	private JLabel ampliond1;
	private JLabel ampliond2;
	private JLabel ampliond3;
	private JLabel ampliond4;
	private JLabel ampliond5;
	private JLabel Ampl1;
	private JLabel Ampl2;
	private JLabel Ampl3;
	private JLabel Ampl4;
	private JLabel Ampl5;
	private JSpinner ampl1;
	private JSpinner ampl2;
	private JSpinner ampl3;
	private JSpinner ampl4;
	private JSpinner ampl5;
	private JLabel spinner1_label;
	private JLabel spinner1_label2;
	private JLabel spinner1_label3;
	private JLabel spinner1_label4;
	private JLabel spinner1_label5;
	private JLabel Ordem1;
	private JLabel Ordem2;
	private JLabel Ordem3;
	private JLabel Ordem4;
	private JLabel Ordem5;
	private JSpinner Harm;
	
	
	public AcoesSimulacao2(JProgressBar amp, JProgressBar ond1, JProgressBar ond2, JProgressBar ond3, JProgressBar ond4, JProgressBar ond5,
			JSpinner spinner, JSpinner Ang, GraphPanel panel, GraphPanel panel2, GraphPanel panel3,
			GraphPanel panel4, GraphPanel panel5, GraphPanel panel6, GraphPanel panel7,int maxDataPoints,
			JSpinner Ordem_spinner, JSpinner Ordem_spinner2, JSpinner Ordem_spinner3, JSpinner Ordem_spinner4,
			JSpinner Ordem_spinner5, JSpinner spinner1, JSpinner spinner2, JSpinner spinner3,
			JSpinner spinner4, JSpinner spinner5, JLabel Resulted, JLabel Result, JLabel saida, JLabel Ser,
			JLabel ampliond1, JLabel ampliond2, JLabel ampliond3, JLabel ampliond4, JLabel ampliond5,
			JLabel Ampl1, JLabel Ampl2, JLabel Ampl3, JLabel Ampl4, JLabel Ampl5, JSpinner ampl1,
			JSpinner ampl2, JSpinner ampl3, JSpinner ampl4, JSpinner ampl5, JLabel spinner1_label,
			JLabel spinner1_label2, JLabel spinner1_label3, JLabel spinner1_label4, JLabel spinner1_label5,
			JLabel Ordem1, JLabel Ordem2, JLabel Ordem3, JLabel Ordem4, JLabel Ordem5,JSpinner Harm)throws IOException {
				this.amp = amp;
				this.ond1 = ond1;
				this.ond2 = ond2;
				this.ond3 = ond3;
				this.ond4 = ond4;
				this.ond5 = ond5;
				this.spinner = spinner;
				this.Ang = Ang;
				this.panel = panel;
				this.panel2 = panel2;
				this.panel3 = panel3;
				this.panel4 = panel4;
				this.panel5 = panel5;
				this.panel6 = panel6;
				this.panel7 = panel7;
				this.maxDataPoints = maxDataPoints;
				this.Ordem_spinner = Ordem_spinner;
				this.Ordem_spinner2 = Ordem_spinner2;
				this.Ordem_spinner3 = Ordem_spinner3;
				this.Ordem_spinner4 = Ordem_spinner4;
				this.Ordem_spinner5 = Ordem_spinner5;
				this.spinner1 = spinner1;
				this.spinner2 = spinner2;
				this.spinner3 = spinner3;
				this.spinner4 = spinner4;
				this.spinner5 = spinner5;
				this.Resulted = Resulted;
				this.Result = Result;
				this.saida = saida;
				this.Ser = Ser;
				this.ampliond1 = ampliond1;
				this.ampliond2 = ampliond2;
				this.ampliond3 = ampliond3;
				this.ampliond4 = ampliond4;
				this.ampliond5 = ampliond5;
				this.Ampl1 = Ampl1;
				this.Ampl2 = Ampl2;
				this.Ampl3 = Ampl3;
				this.Ampl4 = Ampl4;
				this.Ampl5 = Ampl5;
				this.ampl1 = ampl1;
				this.ampl2 = ampl2;
				this.ampl3 = ampl3;
				this.ampl4 = ampl4;
				this.ampl5 = ampl5;
				this.spinner1_label = spinner1_label;
				this.spinner1_label2 = spinner1_label2;
				this.spinner1_label3 = spinner1_label3;
				this.spinner1_label4 = spinner1_label4;
				this.spinner1_label5 = spinner1_label5;
				this.Ordem1 = Ordem1;
				this.Ordem2 = Ordem2;
				this.Ordem3 = Ordem3;
				this.Ordem4 = Ordem4;
				this.Ordem5 = Ordem5;
				this.Harm = Harm;
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			//Cálculos das formas de onda
			amp.setValue((Integer)spinner.getValue());
			ond1.setValue((Integer)ampl1.getValue());
			ond2.setValue((Integer)ampl2.getValue());
			ond3.setValue((Integer)ampl3.getValue());
			ond4.setValue((Integer)ampl4.getValue());
			ond5.setValue((Integer)ampl5.getValue());
			List<Double> scores = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue()))));
		        }
			panel.setScores(scores);
			
			List<Double> scores2 = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores2.add((double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue()))));
		        }
			panel2.setScores(scores2);
			
			List<Double> scores3 = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores3.add((double)ond2.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner2.getValue())*2*Math.PI*60*i+(Integer)spinner2.getValue()))));
		        }
			panel3.setScores(scores3);
			
			List<Double> scores4 = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores4.add((double)ond3.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner3.getValue())*2*Math.PI*60*i+(Integer)spinner3.getValue()))));
		        }
			panel4.setScores(scores4);
			
			List<Double> scores5 = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores5.add((double)ond4.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner4.getValue())*2*Math.PI*60*i+(Integer)spinner4.getValue()))));
		        }
			panel5.setScores(scores5);
			
			List<Double> scores6 = new ArrayList<>();
			for (int i = 0; i < maxDataPoints; i++) {
		          scores6.add((double)ond5.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner5.getValue())*2*Math.PI*60*i+(Integer)spinner5.getValue()))));
		        }
			panel6.setScores(scores6);
			
			List<Double> scores7 = new ArrayList<>();
			if((Integer)Harm.getValue() == 0) {
				for (int i = 0; i < maxDataPoints; i++) {
			          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue()))));
			        }
				panel7.setScores(scores7);
			}
			else if((Integer)Harm.getValue() == 1) {
				for (int i = 0; i < maxDataPoints; i++) {
			          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue())))+
			        		  		(double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue()))));
			        }
				panel7.setScores(scores7);
			}
			else if((Integer)Harm.getValue() == 2) {
				for (int i = 0; i < maxDataPoints; i++) {
			          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue())))+
			        		  		(double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue())))+
			        		  		(double)ond2.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner2.getValue())*2*Math.PI*60*i+(Integer)spinner2.getValue()))));
			        }
				panel7.setScores(scores7);
				}
			else if((Integer)Harm.getValue() == 3) {
				for (int i = 0; i < maxDataPoints; i++) {
			          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue())))+
			        		  		(double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue())))+
			        		  		(double)ond2.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner2.getValue())*2*Math.PI*60*i+(Integer)spinner2.getValue())))+
			        		  		(double)ond3.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner3.getValue())*2*Math.PI*60*i+(Integer)spinner3.getValue()))));
			        }
				panel7.setScores(scores7);
				}
			else if((Integer)Harm.getValue() == 4) {
				for (int i = 0; i < maxDataPoints; i++) {
			          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue())))+
			        		  		(double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue())))+
			        		  		(double)ond2.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner2.getValue())*2*Math.PI*60*i+(Integer)spinner2.getValue())))+
			        		  		(double)ond3.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner3.getValue())*2*Math.PI*60*i+(Integer)spinner3.getValue())))+
			        		  		(double)ond4.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner4.getValue())*2*Math.PI*60*i+(Integer)spinner4.getValue()))));
			        }
				panel7.setScores(scores7);
				}
			
			else if((Integer)Harm.getValue() == 5) {
			for (int i = 0; i < maxDataPoints; i++) {
		          scores7.add((double)amp.getValue()*Math.cos(Math.toRadians((2*Math.PI*60*i+(Integer)Ang.getValue())))+
		        		  		(double)ond1.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner.getValue())*2*Math.PI*60*i+(Integer)spinner1.getValue())))+
		        		  		(double)ond2.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner2.getValue())*2*Math.PI*60*i+(Integer)spinner2.getValue())))+
		        		  		(double)ond3.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner3.getValue())*2*Math.PI*60*i+(Integer)spinner3.getValue())))+
		        		  		(double)ond4.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner4.getValue())*2*Math.PI*60*i+(Integer)spinner4.getValue())))+
		        		  		(double)ond5.getValue()*Math.cos(Math.toRadians(((Integer)(Ordem_spinner5.getValue())*2*Math.PI*60*i+(Integer)spinner5.getValue()))));
		        }
			panel7.setScores(scores7);
			}
			if((Integer)Harm.getValue() == 0) {
				Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"cos(wt)"));
				}
			else if((Integer)Harm.getValue() == 1) {
				Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"cos(wt)"+'+'+ond1.getValue()+"cos("+Ordem_spinner.getValue()+"wt"+'+'+spinner1.getValue()+"°)"));
				}
			else if((Integer)Harm.getValue() == 2) {
				Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"cos(wt)"+'+'+ond1.getValue()+"cos("+Ordem_spinner.getValue()+"wt"+'+'+spinner1.getValue()+"°)"+'+'+ond2.getValue()+"cos("+Ordem_spinner2.getValue()+"wt"+'+'+spinner2.getValue()+"°)"));
				}
			else if((Integer)Harm.getValue() == 3) {
				Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"+"+"cos(wt)"+'+'+ond1.getValue()+"cos("+Ordem_spinner.getValue()+"wt)"+'+'+ond2.getValue()+"cos("+Ordem_spinner2.getValue()+"wt"+'+'+spinner2.getValue()+"°)"+'+'+ond3.getValue()+"cos("+Ordem_spinner3.getValue()+"wt"+'+'+spinner3.getValue()+"°)"));
				}
			else if((Integer)Harm.getValue() == 4) {
				Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"+"+"cos(wt)"+'+'+ond1.getValue()+"cos("+Ordem_spinner.getValue()+"wt)"+'+'+ond2.getValue()+"cos("+Ordem_spinner2.getValue()+"wt"+'+'+spinner2.getValue()+"°)"+'+'+ond3.getValue()+"cos("+Ordem_spinner3.getValue()+"wt"+'+'+spinner3.getValue()+"°)"+'+'+ond4.getValue()+"cos("+Ordem_spinner4.getValue()+"wt"+'+'+spinner4.getValue()+"°)"));
				}
			else if((Integer)Harm.getValue() == 5) {
			Resulted.setText(String.valueOf("f(t)="+amp.getValue()+"cos(wt)"+'+'+ond1.getValue()+"cos("+Ordem_spinner.getValue()+"wt)"+'+'+ond2.getValue()+"cos("+Ordem_spinner.getValue()+"wt"+'+'+spinner2.getValue()+"°)"+'+'+ond3.getValue()+"cos("+Ordem_spinner3.getValue()+"wt"+'+'+spinner3.getValue()+"°)"+'+'+ond4.getValue()+"cos("+Ordem_spinner4.getValue()+"wt"+'+'+spinner4.getValue()+"°)"+'+'+ond5.getValue()+"cos("+Ordem_spinner5.getValue()+"wt"+'+'+spinner5.getValue()+"°)"));
			}
			if((Integer)Harm.getValue() == 0) {
				//Nenhuma forma de onda
				Result.setBounds(50, 300, 198, 15);
				panel7.setBounds(10,300,300,175);
				Ser.setBounds(450, 300, 267, 15);
				saida.setBounds(300, 260, 176, 24);
				Resulted.setBounds(450, 330, 267, 15);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				ampliond1.setVisible(false);
				ond1.setVisible(false);
				ampliond2.setVisible(false);
				ond2.setVisible(false);
				ampliond3.setVisible(false);
				ond3.setVisible(false);
				ampliond4.setVisible(false);
				ond4.setVisible(false);
				ampliond5.setVisible(false);
				ond5.setVisible(false);
				spinner1_label.setVisible(false);
				spinner1.setVisible(false);
				Ordem1.setVisible(false);
				Ordem_spinner.setVisible(false);
				spinner1_label2.setVisible(false);
				spinner2.setVisible(false);
				Ampl1.setVisible(false);
				ampl1.setVisible(false);
				Ampl2.setVisible(false);
				ampl2.setVisible(false);
				Ampl3.setVisible(false);
				ampl3.setVisible(false);
				Ampl4.setVisible(false);
				ampl4.setVisible(false);
				Ampl5.setVisible(false);
				ampl5.setVisible(false);
				Ordem2.setVisible(false);
				Ordem_spinner2.setVisible(false);
				spinner1_label3.setVisible(false);
				spinner3.setVisible(false);
				Ordem3.setVisible(false);
				Ordem_spinner3.setVisible(false);
				spinner1_label4.setVisible(false);
				spinner4.setVisible(false);
				Ordem4.setVisible(false);
				Ordem_spinner4.setVisible(false);
				spinner1_label5.setVisible(false);
				spinner5.setVisible(false);
				Ordem5.setVisible(false);
				Ordem_spinner5.setVisible(false);
			}
			if((Integer)Harm.getValue() == 1) {
				//Uma forma de onda
				Result.setBounds(50, 430, 198, 15);
				panel7.setBounds(10,430,300,175);
				Ser.setBounds(450, 430, 267, 15);
				saida.setBounds(300, 390, 176, 24);
				Resulted.setBounds(450, 460, 267, 15);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				ampliond1.setVisible(true);
				ond1.setVisible(true);
				ampliond2.setVisible(false);
				ond2.setVisible(false);
				ampliond3.setVisible(false);
				ond3.setVisible(false);
				ampliond4.setVisible(false);
				ond4.setVisible(false);
				ampliond5.setVisible(false);
				ond5.setVisible(false);
				spinner1_label.setVisible(true);
				spinner1.setVisible(true);
				Ampl1.setVisible(true);
				ampl1.setVisible(true);
				Ampl2.setVisible(false);
				ampl2.setVisible(false);
				Ampl3.setVisible(false);
				ampl3.setVisible(false);
				Ampl4.setVisible(false);
				ampl4.setVisible(false);
				Ampl5.setVisible(false);
				ampl5.setVisible(false);
				Ordem1.setVisible(true);
				Ordem_spinner.setVisible(true);
				spinner1_label2.setVisible(false);
				spinner2.setVisible(false);
				Ordem2.setVisible(false);
				Ordem_spinner2.setVisible(false);
				spinner1_label3.setVisible(false);
				spinner3.setVisible(false);
				Ordem3.setVisible(false);
				Ordem_spinner3.setVisible(false);
				spinner1_label4.setVisible(false);
				spinner4.setVisible(false);
				Ordem4.setVisible(false);
				Ordem_spinner4.setVisible(false);
				spinner1_label5.setVisible(false);
				spinner5.setVisible(false);
				Ordem5.setVisible(false);
				Ordem_spinner5.setVisible(false);
			}
			if((Integer)Harm.getValue() == 2) {
				//Duas formas de onda
				Result.setBounds(50, 560, 198, 15);
				panel7.setBounds(10,560,300,175);
				Ser.setBounds(450, 560, 267, 15);
				saida.setBounds(300, 520, 176, 24);
				Resulted.setBounds(450, 590, 267, 15);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(false);
				ampliond1.setVisible(true);
				ond1.setVisible(true);
				ampliond2.setVisible(true);
				ond2.setVisible(true);
				ampliond3.setVisible(false);
				ond3.setVisible(false);
				ampliond4.setVisible(false);
				ond4.setVisible(false);
				ampliond5.setVisible(false);
				ond5.setVisible(false);
				spinner1_label.setVisible(true);
				spinner1.setVisible(true);
				Ampl1.setVisible(true);
				ampl1.setVisible(true);
				Ampl2.setVisible(true);
				ampl2.setVisible(true);
				Ampl3.setVisible(false);
				ampl3.setVisible(false);
				Ampl4.setVisible(false);
				ampl4.setVisible(false);
				Ampl5.setVisible(false);
				ampl5.setVisible(false);
				Ordem1.setVisible(true);
				Ordem_spinner.setVisible(true);
				spinner1_label2.setVisible(true);
				spinner2.setVisible(true);
				Ordem2.setVisible(true);
				Ordem_spinner2.setVisible(true);
				spinner1_label3.setVisible(false);
				spinner3.setVisible(false);
				Ordem3.setVisible(false);
				Ordem_spinner3.setVisible(false);
				spinner1_label4.setVisible(false);
				spinner4.setVisible(false);
				Ordem4.setVisible(false);
				Ordem_spinner4.setVisible(false);
				spinner1_label5.setVisible(false);
				spinner5.setVisible(false);
				Ordem5.setVisible(false);
				Ordem_spinner5.setVisible(false);
			}
			if((Integer)Harm.getValue() == 3) {
				//Três formas de onda
				Result.setBounds(50, 690, 198, 15);
				panel7.setBounds(10,690,300,175);
				Ser.setBounds(450, 690, 267, 15);
				saida.setBounds(300, 660, 176, 24);
				Resulted.setBounds(450, 720, 267, 15);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(false);
				panel6.setVisible(false);
				ampliond1.setVisible(true);
				ond1.setVisible(true);
				ampliond2.setVisible(true);
				ond2.setVisible(true);
				ampliond3.setVisible(true);
				ond3.setVisible(true);
				ampliond4.setVisible(false);
				ond4.setVisible(false);
				ampliond5.setVisible(false);
				ond5.setVisible(false);
				spinner1_label.setVisible(true);
				spinner1.setVisible(true);
				Ampl1.setVisible(true);
				ampl1.setVisible(true);
				Ampl2.setVisible(true);
				ampl2.setVisible(true);
				Ampl3.setVisible(true);
				ampl3.setVisible(true);
				Ampl4.setVisible(false);
				ampl4.setVisible(false);
				Ampl5.setVisible(false);
				ampl5.setVisible(false);
				Ordem1.setVisible(true);
				Ordem_spinner.setVisible(true);
				spinner1_label2.setVisible(true);
				spinner2.setVisible(true);
				Ordem2.setVisible(true);
				Ordem_spinner2.setVisible(true);
				spinner1_label3.setVisible(true);
				spinner3.setVisible(true);
				Ordem3.setVisible(true);
				Ordem_spinner3.setVisible(true);
				spinner1_label4.setVisible(false);
				spinner4.setVisible(false);
				Ordem4.setVisible(false);
				Ordem_spinner4.setVisible(false);
				spinner1_label5.setVisible(false);
				spinner5.setVisible(false);
				Ordem5.setVisible(false);
				Ordem_spinner5.setVisible(false);
			}
			if((Integer)Harm.getValue() == 4) {
				//Quatro formas de onda
				Result.setBounds(50, 820, 198, 15);
				panel7.setBounds(10,820,300,175);
				Ser.setBounds(450, 820, 267, 15);
				saida.setBounds(300, 790, 176, 24);
				Resulted.setBounds(450, 850, 267, 15);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(true);
				panel6.setVisible(false);
				ampliond1.setVisible(true);
				ond1.setVisible(true);
				ampliond2.setVisible(true);
				ond2.setVisible(true);
				ampliond3.setVisible(true);
				ond3.setVisible(true);
				ampliond4.setVisible(true);
				ond4.setVisible(true);
				ampliond5.setVisible(false);
				ond5.setVisible(false);
				spinner1_label.setVisible(true);
				spinner1.setVisible(true);
				Ampl1.setVisible(true);
				ampl1.setVisible(true);
				Ampl2.setVisible(true);
				ampl2.setVisible(true);
				Ampl3.setVisible(true);
				ampl3.setVisible(true);
				Ampl4.setVisible(true);
				ampl4.setVisible(true);
				Ampl5.setVisible(false);
				ampl5.setVisible(false);
				Ordem1.setVisible(true);
				Ordem_spinner.setVisible(true);
				spinner1_label2.setVisible(true);
				spinner2.setVisible(true);
				Ordem2.setVisible(true);
				Ordem_spinner2.setVisible(true);
				spinner1_label3.setVisible(true);
				spinner3.setVisible(true);
				Ordem3.setVisible(true);
				Ordem_spinner3.setVisible(true);
				spinner1_label4.setVisible(true);
				spinner4.setVisible(true);
				Ordem4.setVisible(true);
				Ordem_spinner4.setVisible(true);
				spinner1_label5.setVisible(false);
				spinner5.setVisible(false);
				Ordem5.setVisible(false);
				Ordem_spinner5.setVisible(false);
			}
			if((Integer)Harm.getValue() == 5) {
				//Cinco formas de onda
				Result.setBounds(50, 950, 198, 15);
				panel7.setBounds(10,950,300,175);
				Ser.setBounds(450, 950, 267, 15);
				saida.setBounds(300, 920, 176, 24);
				Resulted.setBounds(450, 980, 267, 15);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(true);
				panel6.setVisible(true);
				ampliond1.setVisible(true);
				ond1.setVisible(true);
				ampliond2.setVisible(true);
				ond2.setVisible(true);
				ampliond3.setVisible(true);
				ond3.setVisible(true);
				ampliond4.setVisible(true);
				ond4.setVisible(true);
				ampliond5.setVisible(true);
				ond5.setVisible(true);
				spinner1_label.setVisible(true);
				spinner1.setVisible(true);
				Ampl1.setVisible(true);
				ampl1.setVisible(true);
				Ampl2.setVisible(true);
				ampl2.setVisible(true);
				Ampl3.setVisible(true);
				ampl3.setVisible(true);
				Ampl4.setVisible(true);
				ampl4.setVisible(true);
				Ampl5.setVisible(true);
				ampl5.setVisible(true);
				Ordem1.setVisible(true);
				Ordem_spinner.setVisible(true);
				spinner1_label2.setVisible(true);
				spinner2.setVisible(true);
				Ordem2.setVisible(true);
				Ordem_spinner2.setVisible(true);
				spinner1_label3.setVisible(true);
				spinner3.setVisible(true);
				Ordem3.setVisible(true);
				Ordem_spinner3.setVisible(true);
				spinner1_label4.setVisible(true);
				spinner4.setVisible(true);
				Ordem4.setVisible(true);
				Ordem_spinner4.setVisible(true);
				spinner1_label5.setVisible(true);
				spinner5.setVisible(true);
				Ordem5.setVisible(true);
				Ordem_spinner5.setVisible(true);
			}
		}
		catch(NumberFormatException exp){
			System.exit(0);
			}
		}
}
