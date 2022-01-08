package com.ruoyi.his.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 检查费用设置对象 sys_check
 * 
 * @author ruoyi
 * @date 2022-01-01
 */
public class SysCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 项目ID */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String name;

    /** 项目单价 */
    @Excel(name = "项目单价")
    private BigDecimal price;

    /** 项目成本 */
    @Excel(name = "项目成本")
    private BigDecimal chengben;

    /** 单位 */
    @Excel(name = "单位")
    private String danwei;

    /** 类别 */
    @Excel(name = "类别")
    private String leibie;

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
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setChengben(BigDecimal chengben) 
    {
        this.chengben = chengben;
    }

    public BigDecimal getChengben() 
    {
        return chengben;
    }
    public void setDanwei(String danwei) 
    {
        this.danwei = danwei;
    }

    public String getDanwei() 
    {
        return danwei;
    }
    public void setLeibie(String leibie) 
    {
        this.leibie = leibie;
    }

    public String getLeibie() 
    {
        return leibie;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("price", getPrice())
            .append("chengben", getChengben())
            .append("danwei", getDanwei())
            .append("leibie", getLeibie())
            .toString();
    }
}
