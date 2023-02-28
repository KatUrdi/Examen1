public class Numero extends SumaYDivision{
    public Numero(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.operation.equals("fraccion")) {

            context.output = Integer.parseInt(context.input.substring(0, this.digit));


        } else if(context.operation.equals("division")) {

            context.output = context.output / Integer.parseInt(context.input.substring(0, this.digit));

        } else{

            context.output = context.output + Integer.parseInt(context.input.substring(0, this.digit));

        }

        context.input = context.input.substring(this.digit);


    }
}
