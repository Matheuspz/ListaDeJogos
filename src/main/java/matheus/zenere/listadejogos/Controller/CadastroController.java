package matheus.zenere.listadejogos.Controller;

import matheus.zenere.listadejogos.Entity.Jogos;
import matheus.zenere.listadejogos.Service.JogosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    private final JogosService jogosService;
    public CadastroController(JogosService jogosService) {
        this.jogosService = jogosService;
    }

    @GetMapping
    public String cadastroIndex(final Model model) {
        model.addAttribute("Jogos", new Jogos());
        return "cadastro";
    }

    @PostMapping
    public String cadastroSave(Jogos jogos) {
        jogosService.save(jogos);
        System.out.println(jogos);
        return "redirect:/cadastro";
    }


}
