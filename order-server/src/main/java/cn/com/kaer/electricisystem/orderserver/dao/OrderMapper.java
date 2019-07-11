package cn.com.kaer.electricisystem.orderserver.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Repository
public interface OrderMapper {
    int insertOrderInfo();

    int insertOrderItemInfo();

}
