/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.ClienteJpaController;
import modelos.Cliente;
import util.JPAUtil;

/**
 *
 * @author jefferson
 */
public class ClienteRB {
    public final ClienteJpaController dao;
	
	public ClienteRB(){
		dao = new ClienteJpaController(JPAUtil.EMF);
	}
	
	public void inserir(Cliente cliente){
		try {
			dao.create(cliente);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    
}
