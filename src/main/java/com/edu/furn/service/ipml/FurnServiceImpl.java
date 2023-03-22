package com.edu.furn.service.ipml;

import com.edu.furn.bean.Furn;
import com.edu.furn.bean.FurnExample;
import com.edu.furn.dao.FurnMapper;
import com.edu.furn.service.FurnService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author vercen
 * @version 1.0
 * @date 2023/3/21 14:08
 */
@Service
public class FurnServiceImpl implements FurnService {

    @Resource
    private FurnMapper furnMapper;
    @Override
    public void save(Furn furn) {
        furnMapper.insertSelective(furn);
    }

    @Override
    public List<Furn> findAll() {
        List<Furn> furns = furnMapper.selectByExample(null);
        return furns;
    }

    @Override
    public void update(Furn furn) {
        furnMapper.updateByPrimaryKeySelective(furn);
    }

    @Override
    public void del(Integer id) {
        furnMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Furn> findByCondition(String name) {
        FurnExample furnExample = new FurnExample();
        FurnExample.Criteria criteria = furnExample.createCriteria();
        if (StringUtils.hasText(name)){
            criteria.andNameLike("%" + name+"%");
        }
        List<Furn> furnList = furnMapper.selectByExample(furnExample);
        return furnList;
    }
}
