
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        String rpmExpression = "15,7,11,-,-";
        expectedResult = 19;
        actualResult = rpc.calculate(rpmExpression);
        checkResult(rpmExpression, expectedResult, actualResult);

        rpmExpression = "15,7,11,*,*";
        expectedResult = 1155;
        actualResult = rpc.calculate(rpmExpression);
        checkResult(rpmExpression, expectedResult, actualResult);

        rpmExpression = "14,8,1,-,/";
        expectedResult = 2;
        actualResult = rpc.calculate(rpmExpression);
        checkResult(rpmExpression, expectedResult, actualResult);

        rpmExpression = "134,8,1,-,/";
        expectedResult = 24;
        actualResult = rpc.calculate(rpmExpression);
        checkResult(rpmExpression, expectedResult, actualResult);

        rpnExpression = "5,1,2,+,4,*,+,3,-";
        expectedResult = 14.0;
        actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
