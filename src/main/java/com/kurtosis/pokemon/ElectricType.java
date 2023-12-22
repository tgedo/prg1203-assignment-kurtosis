package com.kurtosis.pokemon;
import java.io.Serial;

import com.kurtosis.constants.ConsoleColours;
import com.kurtosis.constants.Move;
import com.kurtosis.constants.Type;
import com.kurtosis.constants.ZMove;

class ElectricType extends Pokemon {
    @Serial
    private static final long serialVersionUID = 1959361832263275580L;

    public ElectricType(String name, int hp, int atk, int def, int spd, int spe, Move move, ZMove zMove, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.ELECTRIC,Move.THUNDERBOLT,ZMove.ZELEC,catchRate);
    }

    @Override
    public String getName() {
        return ConsoleColours.YELLOW.text + this.name + ConsoleColours.RESET.text;
    }


    @Override
    public String takeDamage(double enemyPower, Type enemyType){
        if (this.getHp() < 0){
            return this.getName() + " has already fainted! STOP!!";
        }
        if (Type.ELECTRIC.strong.contains(enemyType)) {
            hp -= enemyPower*0.5;
            return "The attack is not very effective. \n " +this.getName() + "received " + (enemyPower*0.5) + " damage." ;
        } else if (Type.ELECTRIC.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective! \n" + (enemyPower*2) + " damage received!" ;
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    } 
}