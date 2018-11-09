
package Game;



public class Character {

    // to/do: add armor into Battle
    
    String role;
    String name;
    int health;
    Abilities abilityobject;

    public void Character(Abilities ab) {
        abilityobject = ab;
    }
    
} // close class