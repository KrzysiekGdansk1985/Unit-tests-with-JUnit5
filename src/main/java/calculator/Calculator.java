package calculator;

public class Calculator {

    public float sum(float a, float b){
        return a + b;
    }

    public float difference(float a, float b){
        return a - b;
    }

    public float product(float a, float b){
        return a * b;
    }

    public void quotient(float a, float b){
        if (b != 0) System.out.println("Iloraz wynosi " + (a / b));
        else System.out.println("Nie można dzielić przez 0.");
    }

}
