package LoL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Championnat championnat = new Championnat();
        int choix;

        do {
            System.out.println("\n--- Menu Championnat LoL ---");
            System.out.println("1. Inscrire un champion");
            System.out.println("2. Lancer les matchs");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option (1-3) : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\n--- Inscription d'un champion ---");
                    System.out.print("Nom du champion : ");
                    String nom = scanner.next();

                    System.out.print("Points de vie : ");
                    double pointsVie = scanner.nextDouble();

                    System.out.print("Puissance d'attaque : ");
                    double puissanceAttaque = scanner.nextDouble();

                    System.out.println("Choisissez le rôle : ");
                    System.out.println("1. Tank");
                    System.out.println("2. Assassin");
                    System.out.println("3. Mage");
                    System.out.println("4. Tireur");
                    System.out.print("Rôle (1-4) : ");
                    int roleChoix = scanner.nextInt();

                    Champion champion = null;
                    switch (roleChoix) {
                        case 1:
                            champion = new Tank(nom, pointsVie, puissanceAttaque);
                            break;
                        case 2:
                            champion = new Assassin(nom, pointsVie, puissanceAttaque);
                            break;
                        case 3:
                            champion = new Mage(nom, pointsVie, puissanceAttaque);
                            break;
                        case 4:
                            champion = new Tireur(nom, pointsVie, puissanceAttaque);
                            break;
                        default:
                            System.out.println("Rôle invalide. Le champion n'a pas été inscrit.");
                            continue;
                    }

                    championnat.inscrireChampion(champion);
                    System.out.println(nom + " a été inscrit avec succès !");
                    break;

                case 2:
                    if (championnat.getChampions().size() >= 2) {
                        System.out.println("\n--- Début des matchs ---");
                        championnat.lancerMatchs();
                    } else {
                        System.out.println("Il faut au moins 2 champions pour lancer un match !");
                    }
                    break;

                case 3:
                    System.out.println("Merci d'avoir utilisé le simulateur de championnat !");
                    break;

                default:
                    System.out.println("Option invalide. Veuillez choisir une option entre 1 et 3.");
            }
        } while (choix != 3);

        scanner.close();
    }
}