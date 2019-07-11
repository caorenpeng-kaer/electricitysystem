package cn.com.kaer.electricisystem.goodsserver.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Data
public class GoodsVO {
    private String goodsId;

    private Integer categoryId;

    private String name;

    private BigDecimal price;

    private Integer stock;

    private String subTitle;

    private String imageUrl;

    private String detail;
}
