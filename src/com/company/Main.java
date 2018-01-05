package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeckList temurEnergy = new DeckList();
        temurEnergy.loadDeck();
        System.out.println(temurEnergy.getDeck());

        DeckList temurEnergyClone = (DeckList) temurEnergy.clone();

        Map<String, Map<String, Integer>> deck2 = temurEnergyClone.getDeck();

        System.out.println(deck2);

        Map<String, Integer> creatures = deck2.get("Creatures");
        creatures.put("Servant of the Conduit", 3);
        creatures.put("Vizier of Many Faces", 1);

        System.out.println(deck2);

        deck2.get("Spells").remove("Harnessed Lightning");
        deck2.get("Spells").put("Chandra's Defeat", 2);
        deck2.get("Spells").put("Negate", 2);

        System.out.println(deck2);
    }
}
