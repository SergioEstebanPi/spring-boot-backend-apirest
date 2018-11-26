package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IClienteDAO;
import com.example.demo.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteDAO iClienteDAO;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) iClienteDAO.findAll();
	}

	@Override
	public Cliente findbyId(long id) {
		return iClienteDAO.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	@Override
	public void delete(Long id) {
		iClienteDAO.deleteById(id);
	}

}
