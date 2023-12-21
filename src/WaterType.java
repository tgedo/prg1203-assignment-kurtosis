import java.io.Serializable;

class WaterType extends Pokemon implements Serializable {
    public WaterType(String name, int hp, int atk, int def, int spd, int spe, Move move, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.WATER,Move.WATERGUN,catchRate);
    }


    @Override
    public String takeDamage(double enemyPower, Type enemyType){
        if (this.getHp() < 0){
            return this.getName() + " has already fainted! STOP!!";
        }
        if (Type.WATER.strong.contains(enemyType)) {
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective. \n " +this.getName() + " received " + (enemyPower*0.5) + " damage." ;
        } else if (Type.WATER.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective! \n" + (enemyPower*2) + " damage received!" ;
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}