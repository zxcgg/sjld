package cn.cwx521.mapper;

import cn.cwx521.pojo.TAddressCity;
import cn.cwx521.pojo.TAddressCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAddressCityMapper {
    int countByExample(TAddressCityExample example);

    int deleteByExample(TAddressCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAddressCity record);

    int insertSelective(TAddressCity record);

    List<TAddressCity> selectByExample(TAddressCityExample example);

    TAddressCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAddressCity record, @Param("example") TAddressCityExample example);

    int updateByExample(@Param("record") TAddressCity record, @Param("example") TAddressCityExample example);

    int updateByPrimaryKeySelective(TAddressCity record);

    int updateByPrimaryKey(TAddressCity record);

    List<TAddressCity> selectCity(String provinceCode);
}