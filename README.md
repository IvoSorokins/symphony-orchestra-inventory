# Symphony Orchestra Inventory

## Overview
This project helps Symphony Orchestra to handle their instruments inventory, Instrument have to be assigned to musicians

## Structure
 - `Instrument` interface
 - `instruments.Section` abstract class implements `Instrument`
 - `StringsSection` - extends `Section`
 - `WoodwindsSection` - extends `Section`
 - `Section` abstract class implements `Instrument`
 - `StringsInstrument` - abstract class for string instruments
 - `WoodwindsInstrument` - abstract class for woodwind instruments
 - `Violin` - extends `StringsInstrument`
 - `Cello` - extends `StringsInstrument`
 - `Flute` - extends `WoodwindsInstrument`
 - `Musician` abstract class
 - `StringsMusician` - extends `Musician`
 - `WoodwindsMusician` - extends `Musician`
 - `Orchestra` main class
