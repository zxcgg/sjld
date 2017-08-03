package cn.cwx521.service.imp;

import cn.cwx521.mapper.TAddressCityMapper;
import cn.cwx521.mapper.TAddressProvinceMapper;
import cn.cwx521.mapper.TAddressTownMapper;
import cn.cwx521.pojo.TAddressCity;
import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.pojo.TAddressTown;
import cn.cwx521.service.SjldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SjldServiceImpl implements SjldService {
    @Autowired
    private TAddressProvinceMapper tAddressProvinceMapper;
    @Autowired
    private TAddressCityMapper tAddressCityMapper;
    @Autowired
    private TAddressTownMapper tAddressTownMapper;

    @Override
    public List<TAddressProvince> selectProvince() {
        return tAddressProvinceMapper.selectProvince();
    }

    @Override
    public List<TAddressCity> selectCity(String provinceCode) {

        return tAddressCityMapper.selectCity(provinceCode);
    }

    @Override
    public List<TAddressTown> selectTown(String cityCode) {
        return tAddressTownMapper.selectTown(cityCode);
    }


}
