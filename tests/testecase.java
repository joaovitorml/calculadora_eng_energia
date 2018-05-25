import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testecase {
	public double amplitude1;
	public double Ang1;
	public double amplitude2;
	public double Ang2;
	public int potenciaAtiva;
	public int potenciaReativa;
	public int potenciaAparente;
	public float fatorDePotencia;
	public AcoesSimulacao1 simulation;
	
	
	@BeforeEach
	public void beforeTests() {
		amplitude1 = 220;
		Ang1 = 0;
		amplitude2 = 39;
		Ang2 = 35;
		simulation = new Simulacao1();
	}
	
	
	@Test
	public void testaCalc1() {
		potenciaAtiva = 7028;
		potenciaReativa = -4921;
		potenciaAparente = 8580;
		fatorDePotencia = 0.82;
		
		assertEquals(potenciaAtiva,simulation.getValor3());
		assertEquals(potenciaReativa,simulation.getValor4());
		assertEquals(potenciaAparente,simulation.getValor5());
		assertEquals(fatorDePotencia,simulation.getValor6());
	}

}
