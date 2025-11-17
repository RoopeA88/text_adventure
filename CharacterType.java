public enum CharacterType {
    MAGE("Mage"),
    BARBARIAN("Barbarian"),
    SOLDIER("Soldier"),
    THIEF("Thief"),
    NECROMANCER("Necromancer");

    private String typeOfCharacter;
    
    CharacterType(String type_){
        this.typeOfCharacter = type_;
    }

    public String getCharacterType(){
        System.out.println("moi");
        return this.typeOfCharacter;

    }

}
