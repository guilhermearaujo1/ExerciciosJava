
public class Venda {
	Produto produto;
	Vendedor vendedor;

	public double valor;
	public double desconto;
	public int quantidadeItens;

	
	public double efetuarDesconto(double desconto, double valor, double valorCusto) {

		double total = valor;

		if ((valor - desconto) > valorCusto)
			total = (valor - desconto);
		else
			total = valorCusto;

		return total;

	}

	
	public static double calcularValor(int qtdItens, double valor) {
		return (qtdItens * valor);
	}

	
	public static double calcularComissao(double comissao, double valor, boolean promocao) {

		double total = valor * (comissao / 100);

		if (promocao == true)
			total /= 2;

		return total;

	}

	
	public static void imprimir(Venda venda, double comissao) {

		System.out.print(" " + venda.produto.codigo + "    " + venda.produto.descricao + "    " + venda.quantidadeItens
				+ "  x  " + venda.produto.valorVenda + "      ");

		if (venda.desconto != 0)
			System.out.print((venda.produto.valorVenda - venda.desconto));
		else
			System.out.print("  0.0");

		System.out.print("      " + venda.valor);

		
		System.out.println(
				"QUANTIDADE TOTAL DE ITENS:                                          " + venda.quantidadeItens);

		System.out.print("O PRODUTO ");
		if (venda.produto.promocao == false)
			System.out.print("N�O ");
		System.out.println("EST� NA PROMO��O!");

		System.out.println("SUBTOTAL:                                                   R$ "
				+ (venda.produto.valorVenda * venda.quantidadeItens) + "0");

		if (venda.desconto != 0)
			System.out.println("DESCONTO:                                                   R$  "
					+ ((venda.produto.valorVenda - venda.desconto) * venda.quantidadeItens) + "0");
		else
			System.out.println("DESCONTO:                                                   R$   0.00");

		System.out.println("VALOR A PAGAR:                                              R$ " + venda.valor + "0");
	
		System.out.println(
				"C�DIGO:                                                             " + venda.vendedor.codigo);
		System.out.println("VENDEDOR:                                                       " + venda.vendedor.nome);
		System.out.println("COMISS�O:                                                   R$  " + comissao + "0");
		
	}

	//Getters e setters
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
}
