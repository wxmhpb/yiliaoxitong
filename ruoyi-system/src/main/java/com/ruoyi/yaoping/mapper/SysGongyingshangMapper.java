package com.ruoyi.yaoping.mapper;

import com.ruoyi.yaoping.domain.SysGongyingshang;

import java.util.List;

/**
 * 供应商信息管理Mapper接口
 *
 * @author ruoyi
 * @date 2022-01-02
 */
public interface SysGongyingshangMapper
{
    /**
     * 查询供应商信息管理
     *
     * @param id 供应商信息管理主键
     * @return 供应商信息管理
     */
    public SysGongyingshang selectSysGongyingshangById(Long id);

    /**
     * 查询供应商信息管理列表
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 供应商信息管理集合
     */
    public List<SysGongyingshang> selectSysGongyingshangList(SysGongyingshang sysGongyingshang);

    /**
     * 新增供应商信息管理
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 结果
     */
    public int insertSysGongyingshang(SysGongyingshang sysGongyingshang);

    /**
     * 修改供应商信息管理
     *
     * @param sysGongyingshang 供应商信息管理
     * @return 结果
     */
    public int updateSysGongyingshang(SysGongyingshang sysGongyingshang);

    /**
     * 删除供应商信息管理
     *
     * @param id 供应商信息管理主键
     * @return 结果
     */
    public int deleteSysGongyingshangById(Long id);

    /**
     * 批量删除供应商信息管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysGongyingshangByIds(Long[] ids);
}
