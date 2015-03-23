/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.PessoaJpaController;
import modelos.Pessoa;
import util.JPAUtil;

/**
 *
 * @author jefferson
 */
public class PessoaRB {
    public final PessoaJpaController dao;
	
	public PessoaRB(){
		dao = new PessoaJpaController(JPAUtil.EMF);
	}
	
	public void inserir(Pessoa p){
		try {
			dao.create(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    
}
