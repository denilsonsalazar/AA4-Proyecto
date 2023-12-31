package com.certus.plataformaeb.demoweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certus.plataformaeb.demoweb.interfaceService.IpersonaService;
import com.certus.plataformaeb.demoweb.interfaces.IPersona;
import com.certus.plataformaeb.demoweb.modelo.Persona;
@Service

public class PersonaService implements IpersonaService {
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> ListarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona=data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
