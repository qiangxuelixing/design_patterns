package goods;

/**
 * @Description: 模拟实物商品服务
 * @Author qiangxuelixing
 * @Date 2020/8/13 22:00
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + req.toString());
        return true;
    }
}
