package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack(){
        super(Type.NORMAL,30,100);
    }

    @Override
    protected String describe(){
        return "использует Feint Attack";
    }
}
