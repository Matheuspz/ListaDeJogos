package matheus.zenere.listadejogos.Controller;

import matheus.zenere.listadejogos.Service.JogosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/listar")
public class ListaController {

    private final JogosService jogosService;
    public ListaController(JogosService jogosService) {
        this.jogosService = jogosService;
    }

    @GetMapping
    public String listarIndex(Model model) {
        model.addAttribute("listaJogos", jogosService.findAll());
        return "listar";
    }

}
