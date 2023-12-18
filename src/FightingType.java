class FightingType extends Pokemon {
    public FightingType(){
        setType("Fighting");
    }
    public FightingType(String pid){
        if(Objects.equals(pid, "Machop")){
            setName(pid);
            setHp(103);
            setAtk(68);
            setDef(44);
            setSpd(31);
            setSpe(31);
            setMoveIsSpecial(false);
            setCatchRate(0.33);
        }
    }
    public String takeDamage(int enemyPower){
        if (enemy.getType() == "Psychic") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}