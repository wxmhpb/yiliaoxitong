package com.ruoyi.his.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.his.domain.SysGuahao;
import com.ruoyi.his.mapper.SysGuahaoMapper;
import com.ruoyi.his.service.ISysGuahaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 挂号费用设置Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-01
 */
@Service
public class SysGuahaoServiceImpl implements ISysGuahaoService
{
    @Autowired
    private SysGuahaoMapper sysGuahaoMapper;

    /**
     * 查询挂号费用设置
     *
     * @param id 挂号费用设置主键
     * @return 挂号费用设置
     */
    @Override
    public SysGuahao selectSysGuahaoById(Long id)
    {
        return sysGuahaoMapper.selectSysGuahaoById(id);
    }

    /**
     * 查询挂号费用设置列表
     *
     * @param sysGuahao 挂号费用设置
     * @return 挂号费用设置
     */
    @Override
    public List<SysGuahao> selectSysGuahaoList(SysGuahao sysGuahao)
    {
        return sysGuahaoMapper.selectSysGuahaoList(sysGuahao);
    }

    /**
     * 新增挂号费用设置
     *
     * @param sysGuahao 挂号费用设置
     * @return 结果
     */
    @Override
    public int insertSysGuahao(SysGuahao sysGuahao)
    {
        sysGuahao.setCreateTime(DateUtils.getNowDate());
        return sysGuahaoMapper.insertSysGuahao(sysGuahao);
    }

    /**
     * 修改挂号费用设置
     *
     * @param sysGuahao 挂号费用设置
     * @return 结果
     */
    @Override
    public int updateSysGuahao(SysGuahao sysGuahao)
    {
        return sysGuahaoMapper.updateSysGuahao(sysGuahao);
    }

    /**
     * 批量删除挂号费用设置
     *
     * @param ids 需要删除的挂号费用设置主键
     * @return 结果
     */
    @Override
    public int deleteSysGuahaoByIds(Long[] ids)
    {
        return sysGuahaoMapper.deleteSysGuahaoByIds(ids);
    }

    /**
     * 删除挂号费用设置信息
     *
     * @param id 挂号费用设置主键
     * @return 结果
     */
    @Override
    public int deleteSysGuahaoById(Long id)
    {
        return sysGuahaoMapper.deleteSysGuahaoById(id);
    }
}
