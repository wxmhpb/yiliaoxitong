package com.ruoyi.his.mapper;

import com.ruoyi.his.domain.SysBanci;
import com.ruoyi.his.domain.SysPaiban;

import java.util.List;

/**
 * 排班表Mapper接口
 *
 * @author ruoyi
 * @date 2022-01-11
 */
public interface SysPaibanMapper
{
    /**
     * 查询排班表
     *
     * @param id 排班表主键
     * @return 排班表
     */
    public SysPaiban selectSysPaibanById(Long id);

    /**
     * 查询排班表列表
     *
     * @param sysPaiban 排班表
     * @return 排班表集合
     */
    public List<SysPaiban> selectSysPaibanList(SysPaiban sysPaiban);
    public List<SysPaiban> selectSysPaibanList1(SysPaiban sysPaiban);
    public List<SysBanci>selectSysBanciList(SysBanci sysBanci);
    /**
     * 新增排班表
     *
     * @param sysPaiban 排班表
     * @return 结果
     */
    public int insertSysPaiban(SysPaiban sysPaiban);

    /**
     * 修改排班表
     *
     * @param sysPaiban 排班表
     * @return 结果
     */
    public int updateSysPaiban(SysPaiban sysPaiban);

    /**
     * 删除排班表
     *
     * @param id 排班表主键
     * @return 结果
     */
    public int deleteSysPaibanById(Long id);

    /**
     * 批量删除排班表
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysPaibanByIds(Long[] ids);
}
