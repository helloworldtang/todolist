package com.lpp.web;

import com.alibaba.fastjson.JSON;
import com.lpp.vo.GeoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Created by tangcheng on 6/12/2017.
 */
@Controller
@RequestMapping("map")
public class EChartsController {

    @GetMapping("echartsMapDemo.html")
    public String echartsMapDemo() {
        return "echartsMapDemo";
    }

    @RequestMapping("myData.json")
    @ResponseBody
    public String getMyData() {
//        [
//        {name: '海门', value: [121.15, 31.89, 90]},
//        {name: '鄂尔多斯', value: [109.781327, 39.608266, 120]},
//        {name: '招远', value: [120.38, 37.35, 142]},
//        {name: '舟山', value: [122.207216, 29.985295, 123]},
//    ]
        List<GeoVO> voList = new ArrayList<>();

        GeoVO geoVO = new GeoVO();
        geoVO.setName("海门");
        geoVO.setValue(newArrayList("121.15", "31.89", "90"));
        voList.add(geoVO);

        geoVO = new GeoVO();
        geoVO.setName("鄂尔多斯");
        geoVO.setValue(newArrayList("109.781327", "39.608266", "120"));
        voList.add(geoVO);

        geoVO = new GeoVO();
        geoVO.setName("招远");
        geoVO.setValue(newArrayList("120.38", "29.985295", "142"));
        voList.add(geoVO);

        geoVO = new GeoVO();
        geoVO.setName("舟山");
        geoVO.setValue(newArrayList("122.207216", "37.35", "123"));
        voList.add(geoVO);

        return JSON.toJSONString(voList);
    }

}
