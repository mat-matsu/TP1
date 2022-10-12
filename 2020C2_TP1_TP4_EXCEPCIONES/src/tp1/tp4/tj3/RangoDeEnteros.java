package tp1.tp4.tj3;

public class RangoDeEnteros {
	private int limiteInferior;
	private int limiteSuperior;

	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {
		// TODO implementar
		if(limiteInferior > limiteSuperior) {
			this.setLimiteInferior(limiteSuperior);
			this.setLimiteSuperior(limiteInferior);
		} else {
			this.setLimiteInferior(limiteInferior);
			this.setLimiteSuperior(limiteSuperior);
		}
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public boolean incluye(int aux) {
		return (aux >= getLimiteInferior() && aux <= getLimiteSuperior());
	}

	private void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	
	private void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	@Override
	public String toString() {
		return ". Debe ser superior o igual a " + limiteInferior + " e inferior o igual a " + limiteSuperior + ".";
	}
	
	
}
