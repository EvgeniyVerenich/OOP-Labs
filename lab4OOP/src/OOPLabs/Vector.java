package OOPLabs;

import java.util.Arrays;

public class Vector {

    private int[] realCoordinates;

    public Vector(int[] realCoordinates){
        this.realCoordinates = realCoordinates;
    }

    public int[] getRealCoordinates() {
        return realCoordinates;
    }

    public void setRealCoordinates(int[] realCoordinates) {
        this.realCoordinates = realCoordinates;
    }

    public int[] sum(Vector vector){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] += vector.getRealCoordinates()[i];
        }

        return realCoordinates;

    }

    public int[] difference(Vector vector){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] = realCoordinates[i] - vector.getRealCoordinates()[i];
        }

        return realCoordinates;
    }

    public int[] multiply(Vector vector){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] *= vector.getRealCoordinates()[i];
            System.out.println(realCoordinates[i]);
        }

        return realCoordinates;
    }

    public int[] division(Vector vector){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] = realCoordinates[i]/vector.getRealCoordinates()[i];
            System.out.println(realCoordinates[i]);
        }

        return realCoordinates;

    }

    public int[] lambdaMultiply(int lambda){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] *= lambda;
            System.out.println(realCoordinates[i]);
        }

        return realCoordinates;

    }

    public int[] lambdaDivision(int lambda){
        for (int i = 0; i < realCoordinates.length; i++) {
            realCoordinates[i] /= lambda;
            System.out.println(realCoordinates[i]);
        }

        return realCoordinates;

    }

    public int getIndex(int i){
        return i >= realCoordinates.length? 0 :realCoordinates[i];
    }

}
