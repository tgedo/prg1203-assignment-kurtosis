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
    public fireType() {
        type = "Fire";
    }
    public fireType(String pid){
        if(Objects.equals(pid, "Charmander")){
            name = pid;
            hp = 63;
            atk = 41;
            def = 30;
            spd = 35;
            spe = 44;
            moveSpecial = true;
            catchRate = 0.4;
        }
    }
    public String getType() {
        return type;
    }

}
class waterType extends Pokemon {
    private String type;
    public waterType() {
        type = "Water";
    }
    public waterType(String pid){
        if(Objects.equals(pid, "Squirtle")){
            name = pid;
            hp = 66;
            atk = 35;
            def = 44;
            spd = 43;
            spe = 33;
            moveSpecial = true;
            catchRate = 0.4;
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
            name = pid;
            hp = 76;
            atk = 38;
            def = 29;
            spd = 33;
            spe = 74;
            moveSpecial = false;
            catchRate = 0.33;
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
            name = pid;
            hp = 103;
            atk = 68;
            def = 44;
            spd = 31;
            spe = 31;
            moveSpecial = false;
            catchRate = 0.33;
        }
    }
    public String getType() {
        return type;
    }
}
class ghostType extends Pokemon {
    private String type;
    public ghostType() {
        type = "Fighting";
    }
    public ghostType(String pid){
        if(Objects.equals(pid, "Haunter")){
            name = pid;
            hp = 97;
            atk = 51;
            def = 46;
            spd = 55;
            spe = 92;
            moveSpecial = false;
            catchRate = 0.25;
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
            name = pid;
            hp = 113;
            atk = 66;
            def = 53;
            spd = 66;
            spe = 116;
            moveSpecial = true;
            catchRate = 0.25;
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
            name = pid;
            hp = 134;
            atk = 101;
            def = 84;
            spd = 101;
            spe = 81;
            moveSpecial = true;
            catchRate = 0.15;
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
            name = pid;
            hp = 209;
            atk = 202;
            def = 120;
            spd = 120;
            spe = 171;
            moveSpecial = true;
            catchRate = 0.15;
        }
    }
    public String getType() {
        return type;
    }
}

