package java/com.zenghao.demo.mbg.mapper;

import java.util.List;
import java/com.zenghao.demo.mbg.model.PmsAlbumPic;
import java/com.zenghao.demo.mbg.model.PmsAlbumPicExample;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumPicMapper {
    int countByExample(PmsAlbumPicExample example);

    int deleteByExample(PmsAlbumPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    List<PmsAlbumPic> selectByExample(PmsAlbumPicExample example);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    int updateByExample(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);
}