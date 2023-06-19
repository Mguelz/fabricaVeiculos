package fabricaVeiculos;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException {

		Transmissao transmissao1 = new Transmissao("Manual", "8 marchas");
		Roda roda1 = new Roda("Preto", "Mercedes-Benz", 4, 9, 23, 8);
		Motor motor1 = new Motor("Om 447 La", "Gasolina comum", 12, 12, 1500);

		Caminhao caminhao = new Caminhao("Mercedes-Benz", "Amarelo", "AROCS", "2004", 106, motor1, roda1, transmissao1);
		
		boolean ligadoDesligado = true;
		
		caminhao.verificarSeEstaLigado(ligadoDesligado);
		caminhao.acelerar(10, ligadoDesligado, caminhao.getVelocidadeAtual());
		caminhao.acelerar(20, ligadoDesligado, caminhao.getVelocidadeAtual());
		caminhao.frear(10, ligadoDesligado, caminhao.getVelocidadeAtual());
		caminhao.mostrarDados();
		
		///////////////////////////////////////////////////////////////////////
		
		Transmissao transmissao2 = new Transmissao("tipoCambio", "Embreagem");
		Roda roda2 = new Roda("cor", "marca", 50, 60, 12, 2);
		Motor motor2 = new Motor("tipoMotor", "tipoGasolina", 100, 250, 225);

		Carro carro = new Carro("marca", "cor", "modelo", "2010", 200, motor2, roda2, transmissao2);
		
		carro.verificarSeEstaLigado(ligadoDesligado);
		carro.acelerar(10, ligadoDesligado, carro.getVelocidadeAtual());
		carro.acelerar(150, ligadoDesligado, carro.getVelocidadeAtual());
		carro.frear(10, ligadoDesligado, carro.getVelocidadeAtual());
		carro.mostrarDados();
		
		///////////////////////////////////////////////////////////////////////

		Transmissao transmissao3 = new Transmissao("tipoCambio", "Embreagem");
		Roda roda3 = new Roda("cor", "marca", 50, 60, 12, 2);
		Motor motor3 = new Motor("tipoMotor", "tipoGasolina", 100, 250, 225);

		Moto moto = new Moto("marca", "cor", "modelo", "2020", 150, motor3, roda3, transmissao3);
		
		moto.verificarSeEstaLigado(ligadoDesligado);
		moto.acelerar(10, ligadoDesligado, moto.getVelocidadeAtual());
		moto.acelerar(140, ligadoDesligado, moto.getVelocidadeAtual());
		moto.frear(10, ligadoDesligado, moto.getVelocidadeAtual());
		moto.mostrarDados();
		
	}

}
