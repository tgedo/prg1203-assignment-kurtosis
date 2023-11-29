import java.util.Objects;

public class Pokemon {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int spe; // Speed is abbreviated as Spe to avoid confusion with Special Defence
    private String type;
    private boolean moveSpecial;
    private double catchRate;

    public Pokemon() {
        name = "MissingNo.";
        hp = 33;
        atk = 136;
        def = 0;
        spd = 6;
        spe = 29;
        type = "Normal";
        moveSpecial = false;
        catchRate = 4;
    }

    public Pokemon(String pid) {
        if(Objects.equals(pid, "Charmander")){
            name = "Charmander";
            hp = 63;
            atk = 41;
            def = 30;
            spd = 35;
            spe = 44;
            type = "Fire";
            moveSpecial = true;
            catchRate = 45;
        } else if (Objects.equals(pid, "Squirtle")) {
            name = "Squirtle";
            hp = 66;
            atk = 35;
            def = 44;
            spd = 43;
            spe = 33;
            type = "Water";
            moveSpecial = true;
            catchRate = 45;
        } else if (Objects.equals(pid, "Riolu")) {
            name = "Riolu";
            hp = 62;
            atk = 46;
            def = 28;
            spd = 28;
            spe = 39;
            type = "Fighting";
            moveSpecial = false;
            catchRate = 45;
        }
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", type='" + type + '\'' +
                ", moveSpecial=" + moveSpecial +
                ", catchRate=" + catchRate +
                '}';
    }
}
