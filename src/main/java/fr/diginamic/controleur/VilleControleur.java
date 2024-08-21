
// TP3

package fr.diginamic.controleur;

import fr.diginamic.entities.Ville;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/villes")
public class VilleControleur {

    @GetMapping
    public List<Ville> getVilles() {
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Dakar", 4848000));
        villes.add(new Ville("Marseille", 861635));
    villes.add(new Ville("Tokyo", 13960000));
        return villes;
    }
}
