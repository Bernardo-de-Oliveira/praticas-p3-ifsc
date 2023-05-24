package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Veiculo> prod = new ArrayList<>();
		
		Veiculo Fusca = new Veiculo();
		Fusca.setNome("Fusca");
		Fusca.setAno(2000);
		Fusca.setCor("Azul");
		prod.add(Fusca);
		
		Veiculo Corsa = new Veiculo();
		Corsa.setNome("Corsa");
		Corsa.setAno(2002);
		Corsa.setCor("Amarelo");
		prod.add(Corsa);
		
		Veiculo Veloster = new Veiculo();
		Veloster.setNome("Veloster");
		Veloster.setAno(2012);
		Veloster.setCor("Preto");
		prod.add(Veloster);
		
		for(int i = 0;i<prod.size();i++) {
		System.out.println("O carro é um "+ prod.get(i).getNome());
		System.out.println("do ano "+ prod.get(i).getAno());
		System.out.println("da cor "+ prod.get(i).getCor());
		System.out.println("\n");
		}
		
	}
	
}
