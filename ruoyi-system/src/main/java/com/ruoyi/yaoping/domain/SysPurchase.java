package com.ruoyi.yaoping.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采购信息对象 sys_purchase
 *
 * @author ruoyi
 * @date 2022-01-03
 */
public class SysPurchase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 单据ID */
    private Integer id;

    private String danId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long gongId;
    private Integer yaoId;

    /** 采购批发总额 */
    @Excel(name = "采购批发总额")
    private BigDecimal zonge;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 申请人 */
    @Excel(name = "申请人")
    private String person;

    /** 入库操作人 */
    @Excel(name = "入库操作人")
    private String operator;

    /** 入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date rukuTime;
    private Date createTime;
    private Integer caigouliang;
    private Integer picihao;

    private SysGongyingshang sysGongyingshang;

    public SysGongyingshang getSysGongyingshang() {
        return sysGongyingshang;
    }

    public void setSysGongyingshang(SysGongyingshang sysGongyingshang) {
        this.sysGongyingshang = sysGongyingshang;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDanId() {
        return danId;
    }

    public void setDanId(String danId) {
        this.danId = danId;
    }

    public void setGongId(Long gongId)
    {
        this.gongId = gongId;
    }

    public Long getGongId()
    {
        return gongId;
    }
    public void setZonge(BigDecimal zonge)
    {
        this.zonge = zonge;
    }

    public BigDecimal getZonge()
    {
        return zonge;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setPerson(String person)
    {
        this.person = person;
    }

    public String getPerson()
    {
        return person;
    }
    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public String getOperator()
    {
        return operator;
    }
    public void setRukuTime(Date rukuTime)
    {
        this.rukuTime = rukuTime;
    }

    public Date getRukuTime()
    {
        return rukuTime;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    public Integer getYaoId() {
        return yaoId;
    }

    public void setYaoId(Integer yaoId) {
        this.yaoId = yaoId;
    }

    public Integer getCaigouliang() {
        return caigouliang;
    }

    public void setCaigouliang(Integer caigouliang) {
        this.caigouliang = caigouliang;
    }

    public Integer getPicihao() {
        return picihao;
    }

    public void setPicihao(Integer picihao) {
        this.picihao = picihao;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysPurchase{" +
                "id=" + id +
                ", danId='" + danId + '\'' +
                ", gongId=" + gongId +
                ", yaoId=" + yaoId +
                ", zonge=" + zonge +
                ", status='" + status + '\'' +
                ", person='" + person + '\'' +
                ", operator='" + operator + '\'' +
                ", rukuTime=" + rukuTime +
                ", createTime=" + createTime +
                ", caigouliang=" + caigouliang +
                ", picihao=" + picihao +
                ", sysGongyingshang=" + sysGongyingshang +
                '}';
    }
}
