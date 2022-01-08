package com.ruoyi.yaoping.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 厂家信息管理对象 sys_changjia
 *
 * @author ruoyi
 * @date 2022-01-02
 */
public class SysChangjia extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 厂家ID */
    private Long id;

    /** 厂家名称 */
    @Excel(name = "厂家名称")
    private String changjiaName;

    /** 厂家编码 */
    @Excel(name = "厂家编码")
    private String code;

    /** 联系人 */
    @Excel(name = "联系人")
    private String person;

    /** 电话号 */
    @Excel(name = "电话号")
    private String phone;

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

    @Override
    public String toString() {
        return "SysChangjia{" +
                "id=" + id +
                ", changjiaName='" + changjiaName + '\'' +
                ", code='" + code + '\'' +
                ", person='" + person + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getChangjiaName() {
        return changjiaName;
    }

    public void setChangjiaName(String changjiaName) {
        this.changjiaName = changjiaName;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setPerson(String person)
    {
        this.person = person;
    }

    public String getPerson()
    {
        return person;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

}
