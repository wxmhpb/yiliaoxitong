package com.ruoyi.web.controller.yaoping.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.yaoping.domain.SysGongyingshang;
import com.ruoyi.yaoping.service.ISysGongyingshangService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 供应商信息管理Controller
 *
 * @author ruoyi
 * @date 2022-01-02
 */
@RestController
@RequestMapping("/yaoping/gongyingshang")
public class SysGongyingshangController extends BaseController
{
    @Autowired
    private ISysGongyingshangService sysGongyingshangService;

    /**
     * 查询供应商信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGongyingshang sysGongyingshang)
    {
        startPage();
        List<SysGongyingshang> list = sysGongyingshangService.selectSysGongyingshangList(sysGongyingshang);
        return getDataTable(list);
    }

    /**
     * 导出供应商信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:export')")
    @Log(title = "供应商信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysGongyingshang sysGongyingshang)
    {
        List<SysGongyingshang> list = sysGongyingshangService.selectSysGongyingshangList(sysGongyingshang);
        ExcelUtil<SysGongyingshang> util = new ExcelUtil<SysGongyingshang>(SysGongyingshang.class);
        util.exportExcel(response, list, "供应商信息管理数据");
    }

    /**
     * 获取供应商信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysGongyingshangService.selectSysGongyingshangById(id));
    }

    /**
     * 新增供应商信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:add')")
    @Log(title = "供应商信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysGongyingshang sysGongyingshang)
    {
        return toAjax(sysGongyingshangService.insertSysGongyingshang(sysGongyingshang));
    }

    /**
     * 修改供应商信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:edit')")
    @Log(title = "供应商信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysGongyingshang sysGongyingshang)
    {
        return toAjax(sysGongyingshangService.updateSysGongyingshang(sysGongyingshang));
    }

    /**
     * 删除供应商信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:gongyingshang:remove')")
    @Log(title = "供应商信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysGongyingshangService.deleteSysGongyingshangByIds(ids));
    }
}
