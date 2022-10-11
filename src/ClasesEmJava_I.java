import java.util.ArrayList;

import com.br.entities.Aluno;
import com.br.entities.Carro;
import com.br.entities.Pessoa;

public class ClasesEmJava_I {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		Carro carro3 = new Carro("awj",150.00,2000.00,2000.00,"amarelo","fiat",4,10.00,1,false);
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		ArrayList<Double> notas = new ArrayList<>();
		ArrayList<String> aprovadas = new ArrayList<>();
		ArrayList<String> matriculadas = new ArrayList<>();
		
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
		
		
		
		Aluno aluno = new Aluno("Darlan", "kennedy", "115609", "EPC");
		
		System.out.println(aluno.imprimirAluno());
		System.out.println("------------------------------------------\n\n");
		
		aluno.atualizarNome("teste1");
		aluno.atualizarMatricula("adaw232323");
		aluno.atualizarSobrenome("dawd");
		aluno.atualizarCurso("engenharia");
		
		notas.add(20.10);
		notas.add(10.00);
		notas.add(60.00);
		notas.add(60.00);
		notas.add(80.00);
		notas.add(100.00);
		
		
		matriculadas.add("matematica");
		matriculadas.add("matematica2");
		matriculadas.add("matematica3");
		matriculadas.add("matematica4");
		matriculadas.add("matematica5");
		
			
		aprovadas.add("ciencias");
		aprovadas.add("historia");
		
		aluno.setNotas(notas);
		aluno.setDisciplinasMatriculadas(matriculadas);
		aluno.setDisciplinasAprovadas(aprovadas);
		
		
		System.out.println(aluno.imprimirAluno());
		
		
		System.out.println("------------------------------------------\n");
		
		
		for (int i = 0; i < aluno.getDisciplinasAprovadas().size(); i++) {
			System.out.println(" Aprovadas: "+aluno.getDisciplinasAprovadas().get(i)+"\n");
		}
		
		for (int i = 0; i < aluno.getDisciplinasMatriculadas().size(); i++) {
			System.out.println(" matriculada: "+aluno.getDisciplinasMatriculadas().get(i)+"\n");
		}
		
		
	}
}
