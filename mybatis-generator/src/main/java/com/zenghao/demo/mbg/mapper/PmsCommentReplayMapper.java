package java/com.zenghao.demo.mbg.mapper;

import java.util.List;
import java/com.zenghao.demo.mbg.model.PmsCommentReplay;
import java/com.zenghao.demo.mbg.model.PmsCommentReplayExample;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentReplayMapper {
    int countByExample(PmsCommentReplayExample example);

    int deleteByExample(PmsCommentReplayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReplay record);

    int insertSelective(PmsCommentReplay record);

    List<PmsCommentReplay> selectByExample(PmsCommentReplayExample example);

    PmsCommentReplay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    int updateByExample(@Param("record") PmsCommentReplay record, @Param("example") PmsCommentReplayExample example);

    int updateByPrimaryKeySelective(PmsCommentReplay record);

    int updateByPrimaryKey(PmsCommentReplay record);
}