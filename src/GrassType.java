class GrassType extends Pokemon {
    public GrassType(){
        setType("Grass");
    }
    public GrassType(String pid){
        if(Objects.equals(pid, "Venusaur")){
            setName(pid);
            setHp(134);
            setAtk(101);
            setDef(84);
            setSpd(101);
            setSpe(81);
            setMoveIsSpecial(true);
            setCatchRate(0.15);
        }
    }
    public String takeDamage(int enemyPower){
        if(enemy.getType() == "Water"){
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective";
        } else if (enemy.getType() == "Fire") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}