public class Division extends SumaYDivision {
    public Division(int digit){

        this.digit = digit;

    }


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("/")) {

            context.operation = "division";
            context.input = context.input.substring(this.digit);

        }


    }
}
