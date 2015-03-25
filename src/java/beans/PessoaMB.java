/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.PessoaJpaController;
import dao.exceptions.NonexistentEntityException;
import java.util.List;
import modelos.Endereco;
import modelos.Pessoa;
import negocio.EnderecoRB;
import negocio.PessoaRB;
import util.JPAUtil;

/**
 *
 * @author jefferson
 */
public class PessoaMB {
    private Pessoa p = new Pessoa();
    private PessoaRB negocio = new PessoaRB();
    private PessoaJpaController dao = new PessoaJpaController(JPAUtil.EMF);

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
    
    public List<Pessoa> getPessoas(){
        return dao.findPessoaEntities();
    }
    
    public void removerPessoa(Pessoa p) throws NonexistentEntityException{
		dao.destroy(p.getId());
	}
    
}
