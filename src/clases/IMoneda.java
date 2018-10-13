package clases;

import java.util.Random;

public interface IMoneda {

	private boolean cara;
	
	public void sortear() {
		Random x = new Random();
		this.cara = x.nextBoolean();
	}
	public boolean esCara() {
		return this.cara;
	}
	public boolean esCruz() {
		return !this.cara;
	}

}
// SACAR  IMPLEMENTACION DE INTERFAZ Y PONERLO EN CLASE IMPLEMENTADORA