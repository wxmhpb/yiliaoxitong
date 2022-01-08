package com.ruoyi.his.mapper;

import java.util.List;
import com.ruoyi.his.domain.SysHisDept;

/**
 * 科室Mapper接口
 * 
 * @author ruoyi
 * @date 2021-12-31
 */
public interface SysHisDeptMapper 
{
    /**
     * 查询科室
     * 
     * @param deptId 科室主键
     * @return 科室
     */
    public SysHisDept selectSysHisDeptByDeptId(Long deptId);

    /**
     * 查询科室列表
     * 
     * @param sysHisDept 科室
     * @return 科室集合
     */
    public List<SysHisDept> selectSysHisDeptList(SysHisDept sysHisDept);

    /**
     * 新增科室
     * 
     * @param sysHisDept 科室
     * @return 结果
     */
    public int insertSysHisDept(SysHisDept sysHisDept);

    /**
     * 修改科室
     * 
     * @param sysHisDept 科室
     * @return 结果
     */
    public int updateSysHisDept(SysHisDept sysHisDept);

    /**
     * 删除科室
     * 
     * @param deptId 科室主键
     * @return 结果
     */
    public int deleteSysHisDeptByDeptId(Long deptId);

    /**
     * 批量删除科室
     * 
     * @param deptIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysHisDeptByDeptIds(Long[] deptIds);
}
