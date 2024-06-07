package musicians;


import instruments.Instrument;


public abstract class Musician {
    protected String name;
    protected String instrumentID;

    public Musician(String name){
        this.name = name;
        this.instrumentID = null;
    }

    public String getInstrumentID(){
        return instrumentID;
    }

    public void setInstrumentID(String instrumentID){
        this.instrumentID = instrumentID;
    }
    public abstract void takeInstrument(Instrument instrument);

}


