/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.EnderecoJpaController;
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
    private Pessoa pessoa = new Pessoa();
    private PessoaRB negocio = new PessoaRB();
    private EnderecoRB negocioEndereco = new EnderecoRB();
    private PessoaJpaController dao = new PessoaJpaController(JPAUtil.EMF);
    private EnderecoJpaController daoEndereco = new EnderecoJpaController(JPAUtil.EMF);
    private Endereco endereco = new Endereco();

    /**
     * Creates a new instance of PessoaMB
     */
    public PessoaMB() {
        
    }

    /**
     * @return the p
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param p the p to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void salvar(){
                
                daoEndereco.create(getEndereco());
                pessoa.setEndereco(getEndereco());
		negocio.inserir(getPessoa());
                //negocioEndereco.inserir(e);
    }
    
    public List<Pessoa> getPessoas(){
        return dao.findPessoaEntities();
    }
    
    public void removerPessoa(Pessoa p) throws NonexistentEntityException{
		dao.destroy(p.getId());
	}

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
