class NormalType extends Pokemon {
    public NormalType(){
        setType("Normal");
    }
    public NormalType(String pid){
        if(Objects.equals(pid, "Meowth")){
            setName(pid);
            setHp(76);
            setAtk(38);
            setDef(29);
            setSpd(33);
            setSpe(74);
            setMoveIsSpecial(false);
            setCatchRate(0.33);
        }
    }
    public String takeDamage(int enemyPower){
        if (enemy.getType() == "Fighting") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        } else if (enemy.getType() == "Ghost"){
            hp -= (int) (enemyPower*0.1);
            return "The attack was ineffective";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}