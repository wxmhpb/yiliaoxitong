package com.ruoyi.yaoping.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.yaoping.domain.SysPurchase;
import com.ruoyi.yaoping.mapper.SysPurchaseMapper;
import com.ruoyi.yaoping.service.ISysPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 采购信息Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-03
 */
@Service
public class SysPurchaseServiceImpl implements ISysPurchaseService
{
    @Autowired
    private SysPurchaseMapper sysPurchaseMapper;

    /**
     * 查询采购信息
     *
     * @param id 采购信息主键
     * @return 采购信息
     */
    @Override
    public SysPurchase selectSysPurchaseById(String id)
    {
        return sysPurchaseMapper.selectSysPurchaseById(id);
    }

    /**
     * 查询采购信息列表
     *
     * @param sysPurchase 采购信息
     * @return 采购信息
     */
    @Override
    public List<SysPurchase> selectSysPurchaseList(SysPurchase sysPurchase)
    {
        return sysPurchaseMapper.selectSysPurchaseList(sysPurchase);
    }

    /**
     * 新增采购信息
     *
     * @param sysPurchase 采购信息
     * @return 结果
     */
    @Override
    public int insertSysPurchase(SysPurchase sysPurchase)
    {
        sysPurchase.setCreateTime(DateUtils.getNowDate());
        return sysPurchaseMapper.insertSysPurchase(sysPurchase);
    }

    /**
     * 修改采购信息
     *
     * @param sysPurchase 采购信息
     * @return 结果
     */
    @Override
    public int updateSysPurchase(SysPurchase sysPurchase)
    {
        return sysPurchaseMapper.updateSysPurchase(sysPurchase);
    }

    /**
     * 批量删除采购信息
     *
     * @param ids 需要删除的采购信息主键
     * @return 结果
     */
    @Override
    public int deleteSysPurchaseByIds(String[] ids)
    {
        return sysPurchaseMapper.deleteSysPurchaseByIds(ids);
    }

    /**
     * 删除采购信息信息
     *
     * @param id 采购信息主键
     * @return 结果
     */
    @Override
    public int deleteSysPurchaseById(String id)
    {
        return sysPurchaseMapper.deleteSysPurchaseById(id);
    }
}
