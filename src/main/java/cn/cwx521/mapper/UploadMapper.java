package cn.cwx521.mapper;

import cn.cwx521.pojo.Upload;
import cn.cwx521.pojo.UploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadMapper {
    int countByExample(UploadExample example);

    int deleteByExample(UploadExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Upload record);

    int insertSelective(String fileName);

    List<Upload> selectByExample(UploadExample example);

    Upload selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByExample(@Param("record") Upload record, @Param("example") UploadExample example);

    int updateByPrimaryKeySelective(Upload record);

    int updateByPrimaryKey(Upload record);
}