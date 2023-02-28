package examenpatronesdiseno2023.interpreter;
public class Suma extends SumaYDivision {
    public Suma(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("+")) {

            context.operation = "suma";
            context.input = context.input.substring(this.digit);

        }


    }
}
