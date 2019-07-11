package cn.com.kaer.electricisystem.orderserver.entity;

import cn.com.kaer.electricitysystem.common.entity.UserModel;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Data
public class ShoppingCartDTO extends UserModel {
    private String goodsId;

    private Integer quantity;

    public boolean checkParam() {
        if (StringUtils.isEmpty(goodsId) || null == quantity)
            return false;
        return true;
    }
}
