package org.example.padroes.factory;

import java.math.BigDecimal;

public class ProdutoFisico extends Produto{
    public ProdutoFisico(String descricao, BigDecimal preco, Boolean posuiDimensoesFisicas) {
        super(descricao, preco, posuiDimensoesFisicas);
    }
    public ProdutoFisico() {
        super();
    }
}
