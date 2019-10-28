package java/com.zenghao.demo.mbg.mapper;

import java.util.List;
import java/com.zenghao.demo.mbg.model.PmsAlbum;
import java/com.zenghao.demo.mbg.model.PmsAlbumExample;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumMapper {
    int countByExample(PmsAlbumExample example);

    int deleteByExample(PmsAlbumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    List<PmsAlbum> selectByExample(PmsAlbumExample example);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    int updateByExample(@Param("record") PmsAlbum record, @Param("example") PmsAlbumExample example);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);
}