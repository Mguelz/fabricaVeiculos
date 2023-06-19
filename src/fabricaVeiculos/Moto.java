package fabricaVeiculos;

import java.util.Date;

/**
 * 
 * @author Felipe
 * @author Ikram
 *
 */
public class Moto extends Veiculo {

	public Moto(String marca, String cor, String modelo, Date anoDeFabrica, String tipoDeCombustivel,
			int velocidadeAtual, int limiteMaximo, Motor motor, Roda roda, Transmissao transmissao) {
		super(marca, cor, modelo, anoDeFabrica, tipoDeCombustivel, velocidadeAtual, limiteMaximo, motor, roda, transmissao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desligar(boolean desligado, int velocidadeAtual, int limiteMaximo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ligar(boolean ligado, int velocidadeAtual, int limiteMaximo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		// TODO Auto-generated method stub
		return false;
	}

}
