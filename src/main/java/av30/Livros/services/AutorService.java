package av30.Livros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import av30.Livros.entities.Autor;
import av30.Livros.repository.AutorRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> getAll() {
		return autorRepository.findAll();
		
	}
	
	public void saveAutor (Autor autor) {
		autorRepository.save(autor);
	}

}
