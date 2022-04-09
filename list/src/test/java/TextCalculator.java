import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class TextCalculator {
    @Test
    public  void testFindWordsTharHasA(){
        List<String> input= Arrays.asList("dog","cats","bird","Ass");
        TextCalculatorMain calculator=new TextCalculatorMain();

        List<String> result= calculator.findWordsTharHasA(input);

        List<String> expected= Arrays.asList("cats","Ass");
        Assert.assertEquals(expected,result);
    }
    @Test
    public  void notFindWordsTharHasA(){
        List<String> input= Arrays.asList("dog","cats","bird","Ass");
        TextCalculatorMain calculator=new TextCalculatorMain();

        List<String> result= calculator.findWordsTharHasA(input);

        List<String> expected= Arrays.asList("dog");
        Assert.assertNotEquals(expected,result);
    }

    @Test
    public  void testWordsThatStartsWithCapital(){
        List<String> input= Arrays.asList("dog","cats","bird","Ass");
        TextCalculatorMain calculator=new TextCalculatorMain();
        List<String> result= calculator.findWordsThatStartsWithCapital(input);
        List<String> expected= Arrays.asList("Ass");
        Assert.assertEquals(expected,result);
    }

    @Test
    public  void notWordsThatStartsWithCapital(){
        List<String> input= Arrays.asList("dog","cats","bird","Ass");
        TextCalculatorMain calculator=new TextCalculatorMain();
        List<String> result= calculator.findWordsThatStartsWithCapital(input);
        List<String> expected= Arrays.asList("cats");
        Assert.assertNotEquals(expected,result);
    }
    @Test
    public  void testNumbersThatTGreaterThanX(){
        List<Integer> input= Arrays.asList(5,6,4,3,2);
        TextCalculatorMain calculator=new TextCalculatorMain();
        List<Integer> result= calculator.findNumbersThatTGreaterThanX(input,4);
        List<Integer> expected= Arrays.asList(5,6);
        Assert.assertEquals(expected,result);
    }

    @Test
    public  void notNumbersThatTGreaterThanX(){
        List<Integer> input= Arrays.asList(5,6,4,3,2);
        TextCalculatorMain calculator=new TextCalculatorMain();
        List<Integer> result= calculator.findNumbersThatTGreaterThanX(input,4);
        List<Integer> expected= Arrays.asList(3);
        Assert.assertNotEquals(expected,result);
    }

}
