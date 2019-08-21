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
public class Projeto09aClassePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instanciando OBJETO p1
        Pessoa p1 = new Pessoa(1, "Yuri", "99999-8888", "y@y.com.br", "Rua 1, Lins-SP");

        //Exibindo valores atribuídos
        System.out.println(p1.getCodPessoa());
        System.out.println(p1.getNome());
        System.out.println(p1.getCelular());
        System.out.println(p1.getEmail());
        System.out.println(p1.getEndereco());
    }

}
