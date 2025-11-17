class Main{
    public static void main(String[] args){
        Character character = Character.getInstance();
        character.chooseName();
        System.out.println("Your name is: ");
        System.out.println(character.getName());
        character.chooseCharacterClass();
        System.out.println("Your class is: ");
        System.out.println(character.getCharacterClass());
    }
}