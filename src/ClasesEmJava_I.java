import java.util.ArrayList;

import com.br.entities.Carro;
import com.br.entities.Pessoa;

public class ClasesEmJava_I {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro("awj",150.00,2000.00,2000.00,"amarelo","fiat",4,10.00,1,false);
		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		System.out.println(carro3.imprimir());
		
		carro.setModelo("fusca");
		carro.setCor("preto");
		carro.setNumChassi("8BW");
		carro.setVelocidadeMaxima(100.00);
		carro.setVelocidade(300.00);
		
		carro1.setModelo("fiat");
		carro1.setCor("branco");
		carro1.setNumChassi("8BW2");
		carro1.setVelocidadeMaxima(150.00);
		
		
		carro2.setModelo("celta");
		carro2.setCor("rosa");
		carro2.setNumChassi("0BW");
		carro2.setVelocidadeMaxima(220.00);
		
		carros.add(carro);
		carros.add(carro1);
		carros.add(carro2);
		
		System.out.println(carro.imprimir());
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("kennedy");
		pessoa.setIdade(300);
		pessoa.setCpf("999.999.999-99");
		
		pessoa.setCarro(carro);
		pessoa.setCarros(carros);
		System.out.println(pessoa.imprimir());
		
		System.out.println("Carros:\n");
		
		for(Carro item: pessoa.getCarros()) {
			
			System.out.println(item.getModelo());
			System.out.println(item.getCor());
			System.out.println(item.getNumChassi());
		}
		
	
	}
}
