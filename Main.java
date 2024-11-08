public class Main {
    public static void main(String[] args) {
        // Création d'étudiants
        Etudiant e1 = new Etudiant(1, "oussema", "sghaier");
        Etudiant e2 = new Etudiant(2, "foulen", "ben foulen");
        Etudiant e3 = new Etudiant(3, "Brown", "Alice");

        // Création de la gestion des étudiants
        GestionUniversity gestion = new GestionUniversity();

        // Ajouter des étudiants
        gestion.ajouterEtudiant(e1);
        gestion.ajouterEtudiant(e2);
        gestion.ajouterEtudiant(e3);

        // Affichage des étudiants
        System.out.println("Liste des étudiants :");
        gestion.displayEtudiants();

        // Rechercher un étudiant par objet
        System.out.println("Recherche de l'étudiant e1 : " + gestion.rechercherEtudiant(e1));

        // Rechercher un étudiant par nom
        System.out.println("Recherche de l'étudiant avec nom 'Smith' : " + gestion.rechercherEtudiant("Smith"));

        // Supprimer un étudiant
        gestion.supprimerEtudiant(e2);
        System.out.println("Liste des étudiants après suppression :");
        gestion.displayEtudiants();

        // Tri des étudiants par ID
        gestion.trierEtudiantsParId();
        System.out.println("Liste des étudiants triée par ID :");
        gestion.displayEtudiants();

        // Tri des étudiants par nom
        gestion.trierEtudiantsParNom();
        System.out.println("Liste des étudiants triée par nom :");
        gestion.displayEtudiants();
    }
}
