package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author falvojr
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")// url informada no site do viacep e os endpoints tbm
public interface ViaCepService {

	@GetMapping("/{cep}/json/")//poderia ter sido o RequestMapping que tbm funcionaria
	Endereco consultarCep(@PathVariable("cep") String cep); // esse json vai ser convertido no objeto endereço
}// devolve o endereço populado com base no cep que eu passar
// o Feign usa as annotations do próprio Spring
