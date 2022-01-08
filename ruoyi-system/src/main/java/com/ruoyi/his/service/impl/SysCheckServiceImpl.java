package com.ruoyi.his.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.his.mapper.SysCheckMapper;
import com.ruoyi.his.domain.SysCheck;
import com.ruoyi.his.service.ISysCheckService;

/**
 * 检查费用设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-01-01
 */
@Service
public class SysCheckServiceImpl implements ISysCheckService 
{
    @Autowired
    private SysCheckMapper sysCheckMapper;

    /**
     * 查询检查费用设置
     * 
     * @param id 检查费用设置主键
     * @return 检查费用设置
     */
    @Override
    public SysCheck selectSysCheckById(Long id)
    {
        return sysCheckMapper.selectSysCheckById(id);
    }

    /**
     * 查询检查费用设置列表
     * 
     * @param sysCheck 检查费用设置
     * @return 检查费用设置
     */
    @Override
    public List<SysCheck> selectSysCheckList(SysCheck sysCheck)
    {
        return sysCheckMapper.selectSysCheckList(sysCheck);
    }

    /**
     * 新增检查费用设置
     * 
     * @param sysCheck 检查费用设置
     * @return 结果
     */
    @Override
    public int insertSysCheck(SysCheck sysCheck)
    {
        return sysCheckMapper.insertSysCheck(sysCheck);
    }

    /**
     * 修改检查费用设置
     * 
     * @param sysCheck 检查费用设置
     * @return 结果
     */
    @Override
    public int updateSysCheck(SysCheck sysCheck)
    {
        return sysCheckMapper.updateSysCheck(sysCheck);
    }

    /**
     * 批量删除检查费用设置
     * 
     * @param ids 需要删除的检查费用设置主键
     * @return 结果
     */
    @Override
    public int deleteSysCheckByIds(Long[] ids)
    {
        return sysCheckMapper.deleteSysCheckByIds(ids);
    }

    /**
     * 删除检查费用设置信息
     * 
     * @param id 检查费用设置主键
     * @return 结果
     */
    @Override
    public int deleteSysCheckById(Long id)
    {
        return sysCheckMapper.deleteSysCheckById(id);
    }
}
