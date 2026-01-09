package entities;

public class Resumo {
		private String nome;
		private Double preco;
		private Double quantidade;
		
		
		public Resumo () {
			
		}


		public Resumo(String nome, Double preco, Double quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}


		public Resumo(Double preco, Double quantidade) {
			this.preco = preco;
			this.quantidade = quantidade;
		}


		public Double getPreco() {
			return preco;
		}


		public void setPreco(Double preco) {
			this.preco = preco;
		}


		public Double getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(Double quantidade) {
			this.quantidade = quantidade;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Double valorTotal() {
			return preco*quantidade;
		}
		
		
}
