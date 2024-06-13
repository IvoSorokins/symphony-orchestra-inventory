# Symphony Orchestra Inventory

## Overview
This project helps Symphony Orchestra to handle their instruments inventory, Instrument have to be assigned to musicians
The project is divided into several packages: instruments, musicians, sections, and main

## Packages and Classes
### Main
Main program and utility classes
 - `Orchestra`: Main class to run the program. Manages Sections and Musicians
 - `OrchestraUtils`: Utility class for commong operations like saving instruments to a file and finding musicians names 
by instrument ID

### Instruments
Instrument - related classes
 - `Instrument` Interface: Declares the play() method

#### Strings
 - `StringsInstrument`: Abstract class implementing Instrument. Includes attributes: manufacturer, ID, isAvailable
 - `Violin`, `Cello`: Concrete classes extending `StringsInstrument`, implements `play()` method

#### Woodwinds
 - `WoodwindsInstrument`: Similar to `StringsInstrument` but represents Woodwinds Instruments
 - `Flute`: Concrete class extending `WoodwindsInstrument`, implements `play()` method

#### Sections
- `Section`: Abstract class implementing `Instrument`, contains a `name` attribute and `play()` method
- `StringsSection`: Extends `Section`, manages a list of `StringsInstrument`. 
Methods: `addInstrument()`,`printAvailableInstruments()`, `play()`

- `WoodwindsSection`: Extends `Section`, manages a list of `WoodwindsInstrument`, similar to `StringSection` methods

### Musicians
Musician - related classes
 - `Musician`: Abstract class with attributes `name`, `instrumentID`, and an abstract `takeInstrument()` method
 - `StringsMusician`: Extends `Musician`, implements `takeInstrument()` for `StringsInstrument`
 - `WoodwindsMusician`: Extends `Musician`, implements `takeInstrument()` for `WoodwindsInstrument`

## Lambda Expressions
Lambda expressions are used to simplify iteration over collections. For example, in the `play()` methods of 
`StringsSection` and `WoodwindsSection`, they streamline the process of invoking the `play()` method on each instrument.


## Summary
This project effectively manages an orchestra's inventory by categorizing instruments into sections, 
assigning them to musicians, and keeping track of their availability. 
Each class and method is designed to encapsulate specific functionalities, making the code modular and maintainable.