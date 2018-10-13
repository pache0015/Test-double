package clases;

public class GuerreroAzar {

	private Integer puntosVida;
	private Integer puntosAtaque;
	private IMoneda moneda;
	
	public GuerreroAzar(Integer pVida, Integer pAtaque, IMoneda _moneda) {
		 puntosAtaque = pAtaque;
		 puntosVida = pVida;
		 moneda = _moneda;
	}
	
	public void atacar(IGuerrero g) {
		if(moneda.esCara) {
			g.descontarVida(this.puntosVida);
		}
		if (moneda.esCruz()) {
			this.descontarVida(this.puntosAtaque);
		}
	}
	public void descontarVida(Integer pa) {
		puntosVida -= pa;
	}
}
