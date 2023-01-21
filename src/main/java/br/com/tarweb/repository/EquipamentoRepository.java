package br.com.tarweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tarweb.model.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
	
	
}