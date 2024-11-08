import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestionUniversity implements University {
    private ArrayList<Etudiant> etudiants;

    public GestionUniversity() {
        etudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    // Rechercher un étudiant par objet
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    // Rechercher un étudiant par nom
    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Supprimer un étudiant
    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    // Afficher tous les étudiants
    @Override
    public void displayEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    // Trier les étudiants par ID
    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, Comparator.comparingInt(Etudiant::getId));
    }

    // Trier les étudiants par nom
    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getNom));
    }
}
