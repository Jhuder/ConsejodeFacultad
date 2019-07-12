package pe.edu.consejo.facultad.unsch.dao;

import java.util.List;

import pe.edu.consejo.facultad.unsch.entities.Modulo;

public interface ModuloDao {
	
	public List<Modulo> listarPorPerfil(String usuario);
	

}
