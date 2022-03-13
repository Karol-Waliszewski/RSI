package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcObjectImplementation2 extends UnicastRemoteObject implements CalcObject2 {
    private static final long serialVersionUID = 101L;

    public CalcObjectImplementation2() throws RemoteException {
        super();
    }

    @Override
    public ResultType calculate(InputType params) throws RemoteException {
        double x1, x2;
        ResultType result = new ResultType();

        x1 = params.getX1();
        x2 = params.getX2();
        result.description = "Operacja: " + params.operation;

        switch (params.operation) {
            case "add":
                result.result = x1 + x2;
                break;
            case "sub":
                result.result = x1 - x2;
                break;
            default:
                result.result = 0;
                result.description = "Podano złą operację";
        }

        return result;
    }
}
