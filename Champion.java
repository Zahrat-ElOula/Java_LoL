package LoL;

public abstract class Champion implements Combattant {
    private String nom;
    private double pointsVie;
    private double puissanceAttaque;
    private RoleChampion role;

    public Champion(String nom,double pointsVie,double puissanceAttaque,RoleChampion role){
        this.nom=nom;
        this.pointsVie=pointsVie;
        this.puissanceAttaque=puissanceAttaque;
        this.role=role;
    }

    public String getNom() {
        return nom;
    }

    public double getPointsVie() {
        return pointsVie;
    }

    public double getPuissanceAttaque() {
        return puissanceAttaque;
    }

    public RoleChampion getRole() {
        return role;
    }

    protected void setPointsVie(double pointsVie) {
        this.pointsVie = pointsVie;
    }

    @Override
    public void AffciherStats() {
        System.out.println("Nom : "+nom);
        System.out.println("Points de vie : "+pointsVie);
        System.out.println("Puissances d'attaque : "+puissanceAttaque);
        System.out.println("Rôle : "+role);
    }
}
