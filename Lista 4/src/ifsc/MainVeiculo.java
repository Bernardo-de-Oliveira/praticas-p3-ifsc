package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo Fusca = new Veiculo();
		Fusca.setNome("Fusca");
		Fusca.setAno(2000);
		Fusca.setCor("Azul");
		
		System.out.println("O carro é um "+ Fusca.getNome());
		System.out.println("do ano "+ Fusca.getAno());
		System.out.println("da cor "+ Fusca.getCor());
		
	}
	
}
