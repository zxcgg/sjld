package cn.cwx521.service;

import cn.cwx521.pojo.PageBean1;
import cn.cwx521.pojo.TAddressProvince;

import java.util.List;

public interface TableService {

    PageBean1 selectData(int page, int rows);

    boolean insertData(TAddressProvince tAddressProvince);

    boolean delet(TAddressProvince tAddressProvince);

    boolean deleall(List<String> ids);

    boolean update(TAddressProvince tAddressProvince);

}
