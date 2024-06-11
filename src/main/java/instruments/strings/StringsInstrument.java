package instruments.strings;

import instruments.Instrument;

import java.util.UUID;

public abstract class StringsInstrument implements Instrument {
    private final String manufacturer;
    private final String ID;
    private boolean isAvailable;
    public static final String ID_PREFIX = "STRINGS-";

    public StringsInstrument(String manufacturer){
        this.manufacturer = manufacturer;
        this.ID = ID_PREFIX + UUID.randomUUID().toString();
        this.isAvailable = true;
    }

    public String getManufacturer(){
        return manufacturer;
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
