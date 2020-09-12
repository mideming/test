import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    /**
     * 获取数值二进制位置为1的数值列表(最多取8个数值)
     * @param num
     * @return
     */
    public static List<Integer> getBinaryIntegerList(Integer num){
        if (null == num || num <= 0) {
            return null;
        }
        int i = 0;
        //最大支持数值个数
        int maxNum = 8;
        List<Integer> resultList = new ArrayList<>();
        while (num > 0 && i < maxNum) {
            if ((num & 1) == 1) {
                resultList.add(1 << i);
            }
            num = num >>> 1;
            i++;
        }
        return resultList;
    }

    /**
     * 根据二进制数值列表获取对应的数字
     * @param numbers
     * @return
     */
    public static Integer binaryConvertInteger(List<Integer> numbers) {
        int num = 0;
        if (CollectionUtils.isNotEmpty(numbers)) {
            for (Integer number : numbers) {
                num += number;
            }
        }
        return num;
    }
}
