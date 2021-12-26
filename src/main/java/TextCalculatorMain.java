import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextCalculatorMain {
    public  List<String> findWordsTharHasA(List<String>text){
        
        return text.stream().filter(x->x.contains("a")||x.contains("A")).collect(Collectors.toList());
    }
    public List<String> findWordsThatStartsWithCapital(List<String>text){
         return text.stream().filter(x->x.matches("^[A-Z][a-z]+$") ).collect(Collectors.toList());
    }

    public List<Integer> findNumbersThatTGreaterThanX(List<Integer>numbers,int x){
        return numbers.stream().filter(A->A>x ).collect(Collectors.toList());
    }

}
