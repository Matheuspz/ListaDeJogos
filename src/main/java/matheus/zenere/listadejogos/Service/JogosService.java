package matheus.zenere.listadejogos.Service;


import matheus.zenere.listadejogos.Entity.Jogos;
import matheus.zenere.listadejogos.Repository.JogosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogosService {

    private final JogosRepository jogosRepository;

    public JogosService(JogosRepository jogosRepository) {
        this.jogosRepository = jogosRepository;
    }

    public List<Jogos> findAll() {
        return jogosRepository.findAll();
    }

    public void save(Jogos jogos) {
        jogosRepository.save(jogos);
    }

    public Jogos findById(Long id) {
        return jogosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Jogo não encontrado"));
    }



}
