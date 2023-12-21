class GhostType extends Pokemon {
    public GhostType(String name, int hp, int atk, int def, int spd, int spe,Move move, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.GHOST,Move.HEX,catchRate);
    }

    @Override
    public String takeDamage(double enemyPower, Type enemyType){
        if (this.getHp() < 0){
            return this.getName() + " has already fainted! STOP!!";
        }
        if (Type.GHOST.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective! \n" + (enemyPower*2) + " damage received!" ;
        } else if (Type.GHOST.noEffect.contains(enemyType)) {
            hp -= (int) (enemyPower*0.1);
            return "The attack is ineffective";
        } else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}