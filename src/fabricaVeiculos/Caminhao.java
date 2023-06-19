package fabricaVeiculos;

import java.util.Date;

/**
 * 
 * @author Felipe
 * @author Ikram
 *
 */
public class Caminhao extends Veiculo {

	public Caminhao(String marca, String cor, String modelo, Date anoDeFabrica, String tipoDeCombustivel,
			int velocidadeAtual, int limiteMaximo, Motor motor, Roda roda, Transmissao transmissao) {

		super(marca, cor, modelo, anoDeFabrica, tipoDeCombustivel, velocidadeAtual, limiteMaximo, motor, roda,
				transmissao);
	}

	@Override
	public boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual) {
		int velocidadeDesejada = this.velocidadeAtual + qtdParaAcelerar;
		verificarSeEstaLigado(ligadoDesligado);
		if (ligadoDesligado == true && velocidadeDesejada <= this.limiteMaximo) {
			this.velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Acelerando...");
			System.out.println("Velocidade atual " + this.velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.out.println("Nao eh possivel acelerar, pois o Carro esta desligado");
		} else if (velocidadeDesejada >= this.limiteMaximo) {
			this.velocidadeAtual = this.limiteMaximo;
			System.out.println("Nao eh possivel acelerar, pois a velocidade maxima é " + this.limiteMaximo);
			System.out.println("Velocidade atual " + this.limiteMaximo + "Km/h");
		}
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
		if (valor == true) {
			return true;
		}
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

}
