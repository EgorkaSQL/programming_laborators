package moves2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Hone_Claws extends StatusMove
{
    public Hone_Claws(double pow, double acc)
    {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.ACCURACY, +1);
    }

    @Override
    protected String describe()
    {
        return "Использует Hone Claws";
    }
}