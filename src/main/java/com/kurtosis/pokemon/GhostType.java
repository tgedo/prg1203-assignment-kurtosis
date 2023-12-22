package com.kurtosis.pokemon;
import java.io.Serial;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.constants.Move;
import com.kurtosis.constants.Type;
import com.kurtosis.constants.ZMove;

class GhostType extends Pokemon{
    @Serial
    private static final long serialVersionUID = 1431327788388851457L;

    public GhostType(String name, int hp, int atk, int def, int spd, int spe, Move move, ZMove zmove, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.GHOST,Move.HEX,ZMove.ZGHOST,catchRate);
    }

    @Override
    public String getName() {
        return ConsoleColours.BLACK.text + this.name + ConsoleColours.RESET.text;
    }

    @Override
    public String takeDamage(double enemyPower, Type enemyType){
        if (this.getHp() < 0){
            return this.getName() + " has already fainted! STOP!!";
        }
        if (Type.GHOST.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective! \n" + Math.round(enemyPower*2) + " damage received!" ;
        } else if (Type.GHOST.noEffect.contains(enemyType)) {
            hp -= (int) (enemyPower*0.1);
            return "The attack is ineffective";
        } else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}