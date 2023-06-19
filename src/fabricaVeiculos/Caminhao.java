package fabricaVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 
 * @author Felipi
 * @author Guilherme
 * @author Ikram
 * @author Isabelle
 * @author Miguel
 *
 */

public class Caminhao extends Veiculo {

	public Caminhao(String marca, String cor, String modelo, String anoDeFabrica, String tipoDeCombustivel,
			int velocidadeAtual, int limiteMaximo, Motor motor, Roda roda, Transmissao transmissao)
			throws ParseException {

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
		int velocidadeDesejada = this.velocidadeAtual - qtdParaFrear;
		if (ligadoDesligado == true && velocidadeDesejada > 0) {
			velocidadeAtual = velocidadeDesejada;
			System.out.println("");
			System.out.println("Freando");
			System.out.println("Velocidade atual " + velocidadeAtual + "Km/h");
		} else if (velocidadeDesejada < 0) {
			System.out.println(
					"Nao eh possivel frear mais, pois a velocidade atual do caro eh " + velocidadeAtual + "Km/h");
		} else if (ligadoDesligado == false) {
			System.out.println("O carro esta desligado");
		}

	}

	@Override
	public void mostrarDados() {
		SimpleDateFormat format = new SimpleDateFormat();
		String anoDeFabrica = format.format(this.anoDeFabrica);
		System.out.println("Caminhao: " + this.getMarca() + this.getModelo() + this.getCor()
				+ this.getTipoDeCombustivel() + anoDeFabrica + " - " + this.getLimiteMaximo() + "Km/h");
	}

	@Override
	public boolean verificarSeEstaLigado(boolean valor) {
		if (valor == true) {
			return true;
		}
		return false;
	}

	public void carregamento(boolean carregamento) {
		if (carregamento == true) {
			System.out.print("Caminhao esta carregado!");
		} else {
			System.out.print("Caminhao esta descarregado!");
		}
	}

}
