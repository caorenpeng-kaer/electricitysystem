package cn.com.kaer.electricisystem.orderserver.entity.client;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Data
public class GoodsEntity {
    private String goodsId;

    private Integer categoryId;

    private String name;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private String subTitle;

    private String imageUrl;

    private String detail;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
