package com.ruoyi.yaoping.service;

import java.util.List;
import com.ruoyi.yaoping.domain.SysChangjia;

/**
 * 厂家信息管理Service接口
 * 
 * @author ruoyi
 * @date 2022-01-02
 */
public interface ISysChangjiaService 
{
    /**
     * 查询厂家信息管理
     * 
     * @param id 厂家信息管理主键
     * @return 厂家信息管理
     */
    public SysChangjia selectSysChangjiaById(Long id);

    /**
     * 查询厂家信息管理列表
     * 
     * @param sysChangjia 厂家信息管理
     * @return 厂家信息管理集合
     */
    public List<SysChangjia> selectSysChangjiaList(SysChangjia sysChangjia);

    /**
     * 新增厂家信息管理
     * 
     * @param sysChangjia 厂家信息管理
     * @return 结果
     */
    public int insertSysChangjia(SysChangjia sysChangjia);

    /**
     * 修改厂家信息管理
     * 
     * @param sysChangjia 厂家信息管理
     * @return 结果
     */
    public int updateSysChangjia(SysChangjia sysChangjia);

    /**
     * 批量删除厂家信息管理
     * 
     * @param ids 需要删除的厂家信息管理主键集合
     * @return 结果
     */
    public int deleteSysChangjiaByIds(Long[] ids);

    /**
     * 删除厂家信息管理信息
     * 
     * @param id 厂家信息管理主键
     * @return 结果
     */
    public int deleteSysChangjiaById(Long id);
}
