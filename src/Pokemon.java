import java.util.Objects;

class Pokemon {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spd;
    protected int spe; // Speed is abbreviated as Spe to avoid confusion with Special Defence
    protected String type;
    protected boolean moveIsSpecial;
    protected double catchRate;


    public Pokemon() {
        name = "MissingNo.";
        hp = 33;
        atk = 136;
        def = 0;
        spd = 6;
        spe = 29;
        type = "Normal";
        moveIsSpecial = false;
        catchRate = 4;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public boolean isMoveIsSpecial() {
        return moveIsSpecial;
    }

    public void setMoveIsSpecial(boolean moveIsSpecial) {
        this.moveIsSpecial = moveIsSpecial;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
    }
    public String takeDamage(int enemyPower){
        return "The attack is effective";
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", spd=" + spd +
                ", spe=" + spe +
                ", moveSpecial=" + moveIsSpecial +
                ", catchRate=" + catchRate +
                '}';
    }
}
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
class waterType extends Pokemon {
    public waterType(){
        setType("Water");
    }
    public waterType(String pid){
        if(Objects.equals(pid, "Squirtle")){
            setName(pid);
            setHp(66);
            setAtk(35);
            setDef(44);
            setSpd(43);
            setSpe(33);
            setMoveIsSpecial(true);
            setCatchRate(0.4);
        }
    }
    @Override
    public String takeDamage(int enemyPower){
        if(enemy.getType() == "Fire"){
            hp -= (int) (enemyPower*0.5);
            return "The attack is not very effective";
        } else if (enemy.getType() == "Grass"||"Electric") {
            hp -= enemyPower*2;
            return "The attack is super effective!";
        }
        else {
            hp -= enemyPower;
            return "The attack is effective!";
        }
    }
}
class normalType extends Pokemon {
    public normalType(){
        setType("Normal");
    }
    public normalType(String pid){
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
class fightType extends Pokemon {
    public fightType(){
        setType("Fighting");
    }
    public fightType(String pid){
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
class ghostType extends Pokemon {
    public ghostType(){
        setType("Ghost");
    }
    public ghostType(String pid){
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
class elecType extends Pokemon {
    public elecType(){
        setType("Electric");
    }
    public elecType(String pid){
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
    public String takeDamage(int enemyPower){
            hp -= enemyPower;
            return "The attack is effective!";
    }
}
class grassType extends Pokemon {
    public grassType(){
        setType("Grass");
    }
    public grassType(String pid){
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
class psychType extends Pokemon {
    public psychType(){
        setType("Psychic");
    }
    public psychType(String pid){
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

