class GhostType extends Pokemon {
    public GhostType(){
        setType("Ghost");
    }
    public GhostType(String pid){
        if(Objects.equals(pid, "Haunter")){
            setName(pid);
            setHp(97);
            setAtk(51);
            setDef(46);
            setSpd(55);
            setSpe(92);
            setMoveIsSpecial(false);
            setCatchRate(0.25);
        }
    }
    public String takeDamage(int enemyPower){
        if (enemy.getType() == "Ghost") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        } else if (enemy.getType() == "Normal"||"Fighting") {
            hp -= (int) (enemyPower*0.1);
            return "The attack is ineffective";
        } else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}