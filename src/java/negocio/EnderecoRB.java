package negocio;

import modelos.Endereco;
import util.JPAUtil;
import dao.EnderecoJpaController;

public class EnderecoRB {
	public final EnderecoJpaController dao;
	
	public EnderecoRB(){
		dao = new EnderecoJpaController(JPAUtil.EMF);
	}
	
	public void inserir(Endereco c){
		try {
			dao.create(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

