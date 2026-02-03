import java.util.List;
class Main{
    public static void main(String[] args){
        //Game game = new Game();
        //game.run();
        List<Integer> lista = List.of(0,0,0,5,5);
        Inventory inventory = new Inventory();
        for(int i = 0; i<10;i++){
            Ring ring = new Ring.RingBuilder().name("moi").level(2).iceDefence(5).fireDefence(5).earthDefence(0).poisonDefence(0).airDefence(5).quality("poor").build();
            inventory.ringInventory.add(ring);
        }
        
        String testi = inventory.takeRandomLevelOneRingTwoElements(lista);
        System.out.println(testi);
        
        
    }
}
