package fabricaVeiculos;

import java.util.Date;

/**
 * 
 * 
 * @author Guilherme Serafim
 *
 */
public abstract class Veiculo {
    protected String marca;
    protected String cor;
    protected String modelo;
    protected Date anoDeFabrica;
    protected String tipoDeCombustivel;
    protected int velocidadeAtual;
    protected int limiteMaximo;
	
    // Construtor
    public Veiculo(String marca, String cor, String modelo, Date anoDeFabrica, String tipoDeCombustivel,
		 int velocidadeAtual, int limiteMaximo) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.anoDeFabrica = anoDeFabrica;
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.velocidadeAtual = velocidadeAtual;
		this.limiteMaximo = limiteMaximo;
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
	
	public abstract boolean desligar(boolean desligado, int velocidadeAtual, int limiteMaximo);
	
	public abstract boolean ligar(boolean ligado, int velocidadeAtual, int limiteMaximo);
	
	public abstract void freiar(int qtdParaFrear, boolean ligadoDesligado, int velocidadeAtual);
	
	public abstract void mostrarDados();
	
    

}



