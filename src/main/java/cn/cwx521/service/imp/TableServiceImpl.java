package cn.cwx521.service.imp;

import cn.cwx521.mapper.TAddressProvinceMapper;
import cn.cwx521.pojo.PageBean1;
import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.pojo.TAddressProvinceExample;
import cn.cwx521.service.TableService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TAddressProvinceMapper tAddressProvinceMapper;

    @Override
    public PageBean1 selectData(int page, int rows) {

        PageHelper.startPage(page, rows);
        TAddressProvinceExample tAddressProvinceExample = new TAddressProvinceExample();
        List<TAddressProvince> list = tAddressProvinceMapper.selectByExample(tAddressProvinceExample);
        PageInfo<TAddressProvince> provincePageInfo = new PageInfo<TAddressProvince>(list);
        PageBean1 result = new PageBean1(provincePageInfo.getTotal(), list);
        return result;
    }

    @Override
    public boolean insertData(TAddressProvince tAddressProvince) {
        try {


            if (tAddressProvinceMapper.insertSelective(tAddressProvince) == 1) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public boolean delet(TAddressProvince tAddressProvince) {

        try {
            if (tAddressProvinceMapper.deleteByPrimaryKey(tAddressProvince.getId()) == 1) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    @Override
    public boolean deleall(List<String> ids) {
        try {
            for (String s : ids) {
                tAddressProvinceMapper.deleteByPrimaryKey(Integer.valueOf(s));
            }
            return true;
        } catch (Exception e)

        {
            return false;
        }
    }

    @Override
    public boolean update(TAddressProvince tAddressProvince) {
        try {
            tAddressProvinceMapper.updateByPrimaryKey(tAddressProvince);
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }
}
