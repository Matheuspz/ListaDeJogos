package matheus.zenere.listadejogos.Service;


import matheus.zenere.listadejogos.Entity.Jogos;
import matheus.zenere.listadejogos.Repository.JogosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogosService {

    private final JogosRepository jogosRepository;

    public JogosService(JogosRepository jogosRepository) {
        this.jogosRepository = jogosRepository;
    }

    public List<Jogos> findAll() {
        return jogosRepository.findAll();
    }
    public void deleteAll() {
        jogosRepository.deleteAll();
    }

    public void createJogos() {

    }


}
