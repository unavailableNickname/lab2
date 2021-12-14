package pokemons;

import attacks.WingAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Moltres extends Pokemon {
    public Moltres(String name, int level){
        super(name, level);
        setStats(90, 100, 90, 125, 85, 90);
        setType(Type.FIRE, Type.FLYING);
        setMove(new WingAttack());
    }
}
