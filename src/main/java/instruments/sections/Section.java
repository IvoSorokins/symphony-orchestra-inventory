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

    @Override
    public void play() {
        System.out.print("playing music with " + sectionName);
    }
}
