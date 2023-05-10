package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepositorie;

@Service
public class UsuarioService {
@Autowired
UsuarioRepositorie usuarioRepositorie;

public ArrayList<UsuarioModel> obtenerUsuarios(){
	return (ArrayList<UsuarioModel>)usuarioRepositorie.findAll();
}


public UsuarioModel guardarUsuario(UsuarioModel usuario) {
	return usuarioRepositorie.save(usuario); 
}

public Optional<UsuarioModel> obtenerPorId(long id){
	return usuarioRepositorie.findById(id);
}

public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
	return usuarioRepositorie.findByPrioridad(prioridad);
}

public boolean eliminarUsuario(Long id) {
	try {
		usuarioRepositorie.deleteById(id);
		return true;}catch(Exception err) {
			return false;
	}

}
}
