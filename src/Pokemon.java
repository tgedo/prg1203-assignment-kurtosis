import java.util.Objects;

class Pokemon {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spd;
    protected int spe; // Speed is abbreviated as Spe to avoid confusion with Special Defence
    protected String type;
    protected boolean moveSpecial;
    protected double catchRate;

    public Pokemon() {
        name = "MissingNo.";
        hp = 33;
        atk = 136;
        def = 0;
        spd = 6;
        spe = 29;
        moveSpecial = false;
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


    public boolean isMoveSpecial() {
        return moveSpecial;
    }

    public void setMoveSpecial(boolean moveSpecial) {
        this.moveSpecial = moveSpecial;
    }

    public double getCatchRate() {
        return catchRate;
    }

    public void setCatchRate(double catchRate) {
        this.catchRate = catchRate;
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
                ", moveSpecial=" + moveSpecial +
                ", catchRate=" + catchRate +
                '}';
    }
}
class fireType extends Pokemon {
    private String type;
    private double typeMod; // Modifier for damage calculation
    public fireType() {
        type = "Fire";
    }
    public fireType(String pid){
        if(Objects.equals(pid, "Charmander")){
            setName(pid);
            setHp(63);
            setAtk(41);
            setDef(30);
            setSpd(35);
            setSpe(44);
            setMoveSpecial(true);
            setCatchRate(0.4);
        }
    }
    public String getType() {
        return type;
    }



    public double getTypeMod() {
        return typeMod;
    }
}
class waterType extends Pokemon {
    private String type;
    public waterType() {
        type = "Water";
    }
    public waterType(String pid){
        if(Objects.equals(pid, "Squirtle")){
            setName(pid);
            setHp(66);
            setAtk(35);
            setDef(44);
            setSpd(43);
            setSpe(33);
            setMoveSpecial(true);
            setCatchRate(0.4);
        }
    }
    public String getType() {
        return type;
    }
}
class normalType extends Pokemon {
    private String type;
    public normalType() {
        type = "Normal";
    }
    public normalType(String pid){
        if(Objects.equals(pid, "Meowth")){
            setName(pid);
            setHp(76);
            setAtk(38);
            setDef(29);
            setSpd(33);
            setSpe(74);
            setMoveSpecial(false);
            setCatchRate(0.33);
        }
    }
    public String getType() {
        return type;
    }
}
class fightType extends Pokemon {
    private String type;
    public fightType() {
        type = "Fighting";
    }
    public fightType(String pid){
        if(Objects.equals(pid, "Machop")){
            setName(pid);
            setHp(103);
            setAtk(68);
            setDef(44);
            setSpd(31);
            setSpe(31);
            setMoveSpecial(false);
            setCatchRate(0.33);
        }
    }
    public String getType() {
        return type;
    }
}
class ghostType extends Pokemon {
    private String type;
    public ghostType() {
        type = "Ghost";
    }
    public ghostType(String pid){
        if(Objects.equals(pid, "Haunter")){
            setName(pid);
            setHp(97);
            setAtk(51);
            setDef(46);
            setSpd(55);
            setSpe(92);
            setMoveSpecial(false);
            setCatchRate(0.25);
        }
    }
    public String getType() {
        return type;
    }
}
class elecType extends Pokemon {
    private String type;
    public elecType() {
        type = "Electric";
    }
    public elecType(String pid){
        if(Objects.equals(pid, "Pikachu")){
            setName(pid);
            setHp(113);
            setAtk(66);
            setDef(53);
            setSpd(66);
            setSpe(116);
            setMoveSpecial(true);
            setCatchRate(0.25);
        }
    }
    public String getType() {
        return type;
    }
}
class grassType extends Pokemon {
    private String type;
    public grassType() {
        type = "Grass";
    }
    public grassType(String pid){
        if(Objects.equals(pid, "Venusaur")){
            setName(pid);
            setHp(134);
            setAtk(101);
            setDef(84);
            setSpd(101);
            setSpe(81);
            setMoveSpecial(true);
            setCatchRate(0.15);
        }
    }
    public String getType() {
        return type;
    }
}
class psychType extends Pokemon {
    private String type;
    public psychType() {
        type = "Psychic";
    }
    public psychType(String pid){
        if(Objects.equals(pid, "Mewtwo")){
            setName(pid);
            setHp(209);
            setAtk(202);
            setDef(120);
            setSpd(120);
            setSpe(171);
            setMoveSpecial(true);
            setCatchRate(0.15);
        }
    }
    public String getType() {
        return type;
    }
}

