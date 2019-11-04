package io

import io.turntabl.Client
import io.turntabl.ServiceLevel
import io.turntabl.TypeOfClient

class RegisterTest extends Client {
    RegisterTest(String name, int id, ServiceLevel serviceLevel, TypeOfClient typeOfClient) {
        super(name, id, serviceLevel, typeOfClient)
    }

    void testGetClients() {
    }
}
