package java/com.zenghao.demo.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long feightTemplateId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    /**
     * 货号
     *
     * @mbggenerated
     */
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     *
     * @mbggenerated
     */
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     *
     * @mbggenerated
     */
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     *
     * @mbggenerated
     */
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     *
     * @mbggenerated
     */
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     *
     * @mbggenerated
     */
    private Integer verifyStatus;

    /**
     * 排序
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * 销量
     *
     * @mbggenerated
     */
    private Integer sale;

    private BigDecimal price;

    /**
     * 促销价格
     *
     * @mbggenerated
     */
    private BigDecimal promotionPrice;

    /**
     * 赠送的成长值
     *
     * @mbggenerated
     */
    private Integer giftGrowth;

    /**
     * 赠送的积分
     *
     * @mbggenerated
     */
    private Integer giftPoint;

    /**
     * 限制使用的积分数
     *
     * @mbggenerated
     */
    private Integer usePointLimit;

    /**
     * 副标题
     *
     * @mbggenerated
     */
    private String subTitle;

    /**
     * 市场价
     *
     * @mbggenerated
     */
    private BigDecimal originalPrice;

    /**
     * 库存
     *
     * @mbggenerated
     */
    private Integer stock;

    /**
     * 库存预警值
     *
     * @mbggenerated
     */
    private Integer lowStock;

    /**
     * 单位
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * 商品重量，默认为克
     *
     * @mbggenerated
     */
    private BigDecimal weight;

    /**
     * 是否为预告商品：0->不是；1->是
     *
     * @mbggenerated
     */
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     *
     * @mbggenerated
     */
    private String serviceIds;

    private String keywords;

    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     *
     * @mbggenerated
     */
    private String albumPics;

    private String detailTitle;

    /**
     * 促销开始时间
     *
     * @mbggenerated
     */
    private Date promotionStartTime;

    /**
     * 促销结束时间
     *
     * @mbggenerated
     */
    private Date promotionEndTime;

    /**
     * 活动限购数量
     *
     * @mbggenerated
     */
    private Integer promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     *
     * @mbggenerated
     */
    private Integer promotionType;

    /**
     * 品牌名称
     *
     * @mbggenerated
     */
    private String brandName;

    /**
     * 商品分类名称
     *
     * @mbggenerated
     */
    private String productCategoryName;

    /**
     * 商品描述
     *
     * @mbggenerated
     */
    private String description;

    private String detailDesc;

    /**
     * 产品详情网页内容
     *
     * @mbggenerated
     */
    private String detailHtml;

    /**
     * 移动端网页详情
     *
     * @mbggenerated
     */
    private String detailMobileHtml;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds == null ? null : serviceIds.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName == null ? null : productCategoryName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml == null ? null : detailHtml.trim();
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml == null ? null : detailMobileHtml.trim();
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
        PmsProduct other = (PmsProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getProductCategoryId() == null ? other.getProductCategoryId() == null : this.getProductCategoryId().equals(other.getProductCategoryId()))
            && (this.getFeightTemplateId() == null ? other.getFeightTemplateId() == null : this.getFeightTemplateId().equals(other.getFeightTemplateId()))
            && (this.getProductAttributeCategoryId() == null ? other.getProductAttributeCategoryId() == null : this.getProductAttributeCategoryId().equals(other.getProductAttributeCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getProductSn() == null ? other.getProductSn() == null : this.getProductSn().equals(other.getProductSn()))
            && (this.getDeleteStatus() == null ? other.getDeleteStatus() == null : this.getDeleteStatus().equals(other.getDeleteStatus()))
            && (this.getPublishStatus() == null ? other.getPublishStatus() == null : this.getPublishStatus().equals(other.getPublishStatus()))
            && (this.getNewStatus() == null ? other.getNewStatus() == null : this.getNewStatus().equals(other.getNewStatus()))
            && (this.getRecommandStatus() == null ? other.getRecommandStatus() == null : this.getRecommandStatus().equals(other.getRecommandStatus()))
            && (this.getVerifyStatus() == null ? other.getVerifyStatus() == null : this.getVerifyStatus().equals(other.getVerifyStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getSale() == null ? other.getSale() == null : this.getSale().equals(other.getSale()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPromotionPrice() == null ? other.getPromotionPrice() == null : this.getPromotionPrice().equals(other.getPromotionPrice()))
            && (this.getGiftGrowth() == null ? other.getGiftGrowth() == null : this.getGiftGrowth().equals(other.getGiftGrowth()))
            && (this.getGiftPoint() == null ? other.getGiftPoint() == null : this.getGiftPoint().equals(other.getGiftPoint()))
            && (this.getUsePointLimit() == null ? other.getUsePointLimit() == null : this.getUsePointLimit().equals(other.getUsePointLimit()))
            && (this.getSubTitle() == null ? other.getSubTitle() == null : this.getSubTitle().equals(other.getSubTitle()))
            && (this.getOriginalPrice() == null ? other.getOriginalPrice() == null : this.getOriginalPrice().equals(other.getOriginalPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getLowStock() == null ? other.getLowStock() == null : this.getLowStock().equals(other.getLowStock()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getPreviewStatus() == null ? other.getPreviewStatus() == null : this.getPreviewStatus().equals(other.getPreviewStatus()))
            && (this.getServiceIds() == null ? other.getServiceIds() == null : this.getServiceIds().equals(other.getServiceIds()))
            && (this.getKeywords() == null ? other.getKeywords() == null : this.getKeywords().equals(other.getKeywords()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getAlbumPics() == null ? other.getAlbumPics() == null : this.getAlbumPics().equals(other.getAlbumPics()))
            && (this.getDetailTitle() == null ? other.getDetailTitle() == null : this.getDetailTitle().equals(other.getDetailTitle()))
            && (this.getPromotionStartTime() == null ? other.getPromotionStartTime() == null : this.getPromotionStartTime().equals(other.getPromotionStartTime()))
            && (this.getPromotionEndTime() == null ? other.getPromotionEndTime() == null : this.getPromotionEndTime().equals(other.getPromotionEndTime()))
            && (this.getPromotionPerLimit() == null ? other.getPromotionPerLimit() == null : this.getPromotionPerLimit().equals(other.getPromotionPerLimit()))
            && (this.getPromotionType() == null ? other.getPromotionType() == null : this.getPromotionType().equals(other.getPromotionType()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getProductCategoryName() == null ? other.getProductCategoryName() == null : this.getProductCategoryName().equals(other.getProductCategoryName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDetailDesc() == null ? other.getDetailDesc() == null : this.getDetailDesc().equals(other.getDetailDesc()))
            && (this.getDetailHtml() == null ? other.getDetailHtml() == null : this.getDetailHtml().equals(other.getDetailHtml()))
            && (this.getDetailMobileHtml() == null ? other.getDetailMobileHtml() == null : this.getDetailMobileHtml().equals(other.getDetailMobileHtml()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getProductCategoryId() == null) ? 0 : getProductCategoryId().hashCode());
        result = prime * result + ((getFeightTemplateId() == null) ? 0 : getFeightTemplateId().hashCode());
        result = prime * result + ((getProductAttributeCategoryId() == null) ? 0 : getProductAttributeCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getProductSn() == null) ? 0 : getProductSn().hashCode());
        result = prime * result + ((getDeleteStatus() == null) ? 0 : getDeleteStatus().hashCode());
        result = prime * result + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        result = prime * result + ((getNewStatus() == null) ? 0 : getNewStatus().hashCode());
        result = prime * result + ((getRecommandStatus() == null) ? 0 : getRecommandStatus().hashCode());
        result = prime * result + ((getVerifyStatus() == null) ? 0 : getVerifyStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getSale() == null) ? 0 : getSale().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPromotionPrice() == null) ? 0 : getPromotionPrice().hashCode());
        result = prime * result + ((getGiftGrowth() == null) ? 0 : getGiftGrowth().hashCode());
        result = prime * result + ((getGiftPoint() == null) ? 0 : getGiftPoint().hashCode());
        result = prime * result + ((getUsePointLimit() == null) ? 0 : getUsePointLimit().hashCode());
        result = prime * result + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        result = prime * result + ((getOriginalPrice() == null) ? 0 : getOriginalPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getLowStock() == null) ? 0 : getLowStock().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getPreviewStatus() == null) ? 0 : getPreviewStatus().hashCode());
        result = prime * result + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        result = prime * result + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getAlbumPics() == null) ? 0 : getAlbumPics().hashCode());
        result = prime * result + ((getDetailTitle() == null) ? 0 : getDetailTitle().hashCode());
        result = prime * result + ((getPromotionStartTime() == null) ? 0 : getPromotionStartTime().hashCode());
        result = prime * result + ((getPromotionEndTime() == null) ? 0 : getPromotionEndTime().hashCode());
        result = prime * result + ((getPromotionPerLimit() == null) ? 0 : getPromotionPerLimit().hashCode());
        result = prime * result + ((getPromotionType() == null) ? 0 : getPromotionType().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getProductCategoryName() == null) ? 0 : getProductCategoryName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDetailDesc() == null) ? 0 : getDetailDesc().hashCode());
        result = prime * result + ((getDetailHtml() == null) ? 0 : getDetailHtml().hashCode());
        result = prime * result + ((getDetailMobileHtml() == null) ? 0 : getDetailMobileHtml().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", feightTemplateId=").append(feightTemplateId);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", sort=").append(sort);
        sb.append(", sale=").append(sale);
        sb.append(", price=").append(price);
        sb.append(", promotionPrice=").append(promotionPrice);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", giftPoint=").append(giftPoint);
        sb.append(", usePointLimit=").append(usePointLimit);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", weight=").append(weight);
        sb.append(", previewStatus=").append(previewStatus);
        sb.append(", serviceIds=").append(serviceIds);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", albumPics=").append(albumPics);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", promotionStartTime=").append(promotionStartTime);
        sb.append(", promotionEndTime=").append(promotionEndTime);
        sb.append(", promotionPerLimit=").append(promotionPerLimit);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", description=").append(description);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}