package modelos;

import java.util.List;

public class Cliente {
	
	private long id;
	private Pessoa pessoa;
	private List<Animal> animais;
	
	public Cliente(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
	

}
