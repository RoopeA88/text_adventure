public enum Alliance  {
    VOXER("Voxer"),
    ANAIZ("Anaiz"),
    REPULAX("Repulax"),
    OHMEN("Ohmen"),
    SIGHEN("Sighen");

    private String playerAlliance;

    Alliance(String playerAlliance_){
        playerAlliance = playerAlliance_;
    }

    public String getAlliance(){
        return this.playerAlliance;
    }
    
}
