package OOP;


public class SuperheroProject {
    public static int calculatePunchDamage(int strength){
        return strength *2;
    }
    public static int calculateSpecialAttack(String attackType, int strength)
    {
        int damage = strength;
        if (attackType.equals("fire punch")){
            damage = strength *3;
        } else if (attackType.equals("fire blast")) {
            damage = strength *2 ;
        }
    return damage;
    }

    public static void main(String[] args){
    int villainHealth = 100;
    int punchStrength = 20;
    String attackType = "fire punch";
    int damagebyPunch = villainHealth - calculatePunchDamage(punchStrength);
    int specialAttack = villainHealth -  calculateSpecialAttack(attackType,punchStrength);

    System.out.println("Villian remaining Health by punch: " + damagebyPunch);
    System.out.println("Villian remaining Health by special attack: " + specialAttack);
    }







}
