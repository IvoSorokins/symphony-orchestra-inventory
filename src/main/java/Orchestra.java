import instruments.Instrument;
import instruments.sections.StringsSection;
import instruments.sections.WoodwindsSection;


public class Orchestra {
    public static void main(String[] args) {
        Instrument strings = new StringsSection();
        Instrument woodwinds = new WoodwindsSection();

        strings.play();
        System.out.println();
        woodwinds.play();
    }
}
