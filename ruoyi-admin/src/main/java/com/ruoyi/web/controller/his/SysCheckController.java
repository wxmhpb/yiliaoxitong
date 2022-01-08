package com.ruoyi.web.controller.his;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.his.domain.SysCheck;
import com.ruoyi.his.service.ISysCheckService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 检查费用设置Controller
 *
 * @author ruoyi
 * @date 2022-01-01
 */
@RestController
@RequestMapping("/his/check")
public class SysCheckController extends BaseController
{
    @Autowired
    private ISysCheckService sysCheckService;

    /**
     * 查询检查费用设置列表
     */
    @PreAuthorize("@ss.hasPermi('his:check:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCheck sysCheck)
    {
        startPage();
        List<SysCheck> list = sysCheckService.selectSysCheckList(sysCheck);
        return getDataTable(list);
    }

    /**
     * 导出检查费用设置列表
     */
    @PreAuthorize("@ss.hasPermi('his:check:export')")
    @Log(title = "检查费用设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCheck sysCheck)
    {
        List<SysCheck> list = sysCheckService.selectSysCheckList(sysCheck);
        ExcelUtil<SysCheck> util = new ExcelUtil<SysCheck>(SysCheck.class);
        util.exportExcel(response, list, "检查费用设置数据");
    }

    /**
     * 获取检查费用设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:check:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysCheckService.selectSysCheckById(id));
    }

    /**
     * 新增检查费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:check:add')")
    @Log(title = "检查费用设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCheck sysCheck)
    {
        return toAjax(sysCheckService.insertSysCheck(sysCheck));
    }

    /**
     * 修改检查费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:check:edit')")
    @Log(title = "检查费用设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCheck sysCheck)
    {
        return toAjax(sysCheckService.updateSysCheck(sysCheck));
    }

    /**
     * 删除检查费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:check:remove')")
    @Log(title = "检查费用设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysCheckService.deleteSysCheckByIds(ids));
    }
}
