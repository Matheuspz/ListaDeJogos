package matheus.zenere.listadejogos.Controller;

import matheus.zenere.listadejogos.Entity.Jogos;
import matheus.zenere.listadejogos.Service.JogosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/editar")
public class EditarController {

    private final JogosService jogosService;
    public EditarController(JogosService jogosService) {
        this.jogosService = jogosService;
    }

    @GetMapping("/{id}")
    public String editarIndex(@PathVariable long id, Model model) {
        model.addAttribute("jogo", jogosService.findById(id));
        return "editar";
    }

    @PostMapping("/{id}")
    public String editar(@PathVariable long id, @ModelAttribute("jogo") Jogos jogo) {
        jogo.setId(id);
        jogosService.save(jogo);
        return "redirect:/listar";
    }


}
