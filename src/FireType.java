class Firetype extends Pokemon {
    public Firetype(){
        setType("Fire");
    }
    public Firetype(String pid){
        if(Objects.equals(pid, "Charmander")){
            setName(pid);
            setHp(63);
            setAtk(41);
            setDef(30);
            setSpd(35);
            setSpe(44);
            setMoveIsSpecial(true);
            setCatchRate(0.4);
        }
    }

    @Override
    public String takeDamage(int enemyPower){
        if(enemy.getType() == "Grass"){
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective";
        } else if (enemy.getType() == "Water") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}