package LoL;

public class Tank extends Champion{
    private double armure;
    public Tank(String nom,double pointsVie,double puissanceAttaque){
        super(nom, pointsVie, puissanceAttaque, RoleChampion.TANK);
        this.armure=armure;
    }
    public void encaisserDegats(double degats){
        double degats_reduits=degats-armure;
        if(degats_reduits<0){
            degats_reduits=0;
        }
        setPointsVie(getPointsVie()-degats_reduits);
    }

    @Override
    public void attaquer(Champion adversaire) {
        if (adversaire instanceof Champion) {
            Champion adv = (Champion) adversaire;
            double degats = getPuissanceAttaque() * 0.8;
            adv.setPointsVie(adv.getPointsVie() - degats);
            System.out.println(getNom() + " attaque " + adv.getNom() + " et inflige " + degats + " dégâts.");
        }
    }
}
