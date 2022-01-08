package com.ruoyi.web.controller.yaoping.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.yaoping.domain.SysPurchase;
import com.ruoyi.yaoping.service.ISysPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 采购信息Controller
 *
 * @author ruoyi
 * @date 2022-01-03
 */
@RestController
@RequestMapping("/yaoping/purchase")
public class SysPurchaseController extends BaseController
{
    @Autowired
    private ISysPurchaseService sysPurchaseService;

    /**
     * 查询采购信息列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPurchase sysPurchase)
    {
        startPage();
        List<SysPurchase> list = sysPurchaseService.selectSysPurchaseList(sysPurchase);
        return getDataTable(list);
    }

    /**
     * 导出采购信息列表
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:export')")
    @Log(title = "采购信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPurchase sysPurchase)
    {
        List<SysPurchase> list = sysPurchaseService.selectSysPurchaseList(sysPurchase);
        ExcelUtil<SysPurchase> util = new ExcelUtil<SysPurchase>(SysPurchase.class);
        util.exportExcel(response, list, "采购信息数据");
    }

    /**
     * 获取采购信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(sysPurchaseService.selectSysPurchaseById(id));
    }

    /**
     * 新增采购信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:add')")
    @Log(title = "采购信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysPurchase sysPurchase)
    {
        return toAjax(sysPurchaseService.insertSysPurchase(sysPurchase));
    }

    /**
     * 修改采购信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:edit')")
    @Log(title = "采购信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysPurchase sysPurchase)
    {
        return toAjax(sysPurchaseService.updateSysPurchase(sysPurchase));
    }

    /**
     * 删除采购信息
     */
    @PreAuthorize("@ss.hasPermi('yaoping:purchase:remove')")
    @Log(title = "采购信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(sysPurchaseService.deleteSysPurchaseByIds(ids));
    }
}
