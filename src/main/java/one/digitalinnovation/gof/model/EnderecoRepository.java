package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository// provê métodos e acesso a dados
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}