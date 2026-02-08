import java.util.List;
class Main{
    public static void main(String[] args){
        // Game game = new Game();
        // game.run();
        Inventory inventory = new Inventory();

        inventory.takeGreaterAirPotion();
        inventory.takeSuperiorAirPotion();
        inventory.takeMajorAirPotion();
        inventory.takeImprovedAirPotion();
        inventory.takeCommonAirPotion();
        inventory.takeLesserAirPotion();
        inventory.takeMinorAirPotion();

        int minor = 0;
        int lesser = 0;
        int common = 0;
        int improved = 0;
        int major = 0;
        int superior = 0;
        int greater = 0;
        for(Potion potion: inventory.potionInventory){
            if(potion.getName().equals("minor air resistance potion")){
                minor++;
            } else if(potion.getName().equals("lesser air resistance potion")){
                lesser++;
            } else if(potion.getName().equals("common air resistance potion")){
                common++;
            } else if(potion.getName().equals("improved air resistance potion")){
                improved++;
            } else if(potion.getName().equals("major air resistance potion")){
                major++;
            } else if(potion.getName().equals("superior air resistance potion")){
                superior++;
            } else if(potion.getName().equals("greater air resistance potion")){
                greater++;
            }
        }
        System.out.println("minor: "+minor+ " lesser: "+lesser+ " common: "+common+ " improved: "+improved+ " major: "+ major + " superior: "+ superior + " greater: " + greater);

        
        
        
    }
}
