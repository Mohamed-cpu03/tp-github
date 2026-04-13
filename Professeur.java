public class Professeur {
    String nom;
    String matiere;

    public Professeur(String nom, String matiere) {
        this.nom = nom;
        this.matiere = matiere;
    }

    public void afficher() {
        System.out.println("Professeur : " + nom + ", matiere : " + matiere);
    }
}
