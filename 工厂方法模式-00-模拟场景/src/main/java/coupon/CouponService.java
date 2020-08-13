package coupon;

/**
 * @Description: 模拟优惠券服务
 * @Author qiangxuelixing
 * @Date 2020/8/13 21:39
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "， " + couponNumber + ", " + uuid);
        return new CouponResult("001", "发放成功");
    }
}
