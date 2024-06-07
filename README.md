# Symphony Orchestra Inventory

## Overview
This project helps Symphony Orchestra to handle their instruments inventory, Instrument have to be assigned to musicians

## Structure

### Interface
 - `Instrument`: Defines the play() method to be implemented by all instruments

### Abstract Classes
 - `Section`: Implements `Instrument`, has an attribute for section name, prints a common action for instruments
 - `StringsInstrument` - Implements `Instrument`, has attributes for manufacturer, ID(ID Prefix for Strings), availability
 - `WoodwindsInstrument` - Implements `Instrument`, has attributes for manufacturer, ID(ID Prefix for Woodwinds), availability
 - `Musician` - Stores name and instrument ID

### Concrete Classes

#### Sections
 - `StringsSection` - extends `Section`, adds string instruments like Violin and Cello
 - `WoodwindsSection` - extends `Section`, adds woodwind instruments like Flute

#### Strings
 - `Violin` - extends `StringsInstrument`
 - `Cello` - extends `StringsInstrument`

#### Woodwinds
 - `Flute` - extends `WoodwindsInstrument`
 
#### Musicians
 - `StringsMusician` - extends `Musician`
 - `WoodwindsMusician` - extends `Musician`

#### Main Class
 - `Orchestra`: Manages objects for both section classes
