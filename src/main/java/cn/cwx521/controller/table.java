package cn.cwx521.controller;

import cn.cwx521.pojo.PageBean1;
import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "t")
public class table {
    @Autowired
    private TableService tableService;


    @RequestMapping(value = "table", method = RequestMethod.GET)
    @ResponseBody

    public PageBean1 table(int page, int rows) {
        return tableService.selectData(page, rows);
    }

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    @ResponseBody
    public String insert(TAddressProvince tAddressProvince) {
        if (tableService.insertData(tAddressProvince)) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "delet", method = RequestMethod.GET)
    @ResponseBody
    public String delet(TAddressProvince tAddressProvince) {

        if (tableService.delet(tAddressProvince)) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "deleall", method = RequestMethod.POST)
    @ResponseBody
    public String deleall(@RequestParam(value = "ids[]") List<String> ids) {
        if (tableService.deleall(ids)) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    @ResponseBody
    public String update(TAddressProvince tAddressProvince) {
        if (tableService.update(tAddressProvince)) {
            return "success";
        }
        return "fail";
    }
}
