package serwer;

import org.apache.xmlrpc.WebServer;

public class serwerRPC2 {
    public int asyncFahrenheitToCelcius(int x, boolean reverse) {
        System.out.println("Wywołanie asychroniczne - odliczam");
        try {
            Thread.sleep(2000);
        }catch(InterruptedException exception){
            exception.printStackTrace();
            Thread.currentThread().interrupt();
        }
        System.out.println("Wywołanie asychroniczne - koniec odliczania");
        return !reverse ? (x - 32) * 5/9 : x * 9/5 + 32;
    }
    public String echoPerson(String name, int age, double height) {
        return name + " ma " + age + " lat i " + height + "cm wzrostu.";
    }
    public String show() {
        return "Show: \n" +
                "echoPerson(String imie, int wiek, double wzrost): Wypisuje informacje o osobie \n" +
                "asyncFahrenheitToCelcius(int temp, boolean naOdwrot): Konweruje temperature z C na F lub na odwrot\n";
    }
    public static void main(String[] args) {
        try{
            System.out.println("Startuje serwer XML-RPC...");
            int port = 4050;
            WebServer server = new WebServer(port);
            server.addHandler("MojSerwer2", new serwerRPC2());
            server.start();
            System.out.println("Serwer wystartowal pomyslnie");
            System.out.println("Nasluchuje na porcie: " + port);
            System.out.println("Aby zatrzymać nacisnij ctrl+c");
        }catch(Exception exception){
            System.err.println("Serwer XML-RPC: " + exception);
        }
    }
}
