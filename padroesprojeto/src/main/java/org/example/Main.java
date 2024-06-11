package org.example;

import org.example.padroes.builder.Pessoa;
import org.example.padroes.builder.PessoaBuilder;
import org.example.padroes.builder.PessoaComBuilder;

public class Main {
    public static void main(String[] args) {
        // builder é um padrão que
        // - resolve dependencia de ordenação de parametragem
        Pessoa p = new Pessoa( "nome",  "sobreNome",  "documento",  "apelido",  "email",  "dataNascimento");
        System.out.println(p.toString());

        //  Com padrão builder, criamos uma classe que dar acersso a metodos, que podem ser chamados encadeadamente
        /*  E qual a sacada desse padrão?, a sacada é "criar uma classe Builder" criadora, que possui os metodos no qual retornam o
            proprio objeto deixando assim outros metodos serem chamados de forma encadeada.
            E por fim o metodo criador retorna um tipo conventional a Classe desejada.

            ex: public PessoaBuilder nome(String nome) {
                this.nome = nome;
                return this;
            }
            */

        Pessoa pb= new PessoaBuilder().nome("Nestor").
                sobreNome("Neto").dataNascimento("05/03/2001").email("nestor.brtp4@gmail.com").
                apelido("neto").documento("05031996").criaPessoa();
        System.out.println(pb.toString());

        // forçar criar so com builder, colocamos em classe com construtor privado
        // builder fica com responsabilidade excluiva de criar objeto
        Pessoa p2 = new PessoaComBuilder.PessoaBuilder().nome("Heloise").sobreNome("Neto").dataNascimento("05/03/2001").
                email("Heloise.brt@gmail.com").apelido("heloise").documento("05031996").criaPessoa();
        System.out.println(p2.toString());

        /* Obs: esse builder criado é o mesmo é o mesmo utilizado pela anotação do lombok
        * a diferença fica quanto a nomenclatura que padrão la .builder() o metodo de criação */
    }
}