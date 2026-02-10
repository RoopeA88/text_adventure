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

        assertTrue("minor ice resistance potion" == inventory.potionInventory.get(0).getName());
        assertTrue("lesser ice resistance potion" == inventory.potionInventory.get(1).getName());
        assertTrue("common ice resistance potion" == inventory.potionInventory.get(2).getName());
        assertTrue("improved ice resistance potion" == inventory.potionInventory.get(3).getName());
        assertTrue("major ice resistance potion" == inventory.potionInventory.get(4).getName());
        assertTrue("superior ice resistance potion" == inventory.potionInventory.get(5).getName());
        assertTrue("greater ice resistance potion" == inventory.potionInventory.get(6).getName());
    }
    @Test
    public void testFirePotions(){
        inventory.takeMinorFirePotion();
        inventory.takeLesserFirePotion();
        inventory.takeCommonFirePotion();
        inventory.takeImprovedFirePotion();
        inventory.takeMajorFirePotion();
        inventory.takeSuperiorFirePotion();
        inventory.takeGreaterFirePotion();

        double minorFireFireDefence = inventory.potionInventory.get(0).getFire();
        double minorFireIceDefence = inventory.potionInventory.get(0).getIce();
        double minorFireAirDefence = inventory.potionInventory.get(0).getAir();
        double minorFireEarthDefence = inventory.potionInventory.get(0).getEarth();
        double minorFirePoisonDefence = inventory.potionInventory.get(0).getPoison();

        double lesserFireFireDefence = inventory.potionInventory.get(1).getFire();
        double lesserFireIceDefence = inventory.potionInventory.get(1).getIce();
        double lesserFireAirDefence = inventory.potionInventory.get(1).getAir();
        double lesserFireEarthDefence = inventory.potionInventory.get(1).getEarth();
        double lesserFirePoisonDefence = inventory.potionInventory.get(1).getPoison();

        double commonFireFireDefence = inventory.potionInventory.get(2).getFire();
        double commonFireIceDefence = inventory.potionInventory.get(2).getIce();
        double commonFireAirDefence = inventory.potionInventory.get(2).getAir();
        double commonFireEarthDefence = inventory.potionInventory.get(2).getEarth();
        double commonFirePoisonDefence = inventory.potionInventory.get(2).getPoison();

        double improvedFireFireDefence = inventory.potionInventory.get(3).getFire();
        double improvedFireIceDefence = inventory.potionInventory.get(3).getIce();
        double improvedFireAirDefence = inventory.potionInventory.get(3).getAir();
        double improvedFireEarthDefence = inventory.potionInventory.get(3).getEarth();
        double improvedFirePoisonDefence = inventory.potionInventory.get(3).getPoison();

        double majorFireFireDefence = inventory.potionInventory.get(4).getFire();
        double majorFireIceDefence = inventory.potionInventory.get(4).getIce();
        double majorFireAirDefence = inventory.potionInventory.get(4).getAir();
        double majorFireEarthDefence = inventory.potionInventory.get(4).getEarth();
        double majorFirePoisonDefence = inventory.potionInventory.get(4).getPoison();

        double superiorFireFireDefence = inventory.potionInventory.get(5).getFire();
        double superiorFireIceDefence = inventory.potionInventory.get(5).getIce();
        double superiorFireAirDefence = inventory.potionInventory.get(5).getAir();
        double superiorFireEarthDefence = inventory.potionInventory.get(5).getEarth();
        double superiorFirePoisonDefence = inventory.potionInventory.get(5).getPoison();

        double greaterFireFireDefence = inventory.potionInventory.get(6).getFire();
        double greaterFireIceDefence = inventory.potionInventory.get(6).getIce();
        double greaterFireAirDefence = inventory.potionInventory.get(6).getAir();
        double greaterFireEarthDefence = inventory.potionInventory.get(6).getEarth();
        double greaterFirePoisonDefence = inventory.potionInventory.get(6).getPoison();

        assertTrue(minorFireIceDefence+minorFireAirDefence+minorFireEarthDefence+minorFirePoisonDefence == 0.0);
        assertEquals(5.0, minorFireFireDefence);

        assertTrue(lesserFireIceDefence+lesserFireAirDefence+lesserFireEarthDefence+lesserFirePoisonDefence == 0.0);
        assertEquals(11.0,lesserFireFireDefence);

        assertTrue(commonFireIceDefence+commonFireAirDefence+commonFireEarthDefence+commonFirePoisonDefence == 0.0);
        assertEquals(18.0, commonFireFireDefence);

        assertTrue(improvedFireIceDefence+improvedFireAirDefence+improvedFireEarthDefence+improvedFirePoisonDefence == 0.0);
        assertEquals(25.0, improvedFireFireDefence);

        assertTrue(majorFireIceDefence+majorFireAirDefence+majorFireEarthDefence+majorFirePoisonDefence == 0.0);
        assertEquals(31.0, majorFireFireDefence);

        assertTrue(superiorFireIceDefence+superiorFireAirDefence+superiorFireAirDefence+superiorFirePoisonDefence == 0.0);
        assertEquals(38.0, superiorFireFireDefence);

        assertTrue(greaterFireIceDefence+greaterFireAirDefence+greaterFireEarthDefence+greaterFirePoisonDefence == 0.0);
        assertEquals(45.0, greaterFireFireDefence);

        assertTrue("minor fire resistance potion" == inventory.potionInventory.get(0).getName());
        assertTrue("lesser fire resistance potion" == inventory.potionInventory.get(1).getName());
        assertTrue("common fire resistance potion" == inventory.potionInventory.get(2).getName());
        assertTrue("improved fire resistance potion" == inventory.potionInventory.get(3).getName());
        assertTrue("major fire resistance potion" == inventory.potionInventory.get(4).getName());
        assertTrue("superior fire resistance potion" == inventory.potionInventory.get(5).getName());
        assertTrue("greater fire resistance potion" == inventory.potionInventory.get(6).getName());

    }
    @Test
    public void testEarthPotions(){
        inventory.takeMinorEarthPotion();
        inventory.takeLesserEarthPotion();
        inventory.takeCommonEarthPotion();
        inventory.takeImprovedEarthPotion();
        inventory.takeMajorEarthPotion();
        inventory.takeSuperiorEarthPotion();
        inventory.takeGreaterEarthPotion();

        double minorEarthEarthDefence = inventory.potionInventory.get(0).getEarth();
        double minorEarthIceDefence = inventory.potionInventory.get(0).getIce();
        double minorEarthFireDefence = inventory.potionInventory.get(0).getFire();
        double minorEarthAirDefence = inventory.potionInventory.get(0).getAir();
        double minorEarthPoisonDefence = inventory.potionInventory.get(0).getPoison();

        double lesserEarthEarthDefence = inventory.potionInventory.get(1).getEarth();
        double lesserEarthIceDefence = inventory.potionInventory.get(1).getIce();
        double lesserEarthFireDefence = inventory.potionInventory.get(1).getFire();
        double lesserEarthAirDefence = inventory.potionInventory.get(1).getAir();
        double lesserEarthPoisonDefence = inventory.potionInventory.get(1).getPoison();

        double commonEarthEarthDefence = inventory.potionInventory.get(2).getEarth();
        double commonEarthIceDefence = inventory.potionInventory.get(2).getIce();
        double commonEarthFireDefence = inventory.potionInventory.get(2).getFire();
        double commonEarthAirDefence = inventory.potionInventory.get(2).getAir();
        double commonEarthPoisonDefence = inventory.potionInventory.get(2).getPoison();

        double improvedEarthEarthDefence = inventory.potionInventory.get(3).getEarth();
        double improvedEarthIceDefence = inventory.potionInventory.get(3).getIce();
        double improvedEarthFireDefence = inventory.potionInventory.get(3).getFire();
        double improvedEarthAirDefence = inventory.potionInventory.get(3).getAir();
        double improvedEarthPoisonDefence = inventory.potionInventory.get(3).getPoison();
        
        double majorEarthEarthDefence = inventory.potionInventory.get(4).getEarth();
        double majorEarthIceDefence = inventory.potionInventory.get(4).getIce();
        double majorEarthFireDefence = inventory.potionInventory.get(4).getFire();
        double majorEarthAirDefence = inventory.potionInventory.get(4).getAir();
        double majorEarthPoisonDefence = inventory.potionInventory.get(4).getPoison();

        double superiorEarthEarthDefence = inventory.potionInventory.get(5).getEarth();
        double superiorEarthIceDefence = inventory.potionInventory.get(5).getIce();
        double superiorEarthFireDefence = inventory.potionInventory.get(5).getFire();
        double superiorEarthAirDefence = inventory.potionInventory.get(5).getAir();
        double superiorEarthPoisonDefence = inventory.potionInventory.get(5).getPoison();

        double greaterEarthEarthDefence = inventory.potionInventory.get(6).getEarth();
        double greaterEarthIceDefence = inventory.potionInventory.get(6).getIce();
        double greaterEarthFireDefence = inventory.potionInventory.get(6).getFire();
        double greaterEarthAirDefence = inventory.potionInventory.get(6).getAir();
        double greaterEarthPoisonDefence = inventory.potionInventory.get(6).getPoison();

        assertTrue(minorEarthIceDefence+minorEarthFireDefence+minorEarthAirDefence+minorEarthPoisonDefence == 0.0);
        assertEquals(5.0, minorEarthEarthDefence);

        assertTrue(lesserEarthIceDefence+lesserEarthFireDefence+lesserEarthAirDefence+lesserEarthPoisonDefence == 0.0);
        assertEquals(11.0, lesserEarthEarthDefence);


        assertTrue(commonEarthIceDefence+commonEarthFireDefence+commonEarthAirDefence+commonEarthPoisonDefence == 0.0);
        assertEquals(18.0, commonEarthEarthDefence);

        assertTrue(improvedEarthIceDefence+improvedEarthFireDefence+improvedEarthAirDefence+improvedEarthPoisonDefence == 0.0);
        assertEquals(25.0, improvedEarthEarthDefence);

        assertTrue(majorEarthIceDefence+majorEarthFireDefence+majorEarthAirDefence+majorEarthPoisonDefence == 0.0);
        assertEquals(31.0, majorEarthEarthDefence);

        assertTrue(superiorEarthIceDefence+superiorEarthFireDefence+superiorEarthAirDefence+superiorEarthPoisonDefence == 0.0);
        assertEquals(38.0, superiorEarthEarthDefence);

        assertTrue(greaterEarthIceDefence+greaterEarthFireDefence+greaterEarthAirDefence+greaterEarthPoisonDefence == 0.0);
        assertEquals(45.0, greaterEarthEarthDefence);

        assertTrue("minor earth resistance potion" == inventory.potionInventory.get(0).getName());
        assertTrue("lesser earth resistance potion" == inventory.potionInventory.get(1).getName());
        assertTrue("common earth resistance potion" == inventory.potionInventory.get(2).getName());
        assertTrue("improved earth resistance potion" == inventory.potionInventory.get(3).getName());
        assertTrue("major earth resistance potion" == inventory.potionInventory.get(4).getName());
        assertTrue("superior earth resistance potion" == inventory.potionInventory.get(5).getName());
        assertTrue("greater earth resistance potion" == inventory.potionInventory.get(6).getName());


    }
    @Test
    public void testAirPotions(){
        inventory.takeMinorAirPotion();
        inventory.takeLesserAirPotion();
        inventory.takeCommonAirPotion();
        inventory.takeImprovedAirPotion();
        inventory.takeMajorAirPotion();
        inventory.takeSuperiorAirPotion();
        inventory.takeGreaterAirPotion();

        double minorAirAirDefence = inventory.potionInventory.get(0).getAir();
        double minorAirIceDefence = inventory.potionInventory.get(0).getIce();
        double minorAirFireDefence = inventory.potionInventory.get(0).getFire();
        double minorAirEarthDefence = inventory.potionInventory.get(0).getEarth();
        double minorAirPoisonDefence = inventory.potionInventory.get(0).getPoison();

        double lesserAirAirDefence = inventory.potionInventory.get(1).getAir();
        double lesserAirIceDefence = inventory.potionInventory.get(1).getIce();
        double lesserAirFireDefence = inventory.potionInventory.get(1).getFire();
        double lesserAirEarthDefence = inventory.potionInventory.get(1).getEarth();
        double lesserAirPoisonDefence = inventory.potionInventory.get(1).getPoison();

        double commonAirAirDefence = inventory.potionInventory.get(2).getAir();
        double commonAirIceDefence = inventory.potionInventory.get(2).getIce();
        double commonAirFireDefence = inventory.potionInventory.get(2).getFire();
        double commonAirEarthDefence = inventory.potionInventory.get(2).getEarth();
        double commonAirPoisonDefence = inventory.potionInventory.get(2).getPoison();

        double improvedAirAirDefence = inventory.potionInventory.get(3).getAir();
        double improvedAirIceDefence = inventory.potionInventory.get(3).getIce();
        double improvedAirFireDefence = inventory.potionInventory.get(3).getFire();
        double improvedAirEarthDefence = inventory.potionInventory.get(3).getEarth();
        double improvedAirPoisonDefence = inventory.potionInventory.get(3).getPoison();

        double majorAirAirDefence = inventory.potionInventory.get(4).getAir();
        double majorAirIceDefence = inventory.potionInventory.get(4).getIce();
        double majorAirFireDefence = inventory.potionInventory.get(4).getFire();
        double majorAirEarthDefence = inventory.potionInventory.get(4).getEarth();
        double majorAirPoisonDefence = inventory.potionInventory.get(4).getPoison();

        double superiorAirAirDefence = inventory.potionInventory.get(5).getAir();
        double superiorAirIceDefence = inventory.potionInventory.get(5).getIce();
        double superiorAirFireDefence = inventory.potionInventory.get(5).getFire();
        double superiorAirEarthDefence = inventory.potionInventory.get(5).getEarth();
        double superiorAirPoisonDefence = inventory.potionInventory.get(5).getPoison();

        double greaterAirAirDefence = inventory.potionInventory.get(6).getAir();
        double greaterAirIceDefence = inventory.potionInventory.get(6).getIce();
        double greaterAirFireDefence = inventory.potionInventory.get(6).getFire();
        double greaterAirEarthDefence = inventory.potionInventory.get(6).getEarth();
        double greaterAirPoisonDefence = inventory.potionInventory.get(6).getPoison();

        assertTrue(minorAirIceDefence+minorAirFireDefence+minorAirEarthDefence+minorAirPoisonDefence == 0.0);
        assertEquals(5, minorAirAirDefence);

        assertTrue(lesserAirIceDefence+lesserAirFireDefence+lesserAirEarthDefence+lesserAirPoisonDefence == 0.0);
        assertEquals(11.0,lesserAirAirDefence);

        assertTrue(commonAirIceDefence+commonAirFireDefence+commonAirEarthDefence+commonAirPoisonDefence == 0.0);
        assertEquals(18.0, commonAirAirDefence);

        assertTrue(improvedAirIceDefence+improvedAirFireDefence+improvedAirEarthDefence+improvedAirPoisonDefence == 0.0);
        assertEquals(25.0, improvedAirAirDefence);

        assertTrue(majorAirIceDefence+majorAirFireDefence+majorAirEarthDefence+majorAirPoisonDefence == 0.0);
        assertEquals(31.0, majorAirAirDefence);

        assertTrue(superiorAirIceDefence+superiorAirFireDefence+superiorAirEarthDefence+superiorAirPoisonDefence == 0.0);
        assertEquals(38.0, superiorAirAirDefence);

        assertTrue(greaterAirIceDefence+greaterAirFireDefence+greaterAirEarthDefence+greaterAirPoisonDefence == 0.0);
        assertEquals(45.0, greaterAirAirDefence);

        assertTrue("minor air resistance potion" == inventory.potionInventory.get(0).getName());
        assertTrue("lesser air resistance potion" == inventory.potionInventory.get(1).getName());
        assertTrue("common air resistance potion" == inventory.potionInventory.get(2).getName());
        assertTrue("improved air resistance potion" == inventory.potionInventory.get(3).getName());
        assertTrue("major air resistance potion" == inventory.potionInventory.get(4).getName());
        assertTrue("superior air resistance potion" == inventory.potionInventory.get(5).getName());
        assertTrue("greater air resistance potion" == inventory.potionInventory.get(6).getName());


    }

    @Test
    public void testPoisonPotions(){
        inventory.takeMinorPoisonPotion();
        inventory.takeLesserPoisonPotion();
        inventory.takeCommonPoisonPotion();
        inventory.takeImprovedPoisonPotion();
        inventory.takeMajorPoisonPotion();
        inventory.takeSuperiorPoisonPotion();
        inventory.takeGreaterPoisonPotion();

        double minorPoisonPoisonDefence = inventory.potionInventory.get(0).getPoison();
        double minorPoisonIceDefence = inventory.potionInventory.get(0).getIce();
        double minorPoisonFireDefence = inventory.potionInventory.get(0).getFire();
        double minorPoisonEarthDefence = inventory.potionInventory.get(0).getEarth();
        double minorPoisonAirDefence = inventory.potionInventory.get(0).getAir();

        double lesserPoisonPoisonDefence = inventory.potionInventory.get(1).getPoison();
        double lesserPoisonIceDefence = inventory.potionInventory.get(1).getIce();
        double lesserPoisonFireDefence = inventory.potionInventory.get(1).getFire();
        double lesserPoisonEarthDefence = inventory.potionInventory.get(1).getEarth();
        double lesserPoisonAirDefence = inventory.potionInventory.get(1).getAir();

        double commonPoisonPoisonDefence = inventory.potionInventory.get(2).getPoison();
        double commonPoisonIceDefence = inventory.potionInventory.get(2).getIce();
        double commonPoisonFireDefence = inventory.potionInventory.get(2).getFire();
        double commonPoisonEarthDefence = inventory.potionInventory.get(2).getEarth();
        double commonPoisonAirDefence = inventory.potionInventory.get(2).getAir();

        double improvedPoisonPoisonDefence = inventory.potionInventory.get(3).getPoison();
        double improvedPoisonIceDefence = inventory.potionInventory.get(3).getIce();
        double improvedPoisonFireDefence = inventory.potionInventory.get(3).getFire();
        double improvedPoisonEarthDefence = inventory.potionInventory.get(3).getEarth();
        double improvedPoisonAirDefence = inventory.potionInventory.get(3).getAir();

        double majorPoisonPoisonDefence = inventory.potionInventory.get(4).getPoison();
        double majorPoisonIceDefence = inventory.potionInventory.get(4).getIce();
        double majorPoisonFireDefence = inventory.potionInventory.get(4).getFire();
        double majorPoisonEarthDefence = inventory.potionInventory.get(4).getEarth();
        double majorPoisonAirDefence = inventory.potionInventory.get(4).getAir();

        double superiorPoisonPoisonDefence = inventory.potionInventory.get(5).getPoison();
        double superiorPoisonIceDefence = inventory.potionInventory.get(5).getIce();
        double superiorPoisonFireDefence = inventory.potionInventory.get(5).getFire();
        double superiorPoisonEarthDefence = inventory.potionInventory.get(5).getEarth();
        double superiorPoisonAirDefence = inventory.potionInventory.get(5).getAir();

        double greaterPoisonPoisonDefence = inventory.potionInventory.get(6).getPoison();
        double greaterPoisonIceDefence = inventory.potionInventory.get(6).getIce();
        double greaterPoisonFireDefence = inventory.potionInventory.get(6).getFire();
        double greaterPoisonEarthDefence = inventory.potionInventory.get(6).getEarth();
        double greaterPoisonAirDefence = inventory.potionInventory.get(6).getAir();

        assertTrue(minorPoisonIceDefence+minorPoisonFireDefence+minorPoisonEarthDefence+minorPoisonAirDefence == 0.0);
        assertEquals(5.0, minorPoisonPoisonDefence);

        assertTrue(lesserPoisonIceDefence+lesserPoisonFireDefence+lesserPoisonEarthDefence+lesserPoisonAirDefence == 0.0);
        assertEquals(11.0, lesserPoisonPoisonDefence);

        assertTrue(commonPoisonIceDefence+commonPoisonFireDefence+commonPoisonEarthDefence+commonPoisonAirDefence == 0.0);
        assertEquals(18.0, commonPoisonPoisonDefence);

        assertTrue(improvedPoisonIceDefence+improvedPoisonFireDefence+improvedPoisonEarthDefence+improvedPoisonAirDefence == 0.0);
        assertEquals(25.0, improvedPoisonPoisonDefence);

        assertTrue(majorPoisonIceDefence+majorPoisonFireDefence+majorPoisonEarthDefence+majorPoisonAirDefence == 0.0);
        assertEquals(31.0, majorPoisonPoisonDefence);

        assertTrue(superiorPoisonIceDefence+superiorPoisonFireDefence+superiorPoisonEarthDefence+superiorPoisonAirDefence == 0.0);
        assertEquals(38.0, superiorPoisonPoisonDefence);

        assertTrue(greaterPoisonIceDefence+greaterPoisonFireDefence+greaterPoisonEarthDefence+greaterPoisonAirDefence == 0.0);
        assertEquals(45.0, greaterPoisonPoisonDefence);

        assertTrue("minor poison resistance potion" == inventory.potionInventory.get(0).getName());
        assertTrue("lesser poison resistance potion" == inventory.potionInventory.get(1).getName());
        assertTrue("common poison resistance potion" == inventory.potionInventory.get(2).getName());
        assertTrue("improved poison resistance potion" == inventory.potionInventory.get(3).getName());
        assertTrue("major poison resistance potion" == inventory.potionInventory.get(4).getName());
        assertTrue("superior poison resistance potion" == inventory.potionInventory.get(5).getName());
        assertTrue("greater poison resistance potion" == inventory.potionInventory.get(6).getName());


    }
    
}
