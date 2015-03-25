package negocio;

import modelos.Endereco;
import util.JPAUtil;
import dao.EnderecoJpaController;

public class EnderecoRB {
	public final EnderecoJpaController dao;
	
	public EnderecoRB(){
		dao = new EnderecoJpaController(JPAUtil.EMF);
	}
	
	public void inserir(Endereco e){
		try {
			dao.create(e);
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}

}

