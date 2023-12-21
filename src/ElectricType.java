class ElectricType extends Pokemon {
    public ElectricType(String name, int hp, int atk, int def, int spd, int spe, Move move, double catchRate){
        super(name,hp,atk,def,spd,spe,Type.ELECTRIC,Move.THUNDERBOLT,catchRate);
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