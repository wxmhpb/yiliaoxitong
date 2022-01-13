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
import com.ruoyi.his.domain.SysPaiban;
import com.ruoyi.his.service.ISysPaibanService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;


@RestController
@RequestMapping("/his/wo")
public class SysPaiban1Controller extends BaseController {
    @Autowired
    private ISysPaibanService sysPaibanService;

    /**
     * 查询排班表列表
     */
    @PreAuthorize("@ss.hasPermi('his:wo:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPaiban sysPaiban)
    {
        startPage();
        List<SysPaiban> list = sysPaibanService.selectSysPaibanList1(sysPaiban);
        return getDataTable(list);
    }
}
