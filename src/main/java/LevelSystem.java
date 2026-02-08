public class LevelSystem {
    
    //! Character level  1      HP 15   MP  8   Fish 13%
    //! Character Level  5      HP 20   MP 10
    //! Character Level 10      HP 25   MP 13   
    //! Character Level 15      HP 30   MP 15
    //! Character Level 20      HP 35   MP 18   Fish 13%
    //! Character Level 25      HP 40   MP 20
    //! Character Level 30      HP 45   MP 23   
    //! Character Level 40      HP 50   MP 25   
    //! Character Level 45      HP 55   MP 28   Fish 13%
    //! Character Level 50      HP 60   MP 30
    //! Character Level 55      HP 65   MP 33
    //! Character Level 60      HP 70   MP 35   
    //! Character Level 65      HP 75   MP 38   Fish 13%
    //! Character Level 70      HP 80   MP 40
    //! Character Level 75      HP 85   MP 43
    //! Character Level 80      HP 90   MP 45
    //! Character Level 85      HP 95   MP 48   Fish 13%
    //! Character Level 90      HP 100  MP 50
    //! Character Level 95      HP 105  MP 53
    //! Character Level 100     HP 110  MP 55   
    //! Character Level 105     HP 115  MP 58   Fish 13%
    //! Character Level 110     HP 120  MP 60
    //! Character Level 115     HP 125  MP 63
    //! Character Level 120     HP 130  MP 65
    //! Character Level 125     HP 135  MP 68   Fish 13%

    //* Fishing Level   1   shrimp          HP 2
    //* Fishing Level   20  herring         HP 5
    //* Fishing Level   45  rainbowfish     HP 7
    //* Fishing Level   65  bass            HP 10
    //* Fishing Level   85  lobster         HP 13
    //* Fishing Level   105 tuna            HP 16
    //* Fishing Level   125 shark           HP 20

    //? minor hp potion                                 HP 5 
    //? minor mp potion                                 MP 2
    //? minor level 1 elemental resistance potion       EL 5 one element
    //? minor level 2 elemental resistance potion       EL 5 two elements
    //? minor level 3 elemental resistance potion       EL 5 three elements
    //? minor level 4 elemental resistance potion       EL 5 four elements
    //? minor level 5 elemental resistance potion       EL 5 five elements
    
    //? lesser hp potion                                HP 11
    //? Lesser mp potion                                MP 4
    //? lesser level 1 elemental resistance potion      EL 11 one element
    //? lesser level 2 elemental resistance potion      EL 11 two elements
    //? lesser level 3 elemental resistance potion      EL 11 three elements
    //? lesser level 4 elemental resistance potion      EL 11 four elements
    //? lesser level 5 elemental resistance potion      EL 11 five elements
    
    //? common hp potion                                HP 18
    //? common mp potion                                MP 7
    //? common level 1 elemental resistance potion      EL 18 one element
    //? common level 2 elemental resistance potion      EL 18 two elements
    //? common level 3 elemental resistance potion      EL 18 three elements
    //? common level 4 elemental resistance potion      EL 18 four elements
    //? common level 5 elemental resistance potion      EL 18 five elements

    //? improved hp potion                              HP 25
    //? improved mp potion                              MP 9
    //? improved level 1 elemental resistance potion    EL 25 one element
    //? improved level 2 elemental resistance potion    EL 25 two elements
    //? improved level 3 elemental resistance potion    EL 25 three elements
    //? improved level 4 elemental resistance potion    EL 25 four elements
    //? improved level 5 elemental resistance potion    EL 25 five elements

    //? major hp potion                                 HP 31
    //? major mp potion                                 MP 12
    //? major level 1 elemental resistance potion       EL 31 one element
    //? major level 2 elemental resistance potion       EL 31 two elements
    //? major level 3 elemental resistance potion       EL 31 three elements
    //? major level 4 elemental resistance potion       EL 31 four elements
    //? major level 5 elemental resistance potion       EL 31 five elements

    //? superior hp potion                              HP 38
    //? superior mp potion                              MP 14
    //? superior level 1 elemental resistance potion    EL 38 one element
    //? superior level 2 elemental resistance potion    EL 38 two elements
    //? superior level 3 elemental resistance potion    EL 38 three elements
    //? superior level 4 elemental resistance potion    EL 38 four elements
    //? superior level 5 elemental resistance potion    EL 38 five elements

    //? greater hp potion                               HP 45
    //? greater mp potion                               MP 17
    //? greater level 1 elemental resistance potion     EL 45 one element
    //? greater level 2 elemental resistance potion     EL 45 two elements
    //? greater level 3 elemental resistance potion     EL 45 three elements
    //? greater level 4 elemental resistance potion     EL 45 four elements
    //? greater level 5 elemental resistance potion     EL 45 five elements
    
    //* Potionit toimii niin, että kun otettu tarpeeksi sitä elementin damagea niin potion kuihtuu pois. Eli jos on 45 fire
    //* resistance ja pelaaja ottaa 10+10+10+15 fire damagea potionin tuoma suoja on poissa.
    //* Sormuksissa taas suoja pysyy. eli jos fire EL on 25 ja pelaaja ottaa 22 fire damagea (yksi isku), ei damagea tule. 
    //* jos taas tulee 35 fire damagea (yksi isku) niin se on 10 damagea.
}
