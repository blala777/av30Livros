package av30.Livros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import av30.Livros.entities.Livro;
import av30.Livros.repository.LivroRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
		
	}
	
	public void saveLivro(Livro livro) {
		livroRepository.save(livro);
	}

}
