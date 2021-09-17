-- NOTES

We will harness the power of inheritance and polymorphsm further in this lesson using more abstraction.

Abstract Class - a more general class meant to be extended by other more specific subclasses
extending from an abstract class is a "type of" relationship

Interface - an aspect of something that may be made a part of another class
implementing an interface is a "can do" or "can be" relationship

Building b = new Library();

Abstract class examples: Building

    Sub-abstract Classes:

        PublicBuilding
            Library
            CivicCenter
            PoliceDepartment
            FireHouse

        PrivateBuilding
            House
            Tent
            Shed
            Theater
            MobileHome

        CommercialBuilding
            StorageShed
            Warehouse
            Factory
            BicycleRepairShop
            GroceryStore


Interface examples:

    ClimateControlled
        adjustHeating()
        adjustInsulation()

    Portable
        getCurrentLocation()
        setNewLocation()
        secureTransport()
        moveToNewLocation()
        setAllRecordsToNewLocation()

    Accessible
        getNewRequirements()
        inspect()
        adjustBathrooms()
        adjustWalkways()
        adjustDoors()

    Serviceable
        installElectricalWiring()
        installPlumbing()
        connectPower()
        disconnectPower()
        turnOnWater()
        turnOffWater()
        makeUtilityPayment()

    Sellable
        getCurrentOwner()
        getOwnerHistory()
        transferDeedOfOwnership()
        buyerBackgroundCheck()
        deriveFairMarketValue()

    Rentable
        getCurrentRenterInfo()
        getRentalHistory()
        addRentalRecord()
        generateRentalContract()
        setRentalRate()
        setListingRentalStatus()

    Maintainable

    Securable


-- More "Real World" Scenerio

class ServerRequests

  giveMePosts()
  createAPost()
  deleteAPost()


Interface CRUDable {
  create()
  read()
  update()
  delete()
}

CRUDFactory {
  CRUDable c = new MySQLPostsDataAccessObject();
  CRUDable getPostsCrudableObject()
    return c;
}

abstract class DataAccessObject
  connect()
  executeTransaction()
  disconnect()

class MySQLPostsDataAccessObject extends DataAccessObject implements CRUDable

class MongoDBPostsDataAccessObject extends DataAccessObject implements CRUDable

class MariaDBPostsDataAccessObject extends DataAccessObject implements CRUDable