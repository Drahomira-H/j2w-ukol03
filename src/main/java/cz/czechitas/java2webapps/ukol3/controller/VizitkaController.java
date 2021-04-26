package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> vizitky;

    public VizitkaController() {
        vizitky = List.of(
                new Vizitka("Dita (Přikrylová) Formánková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "dita@czechitas.cs", "+420 800123456", "www.czechitas.cz"),
                new Vizitka("Barbora Bühnová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", null, "+420 800123457", "www.czechitas.cz"),
                new Vizitka("Monika Ptáčníková", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "monika@czechitas.cs", "+420 800123458", "www.czechitas.cz"),
                new Vizitka("Mirka Zatloukalová", "Czechitas z. s.", "Václavské náměstí 837/11", "11000 Praha 1", "mirka@czechitas.cs", null, "www.czechitas.cz"),
                new Vizitka("Drahomíra Holubová", "Apples s. r. o.", "Pod Terebkou 1292/5", "14000 Praha 4", "drahomira@apples.cz", "+420 800548695", "www.apples.cz"),
                new Vizitka("Vladimír Novák", "Pears s. r. o.", "Sekaninova 189/58", "12800 Praha 2", "vladimir@pears.cz", "+420 800158966", "www.pears.cz"),
                new Vizitka("Petr Novák", "Pears s. r. o.", "Sekaninova 189/58", "12800 Praha 2", null, null, "www.pears.cz")
        );
    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("vizitky", vizitky);
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView detail(int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", vizitky.get(id));
        return modelAndView;
    }
}
