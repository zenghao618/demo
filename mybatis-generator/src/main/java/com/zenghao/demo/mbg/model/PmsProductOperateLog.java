package java/com.zenghao.demo.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProductOperateLog implements Serializable {
    private Long id;

    private Long productId;

    private BigDecimal priceOld;

    private BigDecimal priceNew;

    private BigDecimal salePriceOld;

    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     *
     * @mbggenerated
     */
    private Integer giftPointOld;

    private Integer giftPointNew;

    private Integer usePointLimitOld;

    private Integer usePointLimitNew;

    /**
     * 操作人
     *
     * @mbggenerated
     */
    private String operateMan;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PmsProductOperateLog other = (PmsProductOperateLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getPriceOld() == null ? other.getPriceOld() == null : this.getPriceOld().equals(other.getPriceOld()))
            && (this.getPriceNew() == null ? other.getPriceNew() == null : this.getPriceNew().equals(other.getPriceNew()))
            && (this.getSalePriceOld() == null ? other.getSalePriceOld() == null : this.getSalePriceOld().equals(other.getSalePriceOld()))
            && (this.getSalePriceNew() == null ? other.getSalePriceNew() == null : this.getSalePriceNew().equals(other.getSalePriceNew()))
            && (this.getGiftPointOld() == null ? other.getGiftPointOld() == null : this.getGiftPointOld().equals(other.getGiftPointOld()))
            && (this.getGiftPointNew() == null ? other.getGiftPointNew() == null : this.getGiftPointNew().equals(other.getGiftPointNew()))
            && (this.getUsePointLimitOld() == null ? other.getUsePointLimitOld() == null : this.getUsePointLimitOld().equals(other.getUsePointLimitOld()))
            && (this.getUsePointLimitNew() == null ? other.getUsePointLimitNew() == null : this.getUsePointLimitNew().equals(other.getUsePointLimitNew()))
            && (this.getOperateMan() == null ? other.getOperateMan() == null : this.getOperateMan().equals(other.getOperateMan()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getPriceOld() == null) ? 0 : getPriceOld().hashCode());
        result = prime * result + ((getPriceNew() == null) ? 0 : getPriceNew().hashCode());
        result = prime * result + ((getSalePriceOld() == null) ? 0 : getSalePriceOld().hashCode());
        result = prime * result + ((getSalePriceNew() == null) ? 0 : getSalePriceNew().hashCode());
        result = prime * result + ((getGiftPointOld() == null) ? 0 : getGiftPointOld().hashCode());
        result = prime * result + ((getGiftPointNew() == null) ? 0 : getGiftPointNew().hashCode());
        result = prime * result + ((getUsePointLimitOld() == null) ? 0 : getUsePointLimitOld().hashCode());
        result = prime * result + ((getUsePointLimitNew() == null) ? 0 : getUsePointLimitNew().hashCode());
        result = prime * result + ((getOperateMan() == null) ? 0 : getOperateMan().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", priceOld=").append(priceOld);
        sb.append(", priceNew=").append(priceNew);
        sb.append(", salePriceOld=").append(salePriceOld);
        sb.append(", salePriceNew=").append(salePriceNew);
        sb.append(", giftPointOld=").append(giftPointOld);
        sb.append(", giftPointNew=").append(giftPointNew);
        sb.append(", usePointLimitOld=").append(usePointLimitOld);
        sb.append(", usePointLimitNew=").append(usePointLimitNew);
        sb.append(", operateMan=").append(operateMan);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}