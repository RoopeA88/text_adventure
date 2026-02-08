import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PotionTest {
    Inventory inventory = new Inventory();
    @Test
    public void testIcePotions(){
        inventory.takeMinorIcePotion();
        inventory.takeLesserIcePotion();
        inventory.takeCommonIcePotion();
        inventory.takeImprovedIcePotion();
        inventory.takeMajorIcePotion();
        inventory.takeSuperiorIcePotion();
        inventory.takeGreaterIcePotion();

        double minorIceIceDefence = inventory.potionInventory.get(0).getIce();
        double minorIceFireDefence = inventory.potionInventory.get(0).getFire();
        double minorIceAirDefence = inventory.potionInventory.get(0).getAir();
        double minorIceEarthDefence = inventory.potionInventory.get(0).getEarth();
        double minorIcePoisonDefence = inventory.potionInventory.get(0).getPoison();

        double lesserIceIceDefence = inventory.potionInventory.get(1).getIce();
        double lesserIceFireDefence = inventory.potionInventory.get(1).getFire();
        double lesserIceAirDefence = inventory.potionInventory.get(1).getAir();
        double lesserIceEarthDefence = inventory.potionInventory.get(1).getEarth();
        double lesserIcePoisonDefence = inventory.potionInventory.get(1).getPoison();

        double commonIceIceDefence = inventory.potionInventory.get(2).getIce();
        double commonIceFireDefence = inventory.potionInventory.get(2).getFire();
        double commonIceAirDefence = inventory.potionInventory.get(2).getAir();
        double commonIceEarthDefence = inventory.potionInventory.get(2).getEarth();
        double commonIcePoisonDefence = inventory.potionInventory.get(2).getPoison();

        double improvedIceIceDefence = inventory.potionInventory.get(3).getIce();
        double improvedIceFireDefence = inventory.potionInventory.get(3).getFire();
        double improvedIceAirDefence = inventory.potionInventory.get(3).getAir();
        double improvedIceEarthDefence = inventory.potionInventory.get(3).getEarth();
        double improvedIcePoisonDefence = inventory.potionInventory.get(3).getPoison();

        double majorIceIceDefence = inventory.potionInventory.get(4).getIce();
        double majorIceFireDefence = inventory.potionInventory.get(4).getFire();
        double majorIceAirDefence = inventory.potionInventory.get(4).getAir();
        double majorIceEarthDefence = inventory.potionInventory.get(4).getEarth();
        double majorIcePoisonDefence = inventory.potionInventory.get(4).getPoison();

        double superiorIceIceDefence = inventory.potionInventory.get(5).getIce();
        double superiorIceFireDefence = inventory.potionInventory.get(5).getFire();
        double superiorIceAirDefence = inventory.potionInventory.get(5).getAir();
        double superiorIceEarthDefence = inventory.potionInventory.get(5).getEarth();
        double superiorIcePoisonDefence = inventory.potionInventory.get(5).getPoison();

        double greaterIceIceDefence = inventory.potionInventory.get(6).getIce();
        double greaterIceFireDefence = inventory.potionInventory.get(6).getFire();
        double greaterIceAirDefence = inventory.potionInventory.get(6).getAir();
        double greaterIceEarthDefence = inventory.potionInventory.get(6).getEarth();
        double greaterIcePoisonDefence = inventory.potionInventory.get(6).getPoison();

        assertTrue(minorIceFireDefence+minorIceAirDefence+minorIceEarthDefence+minorIcePoisonDefence == 0.0);
        assertEquals(minorIceIceDefence,5.0);

        assertTrue(lesserIceFireDefence+lesserIceAirDefence+lesserIceEarthDefence+lesserIcePoisonDefence == 0.0);
        assertEquals(lesserIceIceDefence, 11.0);

        assertTrue(commonIceFireDefence+commonIceAirDefence+commonIceEarthDefence+commonIcePoisonDefence == 0.0);
        assertEquals(commonIceIceDefence, 18.0);

        assertTrue(improvedIceFireDefence+improvedIceAirDefence+improvedIceEarthDefence+improvedIcePoisonDefence == 0.0);
        assertEquals(improvedIceIceDefence, 25.0);

        assertTrue(majorIceFireDefence+majorIceAirDefence+majorIceEarthDefence+majorIcePoisonDefence == 0.0);
        assertEquals(majorIceIceDefence, 31.0);

        assertTrue(superiorIceFireDefence+superiorIceAirDefence+superiorIceEarthDefence+superiorIcePoisonDefence == 0.0);
        assertEquals(superiorIceIceDefence, 38.0);

        assertTrue(greaterIceFireDefence+greaterIceAirDefence+greaterIceEarthDefence+greaterIcePoisonDefence == 0.0);
        assertEquals(greaterIceIceDefence, 45.0);

    }
}
