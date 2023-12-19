class GhostType extends Pokemon {
    public GhostType(String name, int hp, int atk, int def, int spd, int spe, boolean moveIsSpecial, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.GHOST,moveIsSpecial,catchRate);
    }

    @Override
    public String takeDamage(int enemyPower, Type enemyType){
        if (Type.GHOST.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        } else if (Type.GHOST.noEffect.contains(enemyType)) {
            hp -= (int) (enemyPower*0.1);
            return "The attack is ineffective";
        } else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}