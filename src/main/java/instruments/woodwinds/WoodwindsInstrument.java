package instruments.woodwinds;

import instruments.Instrument;

import java.util.UUID;

public abstract class WoodwindsInstrument implements Instrument {
    protected String manufacturer;
    protected String ID;
    protected boolean isAvailable;

    public static final String ID_PREFIX = "WOODWINDS-";

    public WoodwindsInstrument(String manufacturer){
        this.manufacturer = manufacturer;
        this.ID = ID_PREFIX + UUID.randomUUID().toString();
        this.isAvailable = true;
    }

    public String getID(){
        return ID;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
