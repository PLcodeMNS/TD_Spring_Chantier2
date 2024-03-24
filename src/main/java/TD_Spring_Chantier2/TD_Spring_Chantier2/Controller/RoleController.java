package TD_Spring_Chantier2.TD_Spring_Chantier2.Controller;

import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class RoleController {

    @GetMapping("/Role")
    public String getRole() {
        return "Role";
    }

    @GetMapping("/mon-role/liste")
    public String listeRoles() {
        return "Liste des roles";
    }

    @GetMapping("/mon-role/{monParametre}")
    public String monRole(@PathVariable int monParametre) {
        return "Le paramètre de cette URL est : " + monParametre;
    }

    @PostMapping("/mon-role")
    public String creerRole(@RequestParam int monParametre) {
        return "Un role a été ajouté : " + monParametre;
    }
    @PutMapping("/mon-role/{monParametre}")
    public String modifierRole(@PathVariable int monParametre) {
        return "Le role a été modifié : " + monParametre;
    }
    @DeleteMapping("/mon-role/{id}")
    public String supprimerRole (@PathVariable int id) {
        return "Supprime le produit avec l'id : " + id;
    }
}
