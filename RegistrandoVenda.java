
public class RegistrandoVenda {
	public static void main(String[] args) {

	
		
		
		Produto pao = new Produto("1", "PRODUTO 1", 200, 100, false);
		Vendedor xico = new Vendedor("GUILHERME", "SANTA RITA - PB", "1");
		Venda vendaPao = new Venda();

		
		vendaPao.setProduto(pao);
		vendaPao.setVendedor(xico);
		vendaPao.setQuantidadeItens(2);
		vendaPao.setDesconto(0);
		vendaPao.setValor(Venda.calcularValor(vendaPao.quantidadeItens, pao.valorVenda));

	
		Venda.imprimir(vendaPao, Venda.calcularComissao(Vendedor.COMISSAO, vendaPao.valor, pao.promocao));


		
		Produto escovaDente = new Produto("2", "PRODUTO 2", 100, 80, true);
		Vendedor nandinho = new Vendedor("LEO", "JOÃO PESSOA - PB", "2");
		Venda vendaEscova = new Venda();

		
		vendaEscova.setProduto(escovaDente);
		vendaEscova.setVendedor(nandinho);
		vendaEscova.setQuantidadeItens(3); 
		vendaEscova.setDesconto(vendaEscova.efetuarDesconto(escovaDente.valorVenda * 0.1, escovaDente.valorVenda,
				escovaDente.valorCusto));
		vendaEscova.setValor(Venda.calcularValor(vendaEscova.quantidadeItens, vendaEscova.desconto));

		
		Venda.imprimir(vendaEscova, Venda.calcularComissao(Vendedor.COMISSAO, vendaEscova.valor, escovaDente.promocao));

		
		Venda vendaEscova2 = new Venda();
		
		
		vendaEscova2.setProduto(escovaDente);
		vendaEscova2.setVendedor(nandinho);
		vendaEscova2.setQuantidadeItens(2); 
		vendaEscova2.setDesconto(vendaEscova2.efetuarDesconto(escovaDente.valorVenda * 0.3, escovaDente.valorVenda,
				escovaDente.valorCusto));
		vendaEscova2.setValor(Venda.calcularValor(vendaEscova2.quantidadeItens, vendaEscova2.desconto));

		
		Venda.imprimir(vendaEscova2,
				Venda.calcularComissao(Vendedor.COMISSAO, vendaEscova2.valor, escovaDente.promocao));

	}
}
