package org.qxlx.card;

/**
 * @Description: 模拟爱奇艺会员卡服务
 * @Author qiangxuelixing
 * @Date 2020/8/13 21:32
 */
public class IQiYiCard {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张: " + bindMobileNumber + ", " + cardId);
    }
}
