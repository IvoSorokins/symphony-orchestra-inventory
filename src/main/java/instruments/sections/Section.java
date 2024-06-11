package instruments.sections;

import instruments.Instrument;
import java.util.ArrayList;


/**
 * Abstract Section class implements the Instrument interface
 */
public abstract class Section implements Instrument {
    protected String sectionName;
    protected ArrayList<Instrument> instruments;

    public Section(String sectionName){
        this.sectionName = sectionName;
        this.instruments = new ArrayList<>();
    }

    public abstract <T extends Instrument> void addInstrument(T instrument);

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    @Override
    public void play() {
        System.out.print("playing music with ");
    }
}
