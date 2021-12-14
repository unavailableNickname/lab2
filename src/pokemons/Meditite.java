package pokemons;

import attacks.FeintAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meditite extends Pokemon {
    public Meditite(String name, int level){
        super(name, level);
        setStats(30, 40, 55, 40, 55, 60);
        setType(Type.FIGHTING, Type.PSYCHIC);
        setMove(new FeintAttack());
    }
}
