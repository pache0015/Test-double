package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import clases.IGuerrero;
import clases.IMoneda;

public class GuerreroAzarTest {
	private IMoneda moneda = Mockito.mock(IMoneda.class);
	private IGuerrero guerrero1 = new GuerreroAzar(5,5,moneda); //sut --> Siempre hace el exercise
	private IGuerrero wachin = Mockito.mock(IGuerrero.class);
	
	IGuerrero gspy = Mockito.spy(guerrero1);
	
	@Test
	public void UnGuerreroAzrAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentaVidaDelAdversario() {
		Mockito.when(moneda.esCara()).thenReturn(true);
		guerrero1.atacar(wachin);
		Mockito.verify(wachin).descontarVida(5);
		
	}

	@Test
	public void UnGuerreroAzrAtacaAOtroGuerreroYLaMonedaSaleCruzYSeDañaASiMismo() {
		when(moneda.esCara()).thenReturn(false);
		when(moneda.esCruz()).thenReturn(true);
		guerrero1.atacar(wachin);
		
		Mockito.verify(wachin, times(0)).descontarVida(5);
		
		Mockito.verify(gspy).descontarVida(5);
	}
}
