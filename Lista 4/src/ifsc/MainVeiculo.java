package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
		
		ArrayList<Produto> prod = new ArrayList<>();
		
		Veiculo Fusca = new Veiculo();
		Fusca.setNome("Fusca");
		Fusca.setAno(2000);
		Fusca.setCor("Azul");
		prod.add(1);
		
		Veiculo Fusca = new Veiculo();
		Fusca.setNome("Corsa");
		Fusca.setAno(2002);
		Fusca.setCor("Amarelo");
		prod.add(2);
		
		Veiculo Fusca = new Veiculo();
		Fusca.setNome("Veloster");
		Fusca.setAno(2012);
		Fusca.setCor("Preto");
		prod.add(3);
		
		for(int i = 0;i<prod.size();i++) {
		System.out.println("O carro é um "+ prod.get(i).getNome());
		System.out.println("do ano "+ prod.get(i).getAno());
		System.out.println("da cor "+ prod.get(i).getCor());
		}
		
	}
	
}
