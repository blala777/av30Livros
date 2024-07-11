package av30.Livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import av30.Livros.entities.Autor;

@Repository
public interface LivroRepository extends JpaRepository<Autor,
Long> {

}
