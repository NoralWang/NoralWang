import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TextCalculatorMain textCalculatorMain=new TextCalculatorMain();
        List<String> input= Arrays.asList("dog","cats","bird","Ass","Cool");
        List<String> result=textCalculatorMain.findWordsTharHasA(input);
        System.out.println(result);
        List<String> resultword=textCalculatorMain.findWordsThatStartsWithCapital(input);
        System.out.println(resultword);
        List<Integer> inputnumber= Arrays.asList(5,6,4,3,2);
        List<Integer> resultnumber=textCalculatorMain.findNumbersThatTGreaterThanX(inputnumber,4);
        System.out.println(resultnumber);
    }
}
