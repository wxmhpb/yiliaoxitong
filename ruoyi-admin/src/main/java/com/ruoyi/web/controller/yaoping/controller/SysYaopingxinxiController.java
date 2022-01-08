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
import com.ruoyi.yaoping.domain.SysYaopingxinxi;
import com.ruoyi.yaoping.service.ISysYaopingxinxiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 药品信息管理Controller
 *
 * @author ruoyi
 * @date 2022-01-02
 */
@RestController
@RequestMapping("/yaoping/xinxi")
public class SysYaopingxinxiController extends BaseController
{
    @Autowired
    private ISysYaopingxinxiService sysYaopingxinxiService;

    /**
     * 查询药品信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysYaopingxinxi sysYaopingxinxi)
    {
        startPage();
        List<SysYaopingxinxi> list = sysYaopingxinxiService.selectSysYaopingxinxiList(sysYaopingxinxi);
        return getDataTable(list);
    }


    /**
     * 导出药品信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:export')")
    @Log(title = "药品信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysYaopingxinxi sysYaopingxinxi)
    {
        List<SysYaopingxinxi> list = sysYaopingxinxiService.selectSysYaopingxinxiList(sysYaopingxinxi);
        ExcelUtil<SysYaopingxinxi> util = new ExcelUtil<SysYaopingxinxi>(SysYaopingxinxi.class);
        util.exportExcel(response, list, "药品信息管理数据");
    }

    /**
     * 获取药品信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysYaopingxinxiService.selectSysYaopingxinxiById(id));
    }

    /**
     * 新增药品信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:add')")
    @Log(title = "药品信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysYaopingxinxi sysYaopingxinxi)
    {
        return toAjax(sysYaopingxinxiService.insertSysYaopingxinxi(sysYaopingxinxi));
    }

    /**
     * 修改药品信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:edit')")
    @Log(title = "药品信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysYaopingxinxi sysYaopingxinxi)
    {
        return toAjax(sysYaopingxinxiService.updateSysYaopingxinxi(sysYaopingxinxi));
    }

    /**
     * 删除药品信息管理
     */
    @PreAuthorize("@ss.hasPermi('yaoping:xinxi:remove')")
    @Log(title = "药品信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysYaopingxinxiService.deleteSysYaopingxinxiByIds(ids));
    }
}
