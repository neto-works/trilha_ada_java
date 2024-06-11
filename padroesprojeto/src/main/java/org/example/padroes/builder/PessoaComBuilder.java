package org.example.padroes.builder;

public class PessoaComBuilder {
    private String nome;
    private String sobreNome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    private PessoaComBuilder(String nome, String sobreNome, String documento, String apelido, String email, String dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
        this.apelido = apelido;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public static class PessoaBuilder {
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
}
