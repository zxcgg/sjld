package cn.cwx521.service;

import cn.cwx521.pojo.TAddressCity;
import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.pojo.TAddressTown;
import org.apache.ibatis.annotations.One;

import java.util.List;

public interface SjldService {
    List<TAddressProvince> selectProvince();

    List<TAddressCity> selectCity(String provinceCode);

    List<TAddressTown> selectTown(String cityCode);
}
