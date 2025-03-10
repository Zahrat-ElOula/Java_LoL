package LoL;

public class Assassin extends Champion{
    public Assassin(String nom,double pointsVie,double puissanceAttaque){
        super(nom,pointsVie,puissanceAttaque,RoleChampion.ASSASSIN);
    }

    @Override
    public void attaquer(Champion adversaire) {
        if (adversaire instanceof Champion) {
            Champion adv = (Champion) adversaire;
            double degats = getPuissanceAttaque();
            if (Math.random() < 0.3) {
                degats *= 2;
                System.out.println("Coup critique!");
            }
            adv.setPointsVie(adv.getPointsVie() - degats);
            System.out.println(getNom() + " attaque " + adv.getNom() + " et inflige " + degats + " dégâts.");
        }
    }
}

