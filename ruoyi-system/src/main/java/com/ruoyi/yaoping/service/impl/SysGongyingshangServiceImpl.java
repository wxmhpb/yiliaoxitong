package com.ruoyi.yaoping.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.yaoping.domain.SysGongyingshang;
import com.ruoyi.yaoping.mapper.SysGongyingshangMapper;
import com.ruoyi.yaoping.service.ISysGongyingshangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 供应商信息管理Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-02
 */
@Service
public class SysGongyingshangServiceImpl implements ISysGongyingshangService
{
    @Autowired
    private SysGongyingshangMapper sysGongyingshangMapper;

    /**
     * 查询供应商信息管理
     *
     * @param id 供应商信息管理主键
     * @return 供应商信息管理
     */
    @Override
    public SysGongyingshang selectSysGongyingshangById(Long id)
    {
        return sysGongyingshangMapper.selectSysGongyingshangById(id);
    }

    /**
     * 查询供应商信息管理列表
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 供应商信息管理
     */
    @Override
    public List<SysGongyingshang> selectSysGongyingshangList(SysGongyingshang sysGongyingshang)
    {
        return sysGongyingshangMapper.selectSysGongyingshangList(sysGongyingshang);
    }

    /**
     * 新增供应商信息管理
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 结果
     */
    @Override
    public int insertSysGongyingshang(SysGongyingshang sysGongyingshang)
    {
        sysGongyingshang.setCreateTime(DateUtils.getNowDate());
        return sysGongyingshangMapper.insertSysGongyingshang(sysGongyingshang);
    }

    /**
     * 修改供应商信息管理
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 结果
     */
    @Override
    public int updateSysGongyingshang(SysGongyingshang sysGongyingshang)
    {
        return sysGongyingshangMapper.updateSysGongyingshang(sysGongyingshang);
    }

    /**
     * 批量删除供应商信息管理
     *
     * @param ids 需要删除的供应商信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysGongyingshangByIds(Long[] ids)
    {
        return sysGongyingshangMapper.deleteSysGongyingshangByIds(ids);
    }

    /**
     * 删除供应商信息管理信息
     *
     * @param id 供应商信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysGongyingshangById(Long id)
    {
        return sysGongyingshangMapper.deleteSysGongyingshangById(id);
    }
}
