package cn.cwx521.controller;

import cn.cwx521.pojo.TAddressCity;
import cn.cwx521.pojo.TAddressProvince;
import cn.cwx521.pojo.TAddressTown;
import cn.cwx521.service.SjldService;
import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.One;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class sjld {

    @Autowired
    private SjldService sjldService;

    @RequestMapping(value = "province", method = RequestMethod.GET)
    @ResponseBody
    public void one(HttpServletResponse response) throws IOException {
        List<TAddressProvince> list = sjldService.selectProvince();
        //查询之后转为json
        JSONArray jsonArray = JSONArray.fromObject(list);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonArray.toString());
        response.getWriter().flush();
        response.getWriter().close();
    }

    @RequestMapping(value = "city", method = RequestMethod.GET)
    @ResponseBody
    public void two(HttpServletResponse response, String provinceCode) throws IOException {
        List<TAddressCity> list = sjldService.selectCity(provinceCode);
        //查询之后转为json
        JSONArray jsonArray = JSONArray.fromObject(list);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonArray.toString());
        response.getWriter().flush();
        response.getWriter().close();
    }
    @RequestMapping(value = "town", method = RequestMethod.GET)
    @ResponseBody
    public void three(HttpServletResponse response, String cityCode) throws IOException {
        List<TAddressTown> list = sjldService.selectTown(cityCode);
        //查询之后转为json
        JSONArray jsonArray = JSONArray.fromObject(list);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jsonArray.toString());
        response.getWriter().flush();
        response.getWriter().close();
    }
}
