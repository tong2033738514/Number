import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStringTransUtil {
    //将字符串类型以逗号分隔开，去掉前后空格，以列表的形式打印输出
    private static List<Integer> getIntegerList(String str) {
        List<Integer> ns = Arrays.asList(str.split(","))
                .stream()
                .map(s1 -> Integer.parseInt(s1.trim()))
                .collect(Collectors.toList());
        return ns;

    }

    public static Object isEmpty(Object param){
        return param==null?"":param;
    }

    public static void main(String[] args) {
        String s = "1,2,2,3,4,5";
        List<Integer> integerList = TestStringTransUtil.getIntegerList(s);
        for(Integer integer:integerList){
            System.out.println(integer);
        }
    }


}
