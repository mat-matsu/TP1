package tp1.tp4.ej2;

public class RangoDeEnteros {
	private int limiteInferior;
	private int limiteSuperior;
	
	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {
		this.setLimiteInferior(limiteInferior);
		this.setLimiteSuperior(limiteSuperior);
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	private void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	private void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
	
}
