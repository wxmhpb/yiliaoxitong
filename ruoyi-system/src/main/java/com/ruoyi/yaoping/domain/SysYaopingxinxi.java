package com.ruoyi.yaoping.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品信息管理对象 sys_yaopingxinxi
 *
 * @author ruoyi
 * @date 2022-01-02
 */
public class SysYaopingxinxi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 药品ID */
    private Long id;

    /** 药品名称 */
    @Excel(name = "药品名称")
    private String name;

    /** 药品编码 */
    @Excel(name = "药品编码")
    private String code;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long changjiaId;

    /** 药品类型 */
    @Excel(name = "药品类型")
    private String leixing;

    /** 处方类型 */
    @Excel(name = "处方类型")
    private String chufangleixing;

    /** 单位 */
    @Excel(name = "单位")
    private String danwei;

    /** 处方价格 */
    @Excel(name = "处方价格")
    private Long price;

    /** 库存量 */
    @Excel(name = "库存量")
    private Long kucun;

    /** 预警值 */
    @Excel(name = "预警值")
    private Long yujingzhi;

    /** 换算量 */
    @Excel(name = "换算量")
    private Long huansuan;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    private SysChangjia changjia;

    private SysPurchase sysPurchase;

    public SysChangjia getChangjia() {
        return changjia;
    }

    public void setChangjia(SysChangjia changjia) {
        this.changjia = changjia;
    }

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
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setChangjiaId(Long changjiaId)
    {
        this.changjiaId = changjiaId;
    }

    public Long getChangjiaId()
    {
        return changjiaId;
    }
    public void setLeixing(String leixing)
    {
        this.leixing = leixing;
    }

    public String getLeixing()
    {
        return leixing;
    }
    public void setChufangleixing(String chufangleixing)
    {
        this.chufangleixing = chufangleixing;
    }

    public String getChufangleixing()
    {
        return chufangleixing;
    }
    public void setDanwei(String danwei)
    {
        this.danwei = danwei;
    }

    public String getDanwei()
    {
        return danwei;
    }
    public void setPrice(Long price)
    {
        this.price = price;
    }

    public Long getPrice()
    {
        return price;
    }
    public void setKucun(Long kucun)
    {
        this.kucun = kucun;
    }

    public Long getKucun()
    {
        return kucun;
    }
    public void setYujingzhi(Long yujingzhi)
    {
        this.yujingzhi = yujingzhi;
    }

    public Long getYujingzhi()
    {
        return yujingzhi;
    }
    public void setHuansuan(Long huansuan)
    {
        this.huansuan = huansuan;
    }

    public Long getHuansuan()
    {
        return huansuan;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public SysPurchase getSysPurchase() {
        return sysPurchase;
    }

    public void setSysPurchase(SysPurchase sysPurchase) {
        this.sysPurchase = sysPurchase;
    }

    @Override
    public String toString() {
        return "SysYaopingxinxi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", changjiaId=" + changjiaId +
                ", leixing='" + leixing + '\'' +
                ", chufangleixing='" + chufangleixing + '\'' +
                ", danwei='" + danwei + '\'' +
                ", price=" + price +
                ", kucun=" + kucun +
                ", yujingzhi=" + yujingzhi +
                ", huansuan=" + huansuan +
                ", status='" + status + '\'' +
                ", changjia=" + changjia +
                ", sysPurchase=" + sysPurchase +
                '}';
    }
}
