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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

    private final JogosService jogosService;
    public CadastroController(JogosService jogosService) {
        this.jogosService = jogosService;
    }

    @GetMapping
    public String cadastroIndex(final Model model) {
        model.addAttribute("jogo", new Jogos());
        return "cadastro";
    }

    @PostMapping
    public String cadastroSave(@ModelAttribute("jogo") Jogos jogo, RedirectAttributes redirectAttributes) {
        jogosService.save(jogo);
        redirectAttributes.addFlashAttribute("mensagem", "Jogo cadastrado com sucesso!");
        return "redirect:/listar";
    }

}
