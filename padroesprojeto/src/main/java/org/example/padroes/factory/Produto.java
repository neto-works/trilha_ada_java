package org.example.padroes.factory;

import java.math.BigDecimal;

public class Produto {
    private String descricao;
    private BigDecimal preco;
    private Boolean posuiDimensoesFisicas;

    public Produto(){}
    public Produto(String descricao, BigDecimal preco, Boolean posuiDimensoesFisicas) {
        this.descricao = descricao;
        this.preco = preco;
        this.posuiDimensoesFisicas = posuiDimensoesFisicas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPosuiDimensoesFisicas() {
        return posuiDimensoesFisicas;
    }

    public void setPosuiDimensoesFisicas(Boolean posuiDimensoesFisicas) {
        this.posuiDimensoesFisicas = posuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", posuiDimensoesFisicas=" + posuiDimensoesFisicas +
                '}';
    }
}
