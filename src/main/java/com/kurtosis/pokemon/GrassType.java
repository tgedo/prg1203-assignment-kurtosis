package com.kurtosis.pokemon;
import java.io.Serial;
import java.io.Serializable;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.constants.Move;
import com.kurtosis.constants.Type;
import com.kurtosis.constants.ZMove;

class GrassType extends Pokemon{
    @Serial
    private static final long serialVersionUID = -5437902493174180470L;

    public GrassType(String name, int hp, int atk, int def, int spd, int spe, Move move, ZMove zMove, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.GRASS,Move.RAZORLEAF,ZMove.ZGRASS,catchRate);
    }

    @Override
    public String getName() {
        return ConsoleColours.GREEN.text + this.name + ConsoleColours.RESET.text;
    }

    @Override
    public String takeDamage(double enemyPower, Type enemyType){
        if (this.getHp() < 0){
            return this.getName() + " has already fainted! STOP!!";
        }
        if (Type.GRASS.strong.contains(enemyType)) {
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective. \n " +this.getName() + "received " + (enemyPower*0.5) + " damage." ;
        } else if (Type.GRASS.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective! \n" + (enemyPower*2) + " damage received!" ;
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }   
}