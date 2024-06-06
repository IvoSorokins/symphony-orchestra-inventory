package instruments.woodwinds;

import instruments.Instrument;

public abstract class WoodwindsInstrument implements Instrument {
    protected String manufacturer;
    protected String id;
    protected boolean isAvailable;

    public static final String ID_PREFIX = "WOODWINDS-";
}
