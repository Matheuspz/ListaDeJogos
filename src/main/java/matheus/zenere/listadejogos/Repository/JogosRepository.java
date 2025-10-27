package matheus.zenere.listadejogos.Repository;

import matheus.zenere.listadejogos.Entity.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosRepository extends JpaRepository<Jogos, Long> {

}
