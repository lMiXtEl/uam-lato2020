package pl.psi.game;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private final List<Creature> creatures;

    public Hero(List<Creature> aCreatures) {
        creatures = aCreatures;
    }

    public List<Creature> getCreatures() {
        return new ArrayList<>(creatures);
    }
}