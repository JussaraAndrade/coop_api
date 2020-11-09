package br.com.coop.coop_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.coop.coop_api.entities.PublicacaoOng;

public interface PublicacaoOngRepository extends CrudRepository<PublicacaoOng, Integer> {

	String query = "select id_publicacao, titulo_publicacao, imagem_publicacao, data_publicacao, legenda_publicacao from coop_bd.doacao";
	@Query (value = query, nativeQuery = true)
	List<Object[]> busca();

}