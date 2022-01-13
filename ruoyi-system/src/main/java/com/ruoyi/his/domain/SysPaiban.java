package com.ruoyi.his.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.entity.SysDept;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 排班表对象 sys_paiban
 *
 * @author ruoyi
 * @date 2022-01-11
 */
public class SysPaiban extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 医生名字 */
    @Excel(name = "医生名字")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long deptId;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datetime;

    /** 班次 */
    @Excel(name = "班次")
    private String banci;
    private SysDept sysDept;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setDeptId(Long deptId)
    {
        this.deptId = deptId;
    }

    public Long getDeptId()
    {
        return deptId;
    }
    public void setDatetime(Date datetime)
    {
        this.datetime = datetime;
    }

    public Date getDatetime()
    {
        return datetime;
    }
    public void setBanci(String banci)
    {
        this.banci = banci;
    }

    public String getBanci()
    {
        return banci;
    }

    public SysDept getSysDept() {
        return sysDept;
    }

    public void setSysDept(SysDept sysDept) {
        this.sysDept = sysDept;
    }

    @Override
    public String toString() {
        return "SysPaiban{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", datetime=" + datetime +
                ", banci='" + banci + '\'' +
                ", sysDept=" + sysDept +
                '}';
    }
}
