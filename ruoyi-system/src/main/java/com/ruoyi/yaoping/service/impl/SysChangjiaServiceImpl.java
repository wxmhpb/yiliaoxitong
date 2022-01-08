package com.ruoyi.yaoping.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yaoping.mapper.SysChangjiaMapper;
import com.ruoyi.yaoping.domain.SysChangjia;
import com.ruoyi.yaoping.service.ISysChangjiaService;

/**
 * 厂家信息管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-02
 */
@Service
public class SysChangjiaServiceImpl implements ISysChangjiaService 
{
    @Autowired
    private SysChangjiaMapper sysChangjiaMapper;

    /**
     * 查询厂家信息管理
     * 
     * @param id 厂家信息管理主键
     * @return 厂家信息管理
     */
    @Override
    public SysChangjia selectSysChangjiaById(Long id)
    {
        return sysChangjiaMapper.selectSysChangjiaById(id);
    }

    /**
     * 查询厂家信息管理列表
     * 
     * @param sysChangjia 厂家信息管理
     * @return 厂家信息管理
     */
    @Override
    public List<SysChangjia> selectSysChangjiaList(SysChangjia sysChangjia)
    {
        return sysChangjiaMapper.selectSysChangjiaList(sysChangjia);
    }

    /**
     * 新增厂家信息管理
     * 
     * @param sysChangjia 厂家信息管理
     * @return 结果
     */
    @Override
    public int insertSysChangjia(SysChangjia sysChangjia)
    {
        sysChangjia.setCreateTime(DateUtils.getNowDate());
        return sysChangjiaMapper.insertSysChangjia(sysChangjia);
    }

    /**
     * 修改厂家信息管理
     * 
     * @param sysChangjia 厂家信息管理
     * @return 结果
     */
    @Override
    public int updateSysChangjia(SysChangjia sysChangjia)
    {
        return sysChangjiaMapper.updateSysChangjia(sysChangjia);
    }

    /**
     * 批量删除厂家信息管理
     * 
     * @param ids 需要删除的厂家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysChangjiaByIds(Long[] ids)
    {
        return sysChangjiaMapper.deleteSysChangjiaByIds(ids);
    }

    /**
     * 删除厂家信息管理信息
     * 
     * @param id 厂家信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysChangjiaById(Long id)
    {
        return sysChangjiaMapper.deleteSysChangjiaById(id);
    }
}
