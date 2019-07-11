package cn.com.kaer.electricisystem.goodsserver.dao;

import cn.com.kaer.electricisystem.goodsserver.vo.GoodsVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Repository
public interface GoodsMapper {
    List<GoodsVO> getGoodsByCategoryId(Integer categoryId);
}
