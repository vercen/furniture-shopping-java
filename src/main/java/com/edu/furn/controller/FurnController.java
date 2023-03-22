package com.edu.furn.controller;

import com.edu.furn.bean.Furn;
import com.edu.furn.bean.Msg;
import com.edu.furn.service.FurnService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageSerializable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/21 15:28
 */
@Controller
public class FurnController {
    @Resource
    private FurnService furnService;
    @RequestMapping("/save")
    @ResponseBody
    public Msg save(@Validated @RequestBody Furn furn, Errors errors){
        Map<String, Object> stringObjectHashMap = new HashMap<>();
        List<FieldError> fieldErrors = errors.getFieldErrors();
        for (FieldError fieldError : fieldErrors) {
            stringObjectHashMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        if (stringObjectHashMap.isEmpty()){
//            没有错误
            furnService.save(furn);
            Msg success = Msg.success();
            return success;
        }else {
            return Msg.fail().add("error", stringObjectHashMap);
        }

    }

    @RequestMapping("/furns")
    @ResponseBody
    public Msg listFurns(){
        List<Furn> furnList = furnService.findAll();
//        Msg msg = Msg.success();
//        Msg furnList1 = msg.add("furnList", furnList);
        return Msg.success().add("furnList", furnList);
    }

    @RequestMapping("/updata")
    @ResponseBody
    public Msg update(@RequestBody Furn furn){
        furnService.update(furn);
        return Msg.success();
    }

    @DeleteMapping("/del/{id}")
    @ResponseBody
    public Msg del(@PathVariable Integer id){
        furnService.del(id);
        return Msg.success();
    }

//    分页请求

    /**
     *
     * @param pageNum 要显示第几页
     * @param PageSize 每页显示几条记录
     * @return
     */
    @ResponseBody
    @RequestMapping("/furnsByPage")
    public Msg listFurnsByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "5") Integer PageSize,
                               @RequestParam(defaultValue = "") String name){
        PageHelper.startPage(pageNum, PageSize);
        List<Furn> furnList = furnService.findByCondition(name);
        PageInfo pageInfo = new PageInfo(furnList, PageSize);
        return Msg.success().add("pageInfo", pageInfo);
    }

}
