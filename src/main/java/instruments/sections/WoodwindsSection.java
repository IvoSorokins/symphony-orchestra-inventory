package instruments.sections;


import instruments.woodwinds.WoodwindsInstrument;
import java.util.ArrayList;
import java.util.List;


public class WoodwindsSection extends Section {
    private final List<WoodwindsInstrument> instruments;

    public WoodwindsSection(){
        super("Woodwinds section");
        this.instruments = new ArrayList<>();
    }

    @Override
    public void play(){
        super.play();
        System.out.print(" following string instruments:");
    }
}
