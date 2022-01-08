package com.ruoyi.yaoping.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 供应商信息管理对象 sys_gongyingshang
 *
 * @author ruoyi
 * @date 2022-01-02
 */
public class SysGongyingshang extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供应商ID */
    private Long id;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String gongName;

    /** 联系人 */
    @Excel(name = "联系人")
    private String person;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String number;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String zhanghao;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

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

    public String getGongName() {
        return gongName;
    }

    public void setGongName(String gongName) {
        this.gongName = gongName;
    }

    public void setPerson(String person)
    {
        this.person = person;
    }

    public String getPerson()
    {
        return person;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }
    public void setZhanghao(String zhanghao)
    {
        this.zhanghao = zhanghao;
    }

    public String getZhanghao()
    {
        return zhanghao;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
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
            .append("gongname", getGongName())
            .append("person", getPerson())
            .append("number", getNumber())
            .append("zhanghao", getZhanghao())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .toString();
    }
}
