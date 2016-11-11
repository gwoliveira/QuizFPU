package br.com.fpu.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fpu.entity.Parametro;

public interface ParametrosRepository extends CrudRepository<Parametro, String> {

}
