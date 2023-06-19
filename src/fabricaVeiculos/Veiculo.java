package fabricaVeiculos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Felipi 
 * @author Guilherme 
 * @author Ikram
 * @author Isabelle
 * @author Miguel 
 *
 */

public abstract class Veiculo { // marca, cor, modelo, anoDeFabrica, tipoDeCombustivel, velocidadeAtual,
								// limiteMaximo, motor, roda, transmissao
	protected String marca;
	protected String cor;
	protected String modelo;
	protected Date anoDeFabrica;
	protected String tipoDeCombustivel;
	protected int velocidadeAtual;
	protected int limiteMaximo;
	protected Motor motor;
	protected Roda roda;
	protected Transmissao transmissao;

	// Construtor
	public Veiculo(String marca, String cor, String modelo, String anoDeFabrica, String tipoDeCombustivel,
			int velocidadeAtual, int limiteMaximo, Motor motor, Roda roda, Transmissao transmissao)
			throws ParseException {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		this.anoDeFabrica = format.parse(anoDeFabrica);
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.velocidadeAtual = velocidadeAtual;
		this.limiteMaximo = limiteMaximo;
		this.motor = motor;
		this.roda = roda;
		this.transmissao = transmissao;
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getAnoDeFabrica() {
		return anoDeFabrica;
	}

	public void setAnoDeFabrica(Date anoDeFabrica) {
		this.anoDeFabrica = anoDeFabrica;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getLimiteMaximo() {
		return limiteMaximo;
	}

	public void setLimiteMaximo(int limiteMaximo) {
		this.limiteMaximo = limiteMaximo;
	}

	// Métodos abstratos
	public abstract boolean acelerar(int qtdParaAcelerar, boolean ligadoDesligado, int velocidadeAtual);

	public abstract boolean verificarSeEstaLigado(boolean valor);

	public abstract void frear(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual);

	public abstract void mostrarDados();
	

}
