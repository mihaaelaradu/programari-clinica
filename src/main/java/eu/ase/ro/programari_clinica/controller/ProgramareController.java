package eu.ase.ro.programari_clinica.controller;

import eu.ase.ro.programari_clinica.request.ProgramareRequest;
import eu.ase.ro.programari_clinica.service.ProgramareService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/programari")
public class ProgramareController {

    private final ProgramareService programareService;

    public ProgramareController(ProgramareService programareService) {
        this.programareService = programareService;
    }

    @GetMapping
    public String getAllProgramari(Model model) {
        model.addAttribute("programari", programareService.getAllProgramari());
        return "programari/lista";
    }

    @GetMapping("/noua")
    public String showCreateForm(Model model) {
        model.addAttribute("programareRequest", new ProgramareRequest());
        return "programari/formular";
    }

    @PostMapping("/salveaza")
    public String saveProgramare(@ModelAttribute("programareRequest") ProgramareRequest request) {
        programareService.creeazaProgramare(request);
        return "redirect:/programari";
    }
}