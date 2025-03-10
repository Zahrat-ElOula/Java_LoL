package LoL;

import java.util.ArrayList;
import java.util.List;

public class Championnat {
    private List<Champion> champions;

    public Championnat() {
        this.champions = new ArrayList<>();
    }

    public void inscrireChampion(Champion champion) {
        champions.add(champion);
    }

    public void lancerMatchs() {
        for (int i = 0; i < champions.size(); i += 2) {
            if (i + 1 < champions.size()) {
                Match match = new Match(champions.get(i), champions.get(i + 1));
                System.out.println("Match entre " + champions.get(i).getNom() + " et " + champions.get(i + 1).getNom());
                match.lancerCombat();
            }
        }
    }

    public List<Champion> getChampions() {
        return champions;
    }
}