package com.ruoyi.his.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 挂号费用设置对象 sys_guahao
 *
 * @author ruoyi
 * @date 2022-01-01
 */
public class SysGuahao extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 挂号费ID */
    private Long id;

    /** 挂号费名称 */
    @Excel(name = "挂号费名称")
    private String name;

    /** 挂号费 */
    @Excel(name = "挂号费")
    private BigDecimal price;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

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
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("price", getPrice())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
