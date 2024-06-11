package org.example.padroes.builder;

public class PessoaBuilder {
    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public PessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder dataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public  Pessoa criaPessoa(){
        return new Pessoa(nome,sobreNome,documento,apelido,email,dataNascimento);
    }

}
