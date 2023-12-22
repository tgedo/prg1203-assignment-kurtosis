package com.kurtosis.pokemon;
import java.io.Serial;
import java.io.Serializable;

import com.kurtosis.constants.Move;
import com.kurtosis.constants.Type;
import com.kurtosis.constants.ZMove;


abstract public class Pokemon implements Cloneable, Serializable {
    @Serial
    private static final long serialVersionUID = -129681925816569573L;
    
    protected String name = "MissingNo.";
    protected int maxHP = 33;
    protected int hp = 33;
    protected int atk = 136;
    protected int def = 0;
    /**Pokemon Special Defense Stat */
    protected int spd = 6; 
    /** Pokemon Speed Stat */
    protected int spe = 29;

    protected Type type = Type.NONE;
    protected Move  move = Move.NULLMOVE;
    protected ZMove zmove = ZMove.ZNULL;
    protected double catchRate = 4;
    protected int actionValue = 1000;


    public Pokemon(String name, int hp, int atk, int def, int spd, int spe, Type type, Move move,ZMove zmove,
            double catchRate) {
        this.name = name;
        this.maxHP = hp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.spe = spe;
        this.type = type;
        this.move = move;
        this.zmove = zmove;
        this.catchRate = catchRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp(){
        return maxHP;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
    /** Returns pokemon special defense stat */
    public int getSpd() {
        return spd;
    }

    /** Returns pokemon speed stat */
    public int getSpe() {
        return spe;
    }

    public Move getMove(Move move){return move;}

    public Type getType() {
        return type;
    }
    public double getCatchRate() {
        return catchRate;
    }


    public void dealDamage(Pokemon target) {
        int basePower = this.getAtk() * (((this.getAtk() + this.move.power) / (target.getDef())));
        if (this.move.isSpecial) {
            basePower = this.getAtk() * (((this.getAtk() + this.move.power) / (target.getSpd())));
        }
            // RNG element
            double totalPower = (basePower/2) + (Math.random() * 0.15 + 0.85);
            // Ensure minimum damage of 1
            System.out.println(this.name + " used move "+ this.move.moveName+ " on " + target.getName());
            System.out.println(target.takeDamage(Math.max(1, totalPower), this.move.type));
    }
    public void dealZDamage(Pokemon target) {
        int basePower = this.getAtk() * (((this.getAtk() + this.move.power) / (target.getDef())));
        if (this.move.isSpecial) {
            basePower = this.getAtk() * (((this.getAtk() + this.move.power) / (target.getDef())));
        }
        // RNG element
        double totalPower = basePower * (Math.random() * 0.15 + 0.85);
        // Ensure minimum damage of 1
        System.out.println(this.name + " used its special, Z-move "+ this.zmove.zmoveName + " on " + target.getName());
        System.out.println(target.takeDamage(Math.max(1, totalPower), this.getType()));
    }

    public String takeDamage(double enemyPower, Type enemyType){
        hp -= Math.floor(enemyPower);
        return Math.floor(enemyPower) + " Damage taken!";
    }
    
    public String healHealth(int heal){
        if(heal > maxHP){
            hp = maxHP;
        }
        else{
            hp += heal;
        }
        return "Recovered " + heal + " HP!";
    }

    public int getActionValue() {
        return actionValue;
    }

/**Decrease the pokemon's action value by it's speed. @param speed */
    public void decreaseActionValue(int speed) {
        this.actionValue -= speed;
    }

    public void resetActionValue(){
        this.actionValue = 1000;
    }

    public Pokemon clone() throws CloneNotSupportedException {
        return (Pokemon) super.clone();
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", spd=" + spd +
                ", spe=" + spe +
                ", moveSpecial=" + move.isSpecial +
                ", catchRate=" + catchRate +
                '}';
    }
}

