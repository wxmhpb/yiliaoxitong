package com.ruoyi.his.mapper;

import java.util.List;
import com.ruoyi.his.domain.SysCheck;

/**
 * 检查费用设置Mapper接口
 * 
 * @author ruoyi
 * @date 2022-01-01
 */
public interface SysCheckMapper 
{
    /**
     * 查询检查费用设置
     * 
     * @param id 检查费用设置主键
     * @return 检查费用设置
     */
    public SysCheck selectSysCheckById(Long id);

    /**
     * 查询检查费用设置列表
     * 
     * @param sysCheck 检查费用设置
     * @return 检查费用设置集合
     */
    public List<SysCheck> selectSysCheckList(SysCheck sysCheck);

    /**
     * 新增检查费用设置
     * 
     * @param sysCheck 检查费用设置
     * @return 结果
     */
    public int insertSysCheck(SysCheck sysCheck);

    /**
     * 修改检查费用设置
     * 
     * @param sysCheck 检查费用设置
     * @return 结果
     */
    public int updateSysCheck(SysCheck sysCheck);

    /**
     * 删除检查费用设置
     * 
     * @param id 检查费用设置主键
     * @return 结果
     */
    public int deleteSysCheckById(Long id);

    /**
     * 批量删除检查费用设置
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCheckByIds(Long[] ids);
}
