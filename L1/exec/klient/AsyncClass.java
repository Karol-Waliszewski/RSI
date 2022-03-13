package klient;

import org.apache.xmlrpc.AsyncCallback;

import java.net.URL;

public class AsyncClass implements AsyncCallback {
    @Override
    public void handleResult(Object rezultat, URL url, String metoda) {
        System.out.printf("Wynik operacji asynchronicznej(%s) w %s: %s", metoda, url.toString(), rezultat.toString());
    }

    @Override
    public void handleError(Exception rezultat, URL url, String metoda) {
        System.out.printf("Blad operacji asynchronicznej(%s) w %s: %s", metoda, url.toString(), rezultat.toString());
    }
}
