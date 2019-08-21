/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09aclassepessoa;

/**
 *
 * @author yurilima
 */
public class Pessoa {

    //ATRIBUTOS
    private int codPessoa;
    private String nome;
    private String celular;
    private String email;
    private String endereco;

    //MÉTODOS
    //VAZIO
    public Pessoa() {

    }

    //CHEIO
    public Pessoa(int codPessoa, String nome, String celular, String email, String endereco) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
    }

    //GETTERS
    public int getCodPessoa() {
        return this.codPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEndereco() {
        return this.endereco;
    }

    //SETTERS
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
