import java.util.Scanner;

public class Battle {
    private User player;
    private Pokemon playerPokemon;
    private Pokemon playerPokemon2;
    private Pokemon wild;
    private Pokemon wild2;
    private Pokemon[] field;

    public Battle(User player, Pokemon wild, Pokemon wild2) {
        this.player = player;
        this.wild = wild;
        this.wild2 = wild2;
        playerPokemon = ChoosePokemonFromLoadout(player);
        playerPokemon2 = ChoosePokemonFromLoadout(player);
        this.field = new Pokemon[]{playerPokemon,playerPokemon2,wild,wild2};
    }

    public int DealDamage(Pokemon attacker, Pokemon defender) {
        // Base damage
        int enemyPower = attacker.getAtk();
        // Stat modifiers
        if (attacker.moveIsSpecial) {
            enemyPower = (int) (enemyPower * ((attacker.getAtk() + 50) / (defender.getSpd() + 50)));
        } else {
            enemyPower = (int) (enemyPower * ((attacker.getAtk() + 50) / (defender.getDef() + 50)));
        }
            // RNG element
            enemyPower = (int) (enemyPower * (Math.random() * 0.15 + 0.85));
            // Ensure minimum damage of 1
            return Math.max(1, enemyPower);
    }

    public void DecideTurnOrder() {
        while (true){
            // Check turn
            for(Pokemon pokemon : field){
                pokemon.decreaseActionValue(pokemon.getSpe());
                if (pokemon.getActionValue() == 0){
                    pokemon.dealDamage();
                }
            }
        }
    }

    private Pokemon ChoosePokemonFromLoadout(User player){
        String errorMessage = "";
        while (true) {
            System.out.println(errorMessage);

            System.out.println("Pick a Pokemon");
            for(int choice = 1; choice <= player.getDeck().size(); choice++){
                System.out.println(choice+ ": " + player.getDeck().get(choice-1).getName());
             }

            try(Scanner sc = new Scanner(System.in)){
                int choice = sc.nextInt();
                if (!player.getDeck().get(choice-1).equals(playerPokemon)){
                    errorMessage = "";
                    return player.getDeck().get(choice-1);
                }
                else{
                    errorMessage = "This pokemon is already in the field!";
                    continue;
                }
            }
        }
    }
}

    