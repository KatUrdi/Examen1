import java.util.ArrayList;
import java.util.List;
public class Interpreter extends SumaYDivision {
    
    private List<SumaYDivision> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String operation) {

        context = new Context(operation.replace(" ", ""));

        for(String subString : operation.split(" ")) {

            switch (subString) {

                case "/":
                    grammar.add(new Division(subString.length()));
                    break;

                case "+":
                    grammar.add(new Suma(subString.length()));
                    break;

                default:
                    grammar.add(new Numero(subString.length()));
                    break;

            }

        }

    }

    public int evaluateOperation() {

        for(SumaYDivision expression: grammar) {

            expression.interpreter(context);

        }

        return context.output;

    }

    @Override
    public void interpreter(Context context) {

    }
}
