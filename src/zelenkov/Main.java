package zelenkov;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle fight = new Battle();

        Moltres p1 = new Moltres("Витязь", 1);
        Meditite p2 = new Meditite("Княже", 1);

        fight.addAlly(p2);
        fight.addFoe(p1);

        fight.go();
    }
}
