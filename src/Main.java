public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        System.out.println(pokemon1.getName());
        System.out.println(pokemon2.getName());

        if(pokemon1.isMoveIsSpecial()){
            System.out.println(pokemon1.getName() + "'s attack is Special.");
        } else {
            System.out.println(pokemon1.getName() + "'s attack is Physical");
        }

        Firetype pokemon3 = new Firetype("Charmander");
        System.out.println(pokemon3.getName());

    }
}