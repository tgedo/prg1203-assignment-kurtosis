import java.util.Objects;

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

    @Override
    public String takeDamage(int enemyPower, String enemyType){
        if (enemyType == "Ghost") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        } else if (enemyType == "Normal" || enemyType == "Fighting") {
            hp -= (int) (enemyPower*0.1);
            return "The attack is ineffective";
        } else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}