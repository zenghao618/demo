package java/com.zenghao.demo.mbg.mapper;

import java.util.List;
import java/com.zenghao.demo.mbg.model.PmsMemberPrice;
import java/com.zenghao.demo.mbg.model.PmsMemberPriceExample;
import org.apache.ibatis.annotations.Param;

public interface PmsMemberPriceMapper {
    int countByExample(PmsMemberPriceExample example);

    int deleteByExample(PmsMemberPriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsMemberPrice record);

    int insertSelective(PmsMemberPrice record);

    List<PmsMemberPrice> selectByExample(PmsMemberPriceExample example);

    PmsMemberPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    int updateByExample(@Param("record") PmsMemberPrice record, @Param("example") PmsMemberPriceExample example);

    int updateByPrimaryKeySelective(PmsMemberPrice record);

    int updateByPrimaryKey(PmsMemberPrice record);
}