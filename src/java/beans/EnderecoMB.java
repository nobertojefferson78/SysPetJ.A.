package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import negocio.EnderecoRB;
import modelos.Endereco;


@ManagedBean
@RequestScoped
public class EnderecoMB {
	private Endereco e = new Endereco();
	private EnderecoRB negocio = new EnderecoRB();
	
	public Endereco getEndereco() {
		return e;
	}

	public void setEndereco(Endereco e) {
		this.e = e;
	}

	public void salvar(){
		negocio.inserir(e);
	}
	
}
