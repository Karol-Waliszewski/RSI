package main;

public class Main {

    public static void client1(String address){
        double result;
        CalcObject calcObject;

        try {
            calcObject = (CalcObject) java.rmi.Naming.lookup(address);
        }catch(Exception e){
            System.out.println("Nie można pobrać referencji do " + address);
            e.printStackTrace();
            return;
        }

        try {
            result = calcObject.calculate(1.1,2.2);
        } catch(Exception e){
            System.out.println("Błąd zdalnego wywołania");
            e.printStackTrace();
            return;
        }

        System.out.println("Wynik " + result);
    }

    public static void client2(String address){
        ResultType result;
        InputType params;
        CalcObject2 calcObject;

        try {
            calcObject = (CalcObject2) java.rmi.Naming.lookup(address);
        }catch(Exception e){
            System.out.println("Nie można pobrać referencji do " + address);
            e.printStackTrace();
            return;
        }

        try {
            params = new InputType();
            params.x1 = 1.1;
            params.x2 = 2.2;
            params.operation = "add";
            result = calcObject.calculate(params);
        } catch(Exception e){
            System.out.println("Błąd zdalnego wywołania");
            e.printStackTrace();
            return;
        }

        System.out.println("Wynik " + result.result + ", opis " + result.description);
    }

    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("You have to enter RMI object address in the form: //host_address/service_name");
            return;
        }

        client1(args[0]);
        client2(args[1]);

    }
}
