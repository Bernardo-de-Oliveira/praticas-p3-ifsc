package ifsc;

public class MainAnimal {
	public static void main(String[] args) {
		Cachorro gx = new Cachorro();
		
		gx.setNome("Punpun");
		gx.setRaca("Husky Siberiano");
		gx.setComprimento((float)0.58);
		gx.setNpatas(4);
		gx.setCor("Branco");
		gx.setEco("Casa");
		
		Gato puxar = new Gato();
		puxar.setNome("Phos");
		puxar.setRaca("Persa");
		puxar.setComprimento((float)0.28);
		puxar.setNpatas(4);
		puxar.setCor("Laranja");
		puxar.setEco("Casa");
		
		System.out.println(gx.getNome());
		System.out.println(gx.getRaca());
		System.out.println(gx.getComprimento());
		System.out.println(gx.getNpatas());
		System.out.println(gx.getCor());
		System.out.println(gx.getEco());
		System.out.println("");
		
		gx.late();
		
		System.out.println("");
		System.out.println(puxar.getNome());
		System.out.println(puxar.getRaca());
		System.out.println(puxar.getComprimento());
		System.out.println(puxar.getNpatas());
		System.out.println(puxar.getCor());
		System.out.println(puxar.getEco());
		System.out.println("");
		
		puxar.mia();  
		
	}

}
