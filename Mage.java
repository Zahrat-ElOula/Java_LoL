package LoL;

public class Mage extends Champion{
    public Mage(String nom,double pointsVie,double puissanceAttaque){
        super(nom, pointsVie, puissanceAttaque, RoleChampion.TANK);
    }

    @Override
    public void attaquer(Champion adversaire) {
        if (adversaire instanceof Champion) {
            Champion adv = (Champion) adversaire;
            double degats = getPuissanceAttaque() * 1.2;
            adv.setPointsVie(adv.getPointsVie() - degats);
            System.out.println(getNom() + " lance un sort sur " + adv.getNom() + " et inflige " + degats + " dégâts.");
        }
    }
}
