public class Test {
    public static void main(String[] args) {
        Joueur[] tabJoueurs1=new Joueur[2];
        Joueur[] tabJoueurs2=new Joueur[2];
        tabJoueurs1[0]=new Joueur("罗纳尔多", 23, 100);
        tabJoueurs1[1]=new Joueur("C罗", 37, 80);
        tabJoueurs2[0]=new Joueur("巴乔", 40,50);
        tabJoueurs2[1]=new Joueur("齐达内", 42,20);
        Equipe e1=new Equipe("皇家马德里",tabJoueurs1,"西班牙");
        Equipe e2=new Equipe("曼联",tabJoueurs2,"英格兰");
        tabJoueurs1[0].afficherJoueur();
        tabJoueurs2[1].getAge();
        tabJoueurs1[0].getNbButs();
        tabJoueurs2[1].setNomJoueur("巴蒂斯图塔");
        e1.afficherEquipe();
        e2.afficherEquipe();
    }
}