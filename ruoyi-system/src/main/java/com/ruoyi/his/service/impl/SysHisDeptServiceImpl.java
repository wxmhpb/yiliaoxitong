package com.ruoyi.his.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.his.mapper.SysHisDeptMapper;
import com.ruoyi.his.domain.SysHisDept;
import com.ruoyi.his.service.ISysHisDeptService;

/**
 * 科室Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-31
 */
@Service
public class SysHisDeptServiceImpl implements ISysHisDeptService 
{
    @Autowired
    private SysHisDeptMapper sysHisDeptMapper;

    /**
     * 查询科室
     * 
     * @param deptId 科室主键
     * @return 科室
     */
    @Override
    public SysHisDept selectSysHisDeptByDeptId(Long deptId)
    {
        return sysHisDeptMapper.selectSysHisDeptByDeptId(deptId);
    }

    /**
     * 查询科室列表
     * 
     * @param sysHisDept 科室
     * @return 科室
     */
    @Override
    public List<SysHisDept> selectSysHisDeptList(SysHisDept sysHisDept)
    {
        return sysHisDeptMapper.selectSysHisDeptList(sysHisDept);
    }

    /**
     * 新增科室
     * 
     * @param sysHisDept 科室
     * @return 结果
     */
    @Override
    public int insertSysHisDept(SysHisDept sysHisDept)
    {
        sysHisDept.setCreateTime(DateUtils.getNowDate());
        return sysHisDeptMapper.insertSysHisDept(sysHisDept);
    }

    /**
     * 修改科室
     * 
     * @param sysHisDept 科室
     * @return 结果
     */
    @Override
    public int updateSysHisDept(SysHisDept sysHisDept)
    {
        sysHisDept.setUpdateTime(DateUtils.getNowDate());
        return sysHisDeptMapper.updateSysHisDept(sysHisDept);
    }

    /**
     * 批量删除科室
     * 
     * @param deptIds 需要删除的科室主键
     * @return 结果
     */
    @Override
    public int deleteSysHisDeptByDeptIds(Long[] deptIds)
    {
        return sysHisDeptMapper.deleteSysHisDeptByDeptIds(deptIds);
    }

    /**
     * 删除科室信息
     * 
     * @param deptId 科室主键
     * @return 结果
     */
    @Override
    public int deleteSysHisDeptByDeptId(Long deptId)
    {
        return sysHisDeptMapper.deleteSysHisDeptByDeptId(deptId);
    }
}
