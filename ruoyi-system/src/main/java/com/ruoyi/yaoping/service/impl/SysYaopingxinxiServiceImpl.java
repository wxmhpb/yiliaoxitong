package com.ruoyi.yaoping.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.yaoping.mapper.SysYaopingxinxiMapper;
import com.ruoyi.yaoping.domain.SysYaopingxinxi;
import com.ruoyi.yaoping.service.ISysYaopingxinxiService;

/**
 * 药品信息管理Service业务层处理
 *
 * @author ruoyi
 * @date 2022-01-02
 */
@Service
public class SysYaopingxinxiServiceImpl implements ISysYaopingxinxiService
{
    @Autowired
    private SysYaopingxinxiMapper sysYaopingxinxiMapper;

    /**
     * 查询药品信息管理
     *
     * @param id 药品信息管理主键
     * @return 药品信息管理
     */
    @Override
    public SysYaopingxinxi selectSysYaopingxinxiById(Long id)
    {
        return sysYaopingxinxiMapper.selectSysYaopingxinxiById(id);
    }

    /**
     * 查询药品信息管理列表
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 药品信息管理
     */
    @Override
    public List<SysYaopingxinxi> selectSysYaopingxinxiList(SysYaopingxinxi sysYaopingxinxi)
    {
        return sysYaopingxinxiMapper.selectSysYaopingxinxiList(sysYaopingxinxi);
    }

    /**
     * 新增药品信息管理
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 结果
     */
    @Override
    public int insertSysYaopingxinxi(SysYaopingxinxi sysYaopingxinxi)
    {
        return sysYaopingxinxiMapper.insertSysYaopingxinxi(sysYaopingxinxi);
    }

    /**
     * 修改药品信息管理
     *
     * @param sysYaopingxinxi 药品信息管理
     * @return 结果
     */
    @Override
    public int updateSysYaopingxinxi(SysYaopingxinxi sysYaopingxinxi)
    {
        return sysYaopingxinxiMapper.updateSysYaopingxinxi(sysYaopingxinxi);
    }

    /**
     * 批量删除药品信息管理
     *
     * @param ids 需要删除的药品信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysYaopingxinxiByIds(Long[] ids)
    {
        return sysYaopingxinxiMapper.deleteSysYaopingxinxiByIds(ids);
    }

    /**
     * 删除药品信息管理信息
     *
     * @param id 药品信息管理主键
     * @return 结果
     */
    @Override
    public int deleteSysYaopingxinxiById(Long id)
    {
        return sysYaopingxinxiMapper.deleteSysYaopingxinxiById(id);
    }

    @Override
    public List<SysYaopingxinxi> selectSysYaopingxinxiList1(SysYaopingxinxi sysYaopingxinxi) {
        return sysYaopingxinxiMapper.selectSysYaopingxinxiList1(sysYaopingxinxi);
    }

    @Override
    public List<SysYaopingxinxi> selectSysYaopingxinxiList2(SysYaopingxinxi sysYaopingxinxi) {
        return sysYaopingxinxiMapper.selectSysYaopingxinxiList2(sysYaopingxinxi);
    }
}
