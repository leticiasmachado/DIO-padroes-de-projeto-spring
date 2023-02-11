package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//a classe Repository será responsável por todos os métodos de acesso a dados do Endereço
//o CrudRepository é uma strategy, só pode ser usada através do Spring e já tem uma série de facilitações
@Repository//essa annotation não é necessária, mas pode ser utilizada para ajudar a se orientar melhor
//OBS: não é necessária pq já estende o CrudRepository que estende um Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
//métodos do CrudRepository:
    /*
     - save
     - saveAll
     - findById
     - existsById
     - findAll
     - findAllById
     - count
     - deleteById
     - delete
     - deleteAllById
     - deleteAll
     - deleteAll
     */
}