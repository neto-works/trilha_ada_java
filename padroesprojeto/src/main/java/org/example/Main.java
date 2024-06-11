package org.example;

import org.example.padroes.builder.Pessoa;
import org.example.padroes.builder.PessoaBuilder;
import org.example.padroes.builder.PessoaComBuilder;
import org.example.padroes.factory.*;
import org.example.padroes.singleton.Agenda;
import org.example.padroes.singleton.AgendaSingletonEAGER;

public class Main {
    public static void padraobuilder(String[] args) {
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
    public static void padraoFactory(String[] args) {
        /*
            Padrão Fabrica
            - ja diz em sí objeto que sabe fabricar, fabrica instancias.

            Sempre que tivermos  a responsabilidade de informar na classe que uma coisa é de determinado tipo
            a gente pode alterar a modelagem das classes, fazendo assim a aplicação do Factory methods
            - criamos uma classe Enum - com a definição de ambos os tipos
            - criamos uma classe Factory Method - com a definição e criação de tipos
            - chamamos o metodo staic do produtfactory passando o tipo do produto,
            - E então é criado um produto de acordo com a tipagem

            ** Obs: ganhos em inversão de responsabilidade, evitando erros
        */

        /*  Em vez de:
            ProdutoFisico pf = new ProdutoFisico();  "Caneta", 8.656,true);
            pf.setPosuiDimensoesFisicas(true);
            ProdutoDigital pd = new ProdutoDigital(); "Lapis", 10.656,true);
            pf.setPosuiDimensoesFisicas(false);
        */

        Produto pd = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto pf = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(pd);
        System.out.println(pf);

    }

    public static  void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static  void reservaDiaSingleton(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void main(String[] args) {
        /* Singleton - O objetivo dele é garantir que exista somente uma instancia de algo na memoria
        * - Problema ocorrendo , estamos gerando mais de 1 instancia da mesma classe "Agenda" e com
        * isso perdemos o estado  dos dias anteriores que foram reservados --> "quando chamamos o reservarDia".
        *
        * Solução: usar o singleton e garantir que a a classe seja instanciada uma unica vez e permaneça na memoria
        * - criamos um atributo da classe que é uma instancia
        * - criamos um metodo que retorna a propria instancia da classe
        * */
        //reservaDia("Sexta");
        //reservaDia("Sabado");

        reservaDiaSingleton("Sexta");
        reservaDiaSingleton("Sabado");
        reservaDiaSingleton("Domingo");


    }

}