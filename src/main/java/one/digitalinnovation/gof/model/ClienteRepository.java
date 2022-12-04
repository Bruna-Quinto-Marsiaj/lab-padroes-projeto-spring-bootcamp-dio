package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository// nem precisaria dessa annotation, pq n é o repository de fato
public interface ClienteRepository extends CrudRepository<Cliente, Long> {//crud repository é uma strategy, interface que obriga a seguir estratégia de implementação
                                                                          // para abrir, cursor em cima e open*
}