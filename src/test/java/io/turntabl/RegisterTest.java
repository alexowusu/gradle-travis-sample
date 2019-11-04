package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void fh() {
        List<Client> clients = Arrays.asList(
                new Client("kofi",123,ServiceLevel.GOLD,TypeOfClient.PRIVATE),
                new Client("ama",234,ServiceLevel.PLATINUM,TypeOfClient.COOPERATE),
                new Client("voltic",345,ServiceLevel.PREMIUM,TypeOfClient.COOPERATE)
        );
        Register register1 = new Register(clients);
        Long value = register1.fh();
        System.out.println(value);
    }
}