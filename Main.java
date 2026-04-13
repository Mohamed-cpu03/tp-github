public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Saad", 21);
        Professeur p1 = new Professeur("Ahmed", "Informatique");

        e1.afficher();
        p1.afficher();
    }
}