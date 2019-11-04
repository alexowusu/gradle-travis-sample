package io.turntabl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Register {
 public List<Client> clients = Arrays.asList(
      new Client("kofi",123,ServiceLevel.GOLD,TypeOfClient.PRIVATE),
         new Client("ama",234,ServiceLevel.PLATINUM,TypeOfClient.COOPERATE),
         new Client("voltic",345,ServiceLevel.PREMIUM,TypeOfClient.COOPERATE)
 );
 long name = clients.stream().filter(client -> client.getTypeOfClient()==TypeOfClient.COOPERATE).count();


}

