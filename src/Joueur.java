public class Joueur {
    private String nomJoueur;
    private int age;
    private int nbButs;
    public Joueur(String nomJoueur, int age, int nbButs){
        this.nomJoueur=nomJoueur;
        this.age=age;
        this.nbButs=nbButs;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public int getNbButs() {
        System.out.println(nbButs);
        return nbButs;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNbButs(int nbButs) {
        this.nbButs = nbButs;
    }
    public void afficherJoueur(){
        System.out.println("Le nom de joueur: "+nomJoueur+", l'äge de joueur: "+age+", le nombre de buts: "+nbButs+".");
    }
}
