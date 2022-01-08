package com.ruoyi.yaoping.service;

import com.ruoyi.yaoping.domain.SysPurchase;

import java.util.List;

/**
 * 采购信息Service接口
 *
 * @author ruoyi
 * @date 2022-01-03
 */
public interface ISysPurchaseService
{
    /**
     * 查询采购信息
     *
     * @param id 采购信息主键
     * @return 采购信息
     */
    public SysPurchase selectSysPurchaseById(String id);

    /**
     * 查询采购信息列表
     *
     * @param sysPurchase 采购信息
     * @return 采购信息集合
     */
    public List<SysPurchase> selectSysPurchaseList(SysPurchase sysPurchase);

    /**
     * 新增采购信息
     *
     * @param sysPurchase 采购信息
     * @return 结果
     */
    public int insertSysPurchase(SysPurchase sysPurchase);

    /**
     * 修改采购信息
     *
     * @param sysPurchase 采购信息
     * @return 结果
     */
    public int updateSysPurchase(SysPurchase sysPurchase);

    /**
     * 批量删除采购信息
     *
     * @param ids 需要删除的采购信息主键集合
     * @return 结果
     */
    public int deleteSysPurchaseByIds(String[] ids);

    /**
     * 删除采购信息信息
     *
     * @param id 采购信息主键
     * @return 结果
     */
    public int deleteSysPurchaseById(String id);
}
