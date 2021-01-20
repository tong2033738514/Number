import javax.imageio.stream.ImageOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TestUtil {

    public static void main(String[] args) throws ParseException {
        Random random =new Random();
        for(int i = 0;i <4;i++){
            // random.nextInt(10)意思是返回大于等于0，小于10的一个正整数，要想生成多少位的随机数，只需要修改参数值即可。
            System.out.println(random.nextInt(10));
        }

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年mm月dd日");
        String time = "2021年01月03日";
        //把String类型转换成date类型
        Date date1 =simpleDateFormat.parse(time);
        System.out.println(date1);
        //把date类型转成String
        String str = simpleDateFormat.format(date1);
        System.out.println(str);

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        c.add(Calendar.YEAR,1);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int sec = c.get(Calendar.SECOND);
        int w = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+" "+ month + " "+day+" "+ hour+" "+min+ " "+sec+ " "+ w);


    }


}
