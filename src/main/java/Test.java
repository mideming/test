import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        TreeSet<Long> treeSet = new TreeSet<>();
        Set<Long> acceptGoodsIds1 = new HashSet<>();
        Set<Long> acceptGoodsIds2 = new HashSet<>();
        List<Long> goodsId = Arrays.asList(123L,1234L,3456L,5678L,6789L,7890L,8900L,223L,2234L,2456L,2678L,2789L,2890L,2900L);
        for (long i = 0; i < 10000; i++) {
            list.add(i);
            treeSet.add(i);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (Long aLong : goodsId) {
            if(list.contains(aLong)) {
                acceptGoodsIds1.add(aLong);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime);
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        for (Long aLong : goodsId) {
            if(treeSet.contains(aLong)) {
                acceptGoodsIds2.add(aLong);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime);
    }
}
