package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface ClienteService { //service: camada de negócio, onde vamos criar as regras, implementar toda necessidade de integração, composição que geralmente é responsabilidade da facade
//interface que representa uma strategy e tem todas as opereações de CRUD, para poder criar uma implementação, uma opção concreta da estratégia de implementação
	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
