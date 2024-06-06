package instruments.woodwinds;

import instruments.Instrument;

import java.util.UUID;

public abstract class WoodwindsInstrument implements Instrument {
    protected String manufacturer;
    protected String id;
    protected boolean isAvailable;

    public static final String ID_PREFIX = "WOODWINDS-";

    public WoodwindsInstrument(String manufacturer){
        this.manufacturer = manufacturer;
        this.id = ID_PREFIX + UUID.randomUUID().toString();
        this.isAvailable = true;
    }

    public String getId(){
        return id;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
