public class Etudiant {
    String nom;
    int age;

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Etudiant : " + nom + ", age : " + age);
    }
}