public class Equipe {
    private String nomEquipe;
    private Joueur tabJoueurs[];
    private String siege;
    public Equipe(String nomEquipe, Joueur tabJoueurs[], String siege){
        this.nomEquipe=nomEquipe;
        this.tabJoueurs=tabJoueurs;
        this.siege=siege;
    }
    public void afficherEquipe(){
        System.out.println("Le nom de l'équipe: "+nomEquipe+", l'adresse: "+siege+".");
            for(int i=0;i<tabJoueurs.length;i++)
                tabJoueurs[i].afficherJoueur();
    }
}
