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
import com.ruoyi.yaoping.domain.SysChangjia;
import com.ruoyi.yaoping.service.ISysChangjiaService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 厂家信息管理Controller
 *
 * @author ruoyi
 * @date 2022-01-02
 */
@RestController
@RequestMapping("/yaoping/changjia")
public class SysChangjiaController extends BaseController
{
    @Autowired
    private ISysChangjiaService sysChangjiaService;

    /**
     * 查询厂家信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysChangjia sysChangjia)
    {
        startPage();
        List<SysChangjia> list = sysChangjiaService.selectSysChangjiaList(sysChangjia);
        return getDataTable(list);
    }

    /**
     * 导出厂家信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:export')")
    @Log(title = "厂家信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysChangjia sysChangjia)
    {
        List<SysChangjia> list = sysChangjiaService.selectSysChangjiaList(sysChangjia);
        ExcelUtil<SysChangjia> util = new ExcelUtil<SysChangjia>(SysChangjia.class);
        util.exportExcel(response, list, "厂家信息管理数据");
    }

    /**
     * 获取厂家信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysChangjiaService.selectSysChangjiaById(id));
    }

    /**
     * 新增厂家信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:add')")
    @Log(title = "厂家信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysChangjia sysChangjia)
    {
        return toAjax(sysChangjiaService.insertSysChangjia(sysChangjia));
    }

    /**
     * 修改厂家信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:edit')")
    @Log(title = "厂家信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysChangjia sysChangjia)
    {
        return toAjax(sysChangjiaService.updateSysChangjia(sysChangjia));
    }

    /**
     * 删除厂家信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:changjia:remove')")
    @Log(title = "厂家信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysChangjiaService.deleteSysChangjiaByIds(ids));
    }
}
