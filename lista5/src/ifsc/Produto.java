package ifsc;

public class Produto {

	private String Nome;
	private Double Preco;
	private String Fornecedor;
	private Long CodBarras;

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getCodBarras() {
		return CodBarras;
	}

	public void setCodBarras(Long codBarras) {
		CodBarras = codBarras;
	}

}
