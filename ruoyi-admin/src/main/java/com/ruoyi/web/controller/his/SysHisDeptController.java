package com.ruoyi.web.controller.his;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
import com.ruoyi.his.domain.SysHisDept;
import com.ruoyi.his.service.ISysHisDeptService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 科室Controller
 *
 * @author ruoyi
 * @date 2021-12-31
 */
@RestController
@RequestMapping("/his/keshi")
public class SysHisDeptController extends BaseController
{
    @Autowired
    private ISysHisDeptService sysHisDeptService;

    /**
     * 查询科室列表
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysHisDept sysHisDept)
    {
        startPage();
        List<SysHisDept> list = sysHisDeptService.selectSysHisDeptList(sysHisDept);
        return getDataTable(list);
    }

    /**
     * 导出科室列表
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:export')")
    @Log(title = "科室", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysHisDept sysHisDept)
    {
        List<SysHisDept> list = sysHisDeptService.selectSysHisDeptList(sysHisDept);
        ExcelUtil<SysHisDept> util = new ExcelUtil<SysHisDept>(SysHisDept.class);
        util.exportExcel(response, list, "科室数据");
    }

    /**
     * 获取科室详细信息
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:query')")
    @GetMapping(value = "/{deptId}")
    public AjaxResult getInfo(@PathVariable("deptId") Long deptId)
    {
        return AjaxResult.success(sysHisDeptService.selectSysHisDeptByDeptId(deptId));
    }

    /**
     * 新增科室
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:add')")
    @Log(title = "科室", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysHisDept sysHisDept)
    {
        return toAjax(sysHisDeptService.insertSysHisDept(sysHisDept));
    }

    /**
     * 修改科室
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:edit')")
    @Log(title = "科室", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysHisDept sysHisDept)
    {
        return toAjax(sysHisDeptService.updateSysHisDept(sysHisDept));
    }

    /**
     * 删除科室
     */
    @PreAuthorize("@ss.hasPermi('his:keshi:remove')")
    @Log(title = "科室", businessType = BusinessType.DELETE)
	@DeleteMapping("/{deptIds}")
    public AjaxResult remove(@PathVariable Long[] deptIds)
    {
        return toAjax(sysHisDeptService.deleteSysHisDeptByDeptIds(deptIds));
    }
}
