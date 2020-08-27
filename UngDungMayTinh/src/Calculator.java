public class Calculator {
    public static double calculate(String operand,int a,int b){
        if(operand.equals("+")){
            return a+b;
        }
        if(operand.equals("-")){
            return a-b;
        }
        if(operand.equals("*")){
            return a*b;
        }
        if(operand.equals("/")){
            return a/b;
        }
        else
            return 0.0;
    }
}
