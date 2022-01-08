package com.ruoyi.yaoping.service;

import java.util.List;
import com.ruoyi.yaoping.domain.SysYaopingxinxi;

/**
 * 药品信息管理Service接口
 *
 * @author ruoyi
 * @date 2022-01-02
 */
public interface ISysYaopingxinxiService
{
    /**
     * 查询药品信息管理
     *
     * @param id 药品信息管理主键
     * @return 药品信息管理
     */
    public SysYaopingxinxi selectSysYaopingxinxiById(Long id);

    /**
     * 查询药品信息管理列表
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 药品信息管理集合
     */
    public List<SysYaopingxinxi> selectSysYaopingxinxiList(SysYaopingxinxi sysYaopingxinxi);
    public List<SysYaopingxinxi> selectSysYaopingxinxiList1(SysYaopingxinxi sysYaopingxinxi);
    public List<SysYaopingxinxi> selectSysYaopingxinxiList2(SysYaopingxinxi sysYaopingxinxi);

    /**
     * 新增药品信息管理
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 结果
     */
    public int insertSysYaopingxinxi(SysYaopingxinxi sysYaopingxinxi);

    /**
     * 修改药品信息管理
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 结果
     */
    public int updateSysYaopingxinxi(SysYaopingxinxi sysYaopingxinxi);

    /**
     * 批量删除药品信息管理
     *
     * @param ids 需要删除的药品信息管理主键集合
     * @return 结果
     */
    public int deleteSysYaopingxinxiByIds(Long[] ids);

    /**
     * 删除药品信息管理信息
     *
     * @param id 药品信息管理主键
     * @return 结果
     */
    public int deleteSysYaopingxinxiById(Long id);
}
