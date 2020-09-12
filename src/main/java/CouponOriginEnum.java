import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ description：优惠券分组
 * @ author     ：吴浩 <hao.wu02@weimob.com>
 * @ date       ：2020/7/31 16:56
 */
@AllArgsConstructor
@Getter
public enum CouponOriginEnum {

    WEIMOB_COUPON(0b0001, "微盟SaaS券"),
    WECHAT_MERCHANT_COUPON(0b0010, "微信商家券"),
    WECHAT_MERCHANT_COUPON1(0b0100, "微信商家券"),
    ;

    /**
     * 二进制数字每一位代表一种分组，int类型最多支持32位
     * eg:
     * 001：微盟券
     * 010：微信商家券
     * 011：微盟券 + 微信商家券
     */
    private final Integer type;

    /**
     * 描述
     */
    private final String desc;

    private static final Map<Integer, CouponOriginEnum> ORIGIN_MAP = new HashMap<>();

    static {
        for (CouponOriginEnum type : values()) {
            ORIGIN_MAP.put(type.getType(), type);
        }
    }

    public static Integer transform(List<Integer> couponOriginList) {
        int couponOrigin = 0;
        if (CollectionUtils.isNotEmpty(couponOriginList)) {
            for (Integer key : couponOriginList) {
                if (ORIGIN_MAP.containsKey(key)) {
                    couponOrigin += key;
                }
            }
        }
        return couponOrigin;
    }

    public static List<Integer> resolve(Integer couponOrigin) {
        if (null == couponOrigin || couponOrigin <= 0) {
            return Collections.emptyList();
        }
        int i = 0;
        List<Integer> resultList = new ArrayList<>();
        while (couponOrigin > 0) {
            int i1 = couponOrigin & 1;
            if (i1 == 1) {
                int i2 = 1 << i;
                CouponOriginEnum couponOriginEnum = ORIGIN_MAP.get(i2);
                if (couponOriginEnum != null) {
                    resultList.add(couponOriginEnum.getType());
                }
            }
            couponOrigin = couponOrigin >> 1;
            i++;
        }
        return resultList;
    }

}
