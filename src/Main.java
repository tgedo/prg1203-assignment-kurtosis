public class Main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        System.out.println(pokemon1.getName());
        System.out.println(pokemon2.getName());

        if(pokemon1.isMoveSpecial()){
            System.out.println(pokemon1.getName() + "'s attack is Special.");
        } else {
            System.out.println(pokemon1.getName() + "'s attack is Physical");
        }

        fireType pokemon3 = new fireType("Charmander");
        System.out.println(pokemon3.getName());

    }
}