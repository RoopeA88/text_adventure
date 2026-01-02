class Main{
    public static void main(String[] args){
        Character character = Character.getInstance();
        character.chooseName();
        System.out.println("Your name is: ");
        System.out.println(character.getName());
        character.chooseCharacterClass();
        System.out.println("Your class is: ");
        System.out.println(character.getCharacterClass());
        Sword sword = new Sword.SwordBuilder()
                        .name("Excalibur")
                        .level(5)
                        .minDamage(10)
                        .maxDamage(20)
                        .quality("Legendary")
                        .character("Soldier")
                        .build();
    }
}