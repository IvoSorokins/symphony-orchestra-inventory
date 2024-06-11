package instruments.sections;

import instruments.Instrument;

/**
 * Abstract Section class implements the Instrument interface
 */
public abstract class Section implements Instrument {
    protected String sectionName;

    public Section(String sectionName){
        this.sectionName = sectionName;
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
