package LoL;

public class Tireur extends Champion{
    public Tireur(String nom,double pointsVie,double puissanceAttaque) {
        super(nom, pointsVie, puissanceAttaque, RoleChampion.TANK);
    }

    @Override
    public void attaquer(Champion adversaire) {
        if (adversaire instanceof Champion) {
            Champion adv = (Champion) adversaire;
            double degats = getPuissanceAttaque();
            adv.setPointsVie(adv.getPointsVie() - degats);
            System.out.println(getNom() + " tire sur " + adv.getNom() + " et inflige " + degats + " dégâts.");
        }
    }
}
