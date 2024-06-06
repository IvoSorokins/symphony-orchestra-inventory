package instruments.sections;

import instruments.Instrument;

public abstract class Section implements Instrument {
    protected String sectionName;

    public Section(String sectionName){
        this.sectionName = sectionName;
    }

    @Override
    public void play() {
        System.out.print("Playing music with " + sectionName);
    }
}
