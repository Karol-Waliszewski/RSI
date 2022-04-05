package main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("You have to enter RMI object address in the form: //host_address/service_name");
            return;
        }

        try{
            Registry reg = LocateRegistry.createRegistry(1099);
        }catch(RemoteException e){
            e.printStackTrace();
            return;
        }

//        System.setProperty("java.security.policy","./../bin/srv.policy");
//        System.out.println(System.getProperty("java.security.policy"));

//        if(System.getSecurityManager() == null){
//            System.setSecurityManager(new SecurityManager());
//        }

        try {
            CalcObjectImplementation implementation = new CalcObjectImplementation();
            CalcObjectImplementation2 implementation2 = new CalcObjectImplementation2();
            java.rmi.Naming.rebind(args[0], implementation);
            java.rmi.Naming.rebind(args[1], implementation2);
            System.out.println("Server is registered now...");
        }catch (Exception e)  {
            System.out.println("Server can't be registered...");
            e.printStackTrace();
        }
    }
}
