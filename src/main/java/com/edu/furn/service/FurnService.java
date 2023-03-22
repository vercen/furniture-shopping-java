package com.edu.furn.service;

import com.edu.furn.bean.Furn;

import java.util.List;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/21 14:07
 */
public interface FurnService {
//    添加
    public void save(Furn furn);
//返回全部
    public List<Furn> findAll();
//更新
    public void update(Furn furn);

    //删除
    public void del(Integer id);

    //查询
    public List<Furn> findByCondition(String name);


}
