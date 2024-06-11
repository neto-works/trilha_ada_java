package org.example.padroes.factory;

public class ProdutoFactory {
    public static  Produto getInstance(TipoProdutoEnum tipoProdutoEnum){
        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico pf = new ProdutoFisico();
                pf.setPosuiDimensoesFisicas(true);
                return pf;
            case DIGITAL:
                ProdutoDigital pd = new ProdutoDigital();
                pd.setPosuiDimensoesFisicas(true);
                return pd;
            default:
                throw new IllegalArgumentException("Error in create, type of  product not exists");
        }
    }
}
