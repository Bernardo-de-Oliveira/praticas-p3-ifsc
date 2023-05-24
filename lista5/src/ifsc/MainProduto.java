package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		ArrayList<Produto> prod = new ArrayList<>();
		
		Produto a = new Produto();
		a.setNome("Cadeira");
		a.setPreco(399.99);
		a.setFornecedor("Casas Bahia");
		a.setCodBarras(345l);
		prod.add(a);
		
		Produto b = new Produto();
		b.setNome("Teclado");
		b.setPreco(499.99);
		b.setFornecedor("Razer");
		b.setCodBarras(123l);
		prod.add(b);
		
		Produto c = new Produto();
		c.setNome("Fone");
		c.setPreco(399.99);
		c.setFornecedor("Razer");
		c.setCodBarras(678l);
		prod.add(c);
		
		for(int i = 0;i<prod.size();i++) {
			System.out.println(prod.get(i).getNome());
			System.out.println(prod.get(i).getPreco());
			System.out.println(prod.get(i).getFornecedor());
			System.out.println(prod.get(i).getCodBarras());
			System.out.println("\n");
		}
		
	}

}
