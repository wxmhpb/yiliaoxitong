package com.ruoyi.his.service.impl;

import java.util.List;

import com.ruoyi.his.domain.SysBanci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.his.mapper.SysPaibanMapper;
import com.ruoyi.his.domain.SysPaiban;
import com.ruoyi.his.service.ISysPaibanService;

/**
 * 排班表Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-11
 */
@Service
public class SysPaibanServiceImpl implements ISysPaibanService
{
    @Autowired
    private SysPaibanMapper sysPaibanMapper;

    /**
     * 查询排班表
     *
     * @param id 排班表主键
     * @return 排班表
     */
    @Override
    public SysPaiban selectSysPaibanById(Long id)
    {
        return sysPaibanMapper.selectSysPaibanById(id);
    }

    /**
     * 查询排班表列表
     *
     * @param sysPaiban 排班表
     * @return 排班表
     */
    @Override
    public List<SysPaiban> selectSysPaibanList(SysPaiban sysPaiban)
    {
        return sysPaibanMapper.selectSysPaibanList(sysPaiban);
    }
    public List<SysPaiban> selectSysPaibanList1(SysPaiban sysPaiban)
    {
        return sysPaibanMapper.selectSysPaibanList1(sysPaiban);
    }

    @Override
    public List<SysBanci> selectSysBanciList(SysBanci sysBanci) {
        return sysPaibanMapper.selectSysBanciList(sysBanci);
    }

    /**
     * 新增排班表
     *
     * @param sysPaiban 排班表
     * @return 结果
     */
    @Override
    public int insertSysPaiban(SysPaiban sysPaiban)
    {
        return sysPaibanMapper.insertSysPaiban(sysPaiban);
    }

    /**
     * 修改排班表
     *
     * @param sysPaiban 排班表
     * @return 结果
     */
    @Override
    public int updateSysPaiban(SysPaiban sysPaiban)
    {
        return sysPaibanMapper.updateSysPaiban(sysPaiban);
    }

    /**
     * 批量删除排班表
     *
     * @param ids 需要删除的排班表主键
     * @return 结果
     */
    @Override
    public int deleteSysPaibanByIds(Long[] ids)
    {
        return sysPaibanMapper.deleteSysPaibanByIds(ids);
    }

    /**
     * 删除排班表信息
     *
     * @param id 排班表主键
     * @return 结果
     */
    @Override
    public int deleteSysPaibanById(Long id)
    {
        return sysPaibanMapper.deleteSysPaibanById(id);
    }
}
