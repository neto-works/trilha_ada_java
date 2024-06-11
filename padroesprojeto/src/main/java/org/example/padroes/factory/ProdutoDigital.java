package org.example.padroes.factory;

import java.math.BigDecimal;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(String descricao, BigDecimal preco, Boolean posuiDimensoesFisicas) {
        super(descricao, preco, posuiDimensoesFisicas);
    }
    public ProdutoDigital() {
        super();
    }
}
