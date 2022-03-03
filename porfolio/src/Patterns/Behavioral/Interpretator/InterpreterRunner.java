package Patterns.Interpretator;

import java.util.jar.JarEntry;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: "+isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: "+isJavaEEDeveloper.interpret("JavaScript"));
    }
    public static  Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java core");

        return new OrExpression(java, javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javascript = new TerminalExpression("JavaScript");

        return new AndExpression(java,javascript);
    }
}
