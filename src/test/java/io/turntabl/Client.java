package io.turntabl;

public class Client {
 private String name;
 private int id;
 private ServiceLevel serviceLevel;
 private TypeOfClient typeOfClient;

    public Client(String name, int id, ServiceLevel serviceLevel, TypeOfClient typeOfClient) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
        this.typeOfClient = typeOfClient;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }
}
