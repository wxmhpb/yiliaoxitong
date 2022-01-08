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

import java.util.List;

import static com.ruoyi.common.utils.PageUtils.startPage;

@RestController
@RequestMapping("/yaoping/kucun")
public class SysYaopingkucunController extends BaseController{

    @Autowired
   private ISysYaopingxinxiService sysYaopingxinxiService;
    @PreAuthorize("@ss.hasPermi('yaoping:kucun:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysYaopingxinxi sysYaopingxinxi)
    {
        startPage();
        List<SysYaopingxinxi> list = sysYaopingxinxiService.selectSysYaopingxinxiList1(sysYaopingxinxi);
        return getDataTable(list);
    }
    @PreAuthorize("@ss.hasPermi('yaoping:kucun:list')")
    @GetMapping("/list1")
    public TableDataInfo list1(SysYaopingxinxi sysYaopingxinxi)
    {
        startPage();
        List<SysYaopingxinxi> list = sysYaopingxinxiService.selectSysYaopingxinxiList2(sysYaopingxinxi);
        return getDataTable(list);
    }
}
