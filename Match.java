package LoL;

public class Match {
    private Combattant Combattant1;
    private Combattant Combattant2;
    public Match(Combattant Combattant1,Combattant Combattant2){
        this.Combattant1=Combattant1;
        this.Combattant2=Combattant2;
    }
    public void lancerCombat() {
        while (((Champion) Combattant1).getPointsVie() > 0 && ((Champion) Combattant2).getPointsVie() > 0) {
            Combattant1.attaquer((Champion) Combattant2);
            if (((Champion) Combattant2).getPointsVie() > 0) {
                Combattant2.attaquer((Champion) Combattant1);
            }
        }

        if (((Champion) Combattant1).getPointsVie() <= 0) {
            System.out.println(((Champion) Combattant2).getNom() + " a gagné le match!");
        } else {
            System.out.println(((Champion) Combattant1).getNom() + " a gagné le match!");
        }
    }
}
