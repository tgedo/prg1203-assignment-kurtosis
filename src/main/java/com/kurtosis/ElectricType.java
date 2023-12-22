package com.kurtosis;
import java.io.Serial;
import java.io.Serializable;

class ElectricType extends Pokemon implements Serializable {
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
        hp -= enemyPower;
        return "The attack is effective!";
    }   
}