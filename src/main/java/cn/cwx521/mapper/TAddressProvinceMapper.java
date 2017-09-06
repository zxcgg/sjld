package cn.cwx521.mapper;

import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.pojo.TAddressProvinceExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TAddressProvinceMapper {
    int countByExample(TAddressProvinceExample example);

    int deleteByExample(TAddressProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAddressProvince record);

    int insertSelective(TAddressProvince record);

    List<TAddressProvince> selectByExample(TAddressProvinceExample example);

    TAddressProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAddressProvince record, @Param("example") TAddressProvinceExample example);

    int updateByExample(@Param("record") TAddressProvince record, @Param("example") TAddressProvinceExample example);

    int updateByPrimaryKeySelective(TAddressProvince record);

    int updateByPrimaryKey(TAddressProvince record);

    List<TAddressProvince> selectProvince();

}