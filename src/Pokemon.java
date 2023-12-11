import java.util.Objects;

class Pokemon {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    protected int spd;  //This is Special Defense
    protected int spe;  // Speed is abbreviated as Spe to avoid confusion with Special Defence
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

