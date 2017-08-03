package cn.cwx521.mapper;

import cn.cwx521.pojo.TAddressTown;
import cn.cwx521.pojo.TAddressTownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAddressTownMapper {
    int countByExample(TAddressTownExample example);

    int deleteByExample(TAddressTownExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAddressTown record);

    int insertSelective(TAddressTown record);

    List<TAddressTown> selectByExample(TAddressTownExample example);

    TAddressTown selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAddressTown record, @Param("example") TAddressTownExample example);

    int updateByExample(@Param("record") TAddressTown record, @Param("example") TAddressTownExample example);

    int updateByPrimaryKeySelective(TAddressTown record);

    int updateByPrimaryKey(TAddressTown record);

    List<TAddressTown> selectTown(String cityCode);
}