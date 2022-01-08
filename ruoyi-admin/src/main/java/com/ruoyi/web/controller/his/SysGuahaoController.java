package com.ruoyi.web.controller.his;

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
import com.ruoyi.his.domain.SysGuahao;
import com.ruoyi.his.service.ISysGuahaoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 挂号费用设置Controller
 *
 * @author ruoyi
 * @date 2022-01-01
 */
@RestController
@RequestMapping("/his/guahao")
public class SysGuahaoController extends BaseController
{
    @Autowired
    private ISysGuahaoService sysGuahaoService;

    /**
     * 查询挂号费用设置列表
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGuahao sysGuahao)
    {
        startPage();
        List<SysGuahao> list = sysGuahaoService.selectSysGuahaoList(sysGuahao);
        return getDataTable(list);
    }

    /**
     * 导出挂号费用设置列表
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:export')")
    @Log(title = "挂号费用设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysGuahao sysGuahao)
    {
        List<SysGuahao> list = sysGuahaoService.selectSysGuahaoList(sysGuahao);
        ExcelUtil<SysGuahao> util = new ExcelUtil<SysGuahao>(SysGuahao.class);
        util.exportExcel(response, list, "挂号费用设置数据");
    }

    /**
     * 获取挂号费用设置详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(sysGuahaoService.selectSysGuahaoById(id));
    }

    /**
     * 新增挂号费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:add')")
    @Log(title = "挂号费用设置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysGuahao sysGuahao)
    {
        return toAjax(sysGuahaoService.insertSysGuahao(sysGuahao));
    }

    /**
     * 修改挂号费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:edit')")
    @Log(title = "挂号费用设置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysGuahao sysGuahao)
    {
        return toAjax(sysGuahaoService.updateSysGuahao(sysGuahao));
    }

    /**
     * 删除挂号费用设置
     */
    @PreAuthorize("@ss.hasPermi('his:guahao:remove')")
    @Log(title = "挂号费用设置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysGuahaoService.deleteSysGuahaoByIds(ids));
    }
}
