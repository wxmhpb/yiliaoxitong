package com.ruoyi.his.service;

import com.ruoyi.his.domain.SysGuahao;

import java.util.List;

/**
 * 挂号费用设置Service接口
 *
 * @author ruoyi
 * @date 2022-01-01
 */
public interface ISysGuahaoService
{
    /**
     * 查询挂号费用设置
     *
     * @param id 挂号费用设置主键
     * @return 挂号费用设置
     */
    public SysGuahao selectSysGuahaoById(Long id);

    /**
     * 查询挂号费用设置列表
     *
     * @param sysGuahao 挂号费用设置
     * @return 挂号费用设置集合
     */
    public List<SysGuahao> selectSysGuahaoList(SysGuahao sysGuahao);

    /**
     * 新增挂号费用设置
     *
     * @param sysGuahao 挂号费用设置
     * @return 结果
     */
    public int insertSysGuahao(SysGuahao sysGuahao);

    /**
     * 修改挂号费用设置
     *
     * @param sysGuahao 挂号费用设置
     * @return 结果
     */
    public int updateSysGuahao(SysGuahao sysGuahao);

    /**
     * 批量删除挂号费用设置
     *
     * @param ids 需要删除的挂号费用设置主键集合
     * @return 结果
     */
    public int deleteSysGuahaoByIds(Long[] ids);

    /**
     * 删除挂号费用设置信息
     *
     * @param id 挂号费用设置主键
     * @return 结果
     */
    public int deleteSysGuahaoById(Long id);
}
