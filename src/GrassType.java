class GrassType extends Pokemon {
    public GrassType(String name, int hp, int atk, int def, int spd, int spe,boolean moveIsSpecial, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.GRASS,moveIsSpecial,catchRate);
    }

    @Override
    public String takeDamage(int enemyPower, Type enemyType){
        if (Type.GRASS.strong.contains(enemyType)) {
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective";
        } else if (Type.GRASS.weak.contains(enemyType)) {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }   
}