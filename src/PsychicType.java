class PsychicType extends Pokemon {
    public PsychicType(){
        setType("Psychic");
    }
    public PsychicType(String pid){
        if(Objects.equals(pid, "Mewtwo")){
            setName(pid);
            setHp(209);
            setAtk(202);
            setDef(120);
            setSpd(120);
            setSpe(171);
            setMoveIsSpecial(true);
            setCatchRate(0.15);
        }
    }
    public String takeDamage(int enemyPower){
        if(enemy.getType() == "Fighting"){
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective";
        } else if (enemy.getType() == "Ghost") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}