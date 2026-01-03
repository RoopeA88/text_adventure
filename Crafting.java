public class Crafting {

    private String name;
    private String type;
    private String tool;
    private String station;

    private Crafting(CraftingBuilder craftingBuilder){
        this.name = craftingBuilder.name;
        this.type = craftingBuilder.type;
        this.tool = craftingBuilder.tool;
        this.station = craftingBuilder.station;
    }
    public String getName(){
        return this.name;
        
    }
    public String getType(){
        return this.type;
    }
    public String getTool(){
        return this.tool;
    }
    public String getStation(){
        return this.station;
    }
    public class CraftingBuilder{

    private String name;
    private String type;
    private String tool;
    private String station;

    public CraftingBuilder name(String name_){
        this.name = name_;
        return this;
    }
    public CraftingBuilder type(String type_){
        this.type = type_;
        return this;
    }
    public CraftingBuilder tool(String tool_){
        this.tool = tool_;
        return this;
    }
    public CraftingBuilder station(String station_){
        this.station = station_;
        return this;
    }
    public Crafting build(){
        return new Crafting(this);
    }
        
    }


}
