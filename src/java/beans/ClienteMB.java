/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.ClienteJpaController;
import java.util.List;
import modelos.Cliente;
import modelos.Endereco;
import negocio.ClienteRB;
import negocio.EnderecoRB;
import util.JPAUtil;

/**
 *
 * @author jefferson
 */
public class ClienteMB {
    private Cliente cliente = new Cliente();
    private Endereco endereco = new Endereco();
    private ClienteRB negocio = new ClienteRB();
    private EnderecoRB negocioEndereco = new EnderecoRB();
    private ClienteJpaController dao = new ClienteJpaController(JPAUtil.EMF);

    public ClienteMB() {
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Cliente> getClientes(){
        return dao.findClienteEntities();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void salvar(){
                
                negocioEndereco.inserir(getEndereco());
                cliente.setEndereco(endereco);
                negocio.inserir(getCliente());
    }
    
}
