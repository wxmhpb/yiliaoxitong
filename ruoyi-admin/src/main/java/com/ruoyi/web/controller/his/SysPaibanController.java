package com.ruoyi.web.controller.his;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.his.domain.SysBanci;
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
import com.ruoyi.his.domain.SysPaiban;
import com.ruoyi.his.service.ISysPaibanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 排班表Controller
 *
 * @author ruoyi
 * @date 2022-01-11
 */
@RestController
@RequestMapping("/his/paiban")
public class SysPaibanController extends BaseController
{
    @Autowired
    private ISysPaibanService sysPaibanService;

    /**
     * 查询排班表列表
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPaiban sysPaiban)
    {
        startPage();
        List<SysPaiban> list = sysPaibanService.selectSysPaibanList(sysPaiban);
        return getDataTable(list);
    }
    @PreAuthorize("@ss.hasPermi('his:paiban:list1')")
    @GetMapping("/list1")
    public TableDataInfo list1(SysBanci sysBanci)
    {
        startPage();
        List<SysBanci> list = sysPaibanService.selectSysBanciList(sysBanci);
        return getDataTable(list);
    }

    /**
     * 导出排班表列表
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:export')")
    @Log(title = "排班表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPaiban sysPaiban)
    {
        List<SysPaiban> list = sysPaibanService.selectSysPaibanList(sysPaiban);
        ExcelUtil<SysPaiban> util = new ExcelUtil<SysPaiban>(SysPaiban.class);
        util.exportExcel(response, list, "排班表数据");
    }

    /**
     * 获取排班表详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysPaibanService.selectSysPaibanById(id));
    }

    /**
     * 新增排班表
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:add')")
    @Log(title = "排班表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysPaiban sysPaiban)
    {
        return toAjax(sysPaibanService.insertSysPaiban(sysPaiban));
    }

    /**
     * 修改排班表
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:edit')")
    @Log(title = "排班表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysPaiban sysPaiban)
    {
        return toAjax(sysPaibanService.updateSysPaiban(sysPaiban));
    }

    /**
     * 删除排班表
     */
    @PreAuthorize("@ss.hasPermi('his:paiban:remove')")
    @Log(title = "排班表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysPaibanService.deleteSysPaibanByIds(ids));
    }
}
