/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import modelos.Endereco;
import modelos.Pessoa;
import negocio.EnderecoRB;
import negocio.PessoaRB;

/**
 *
 * @author jefferson
 */
public class PessoaMB {
    private Pessoa p = new Pessoa();
    private PessoaRB negocio = new PessoaRB();

    /**
     * Creates a new instance of PessoaMB
     */
    public PessoaMB() {
    }

    /**
     * @return the p
     */
    public Pessoa getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Pessoa p) {
        this.p = p;
    }
    
    public void salvar(){
                
		negocio.inserir(p);
                //negocioEndereco.inserir(e);
                
	}
    
}
