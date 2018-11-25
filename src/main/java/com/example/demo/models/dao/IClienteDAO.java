package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long>{
	
}
