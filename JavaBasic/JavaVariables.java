package JavaBasic;

/*
 * Variables act as a container for storing data
 * 
 *  BASIC SYNTAX:
 *  varType varName = Value;
 */


public class JavaVariables {
    public static void main(String[] args) {
        String name ="John"; // Name is a variable in this statement.
        int c = 10 + 20; // Here 10+20 acts as an expression.
        System.out.println(name);
        System.out.println(c);
        int num;
        num = 20; // this is another way for assigning value to a variable.
        System.out.println(num);

        final int num2 = 10; // final keyword doesn't allow the variable to be overridden.
       // num2= 20; // this line will throw an error.
/*[{
	"resource": "/d:/JavaRepo/All-About-Java/JavaBasic/JavaVariables.java",
	"owner": "_generated_diagnostic_collection_name_#2",
	"code": "536870970",
	"severity": 8,
	"message": "The final local variable num2 cannot be assigned. It must be blank and not using a compound assignment",
	"source": "Java",
	"startLineNumber": 21,
	"startColumn": 9,
	"endLineNumber": 21,
	"endColumn": 13
}] */
        System.out.println(num2);

    }
}
