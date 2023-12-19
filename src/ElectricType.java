import java.util.Objects;

class ElectricType extends Pokemon {
    public ElectricType(){
        setType("Electric");
    }
    public ElectricType(String pid){
        if(Objects.equals(pid, "Pikachu")){
            setName(pid);
            setHp(113);
            setAtk(66);
            setDef(53);
            setSpd(66);
            setSpe(116);
            setMoveIsSpecial(true);
            setCatchRate(0.25);
        }
    }
    public String takeDamage(int enemyPower, String enemyType){
            hp -= enemyPower;
            return "The attack is effective!";
    }
}