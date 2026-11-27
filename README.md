# Dufuna Java Programme – Lekki Property Application

## Project Overview

This project is part of the Dufuna Java Programme. It demonstrates Java object-oriented programming concepts through a simple Lekki Property application.

## Technologies Used

- Java 17
- Apache Maven
- IntelliJ IDEA

## Project Structure

```text
src/
└── main/
    └── java/
        └── com/dufuna/berlin/ogooluwaakinleye/
            ├── address/
            │   └── AddressApp.java
            ├── model/
            │   └── LekkiProperty.java
            ├── service/
            │   ├── LekkiPropertyService.java
            │   └── MockLekkiPropertyService.java
            └── lekki/
                └── MockLekkiPropertyApp.java
```

## Features

- LekkiProperty model with 12 fields.
- No-arguments constructor.
- Getters and setters.
- Overridden `toString()`, `equals()` and `hashCode()` methods.
- LekkiPropertyService interface.
- MockLekkiPropertyService implementation with in-memory storage.
- Application for creating, saving and retrieving a property.

## Requirements

- Java JDK 17 or later.
- Apache Maven 3.10 or later.

## Build the Project

From the project root, run:

```bash
mvn clean install
```

## Run the Application

Run `MockLekkiPropertyApp.java` from IntelliJ IDEA, or execute:

```bash
java -cp target/classes com.dufuna.berlin.ogooluwaakinleye.lekki.MockLekkiPropertyApp
```

## Expected Output

```text
MockLekkiPropertyService.saveProperty called
MockLekkiPropertyService.getProperty called
LekkiProperty{propertyID=1, address='Lekki Phase 1, Lagos', type='Duplex', numberOfBedrooms=5, numberofSittingRooms=2, numberOfKitchens=1, numberOfBathtrooms=5, numberOfToilets=6, owner='Ogooluwa Akinleye', description='A beautiful five bedroom duplex', validFrom=2026-01-01, validTo=2027-01-01}

```

