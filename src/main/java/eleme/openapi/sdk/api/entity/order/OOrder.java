package eleme.openapi.sdk.api.entity.order;

import eleme.openapi.sdk.api.enumeration.order.OOrderRefundStatus;
import eleme.openapi.sdk.api.enumeration.order.OOrderStatus;

import java.util.List;

public class OOrder {

    /**
     * 顾客送餐地址
     */
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * 下单时间
     */
    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * 订单生效时间
     */
    private String activeAt;

    public String getActiveAt() {
        return activeAt;
    }

    public void setActiveAt(String activeAt) {
        this.activeAt = activeAt;
    }


    /**
     * 配送费
     */
    private double deliverFee;

    public double getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(double deliverFee) {
        this.deliverFee = deliverFee;
    }


    /**
     * 预计送达时间
     */
    private String deliverTime;

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }


    /**
     * 订单备注
     */
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * 订单详细类目的列表
     */
    private List<OGoodsGroup> groups;

    public List<OGoodsGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<OGoodsGroup> groups) {
        this.groups = groups;
    }


    /**
     * 发票抬头
     */
    private String invoice;

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }


    /**
     * 是否预订单
     */
    private boolean book;

    public boolean getBook() {
        return book;
    }

    public void setBook(boolean book) {
        this.book = book;
    }


    /**
     * 是否在线支付
     */
    private boolean onlinePaid;

    public boolean getOnlinePaid() {
        return onlinePaid;
    }

    public void setOnlinePaid(boolean onlinePaid) {
        this.onlinePaid = onlinePaid;
    }


    /**
     * 订单Id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    /**
     * 顾客联系电话
     */
    private List<String> phoneList;

    public List<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<String> phoneList) {
        this.phoneList = phoneList;
    }


    /**
     * 店铺Id
     */
    private long shopId;

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }


    /**
     * 店铺绑定的外部ID
     */
    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }


    /**
     * 店铺名称
     */
    private String shopName;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    /**
     * 店铺当日订单流水号
     */
    private int daySn;

    public int getDaySn() {
        return daySn;
    }

    public void setDaySn(int daySn) {
        this.daySn = daySn;
    }


    /**
     * 订单状态
     */
    private OOrderStatus status;

    public OOrderStatus getStatus() {
        return status;
    }

    public void setStatus(OOrderStatus status) {
        this.status = status;
    }


    /**
     * 退单状态
     */
    private OOrderRefundStatus refundStatus;

    public OOrderRefundStatus getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(OOrderRefundStatus refundStatus) {
        this.refundStatus = refundStatus;
    }


    /**
     * 下单用户的Id
     */
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * 订单总价，用户实际支付的金额，单位：元
     */
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * 订单原始价格
     */
    private double originalPrice;

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }


    /**
     * 订单收货人姓名
     */
    private String consignee;

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }


    /**
     * 订单收货地址经纬度
     */
    private String deliveryGeo;

    public String getDeliveryGeo() {
        return deliveryGeo;
    }

    public void setDeliveryGeo(String deliveryGeo) {
        this.deliveryGeo = deliveryGeo;
    }


    /**
     * 送餐地址
     */
    private String deliveryPoiAddress;

    public String getDeliveryPoiAddress() {
        return deliveryPoiAddress;
    }

    public void setDeliveryPoiAddress(String deliveryPoiAddress) {
        this.deliveryPoiAddress = deliveryPoiAddress;
    }


    /**
     * 顾客是否需要发票
     */
    private boolean invoiced;

    public boolean getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(boolean invoiced) {
        this.invoiced = invoiced;
    }


    /**
     * 店铺实收
     */
    private double income;

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


    /**
     * 饿了么服务费率
     */
    private double serviceRate;

    public double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(double serviceRate) {
        this.serviceRate = serviceRate;
    }


    /**
     * 饿了么服务费
     */
    private double serviceFee;

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }


    /**
     * 订单中红包金额
     */
    private double hongbao;

    public double getHongbao() {
        return hongbao;
    }

    public void setHongbao(double hongbao) {
        this.hongbao = hongbao;
    }


    /**
     * 餐盒费
     */
    private double packageFee;

    public double getPackageFee() {
        return packageFee;
    }

    public void setPackageFee(double packageFee) {
        this.packageFee = packageFee;
    }


    /**
     * 订单活动总额
     */
    private double activityTotal;

    public double getActivityTotal() {
        return activityTotal;
    }

    public void setActivityTotal(double activityTotal) {
        this.activityTotal = activityTotal;
    }


    /**
     * 店铺承担活动费用
     */
    private double shopPart;

    public double getShopPart() {
        return shopPart;
    }

    public void setShopPart(double shopPart) {
        this.shopPart = shopPart;
    }


    /**
     * 饿了么承担活动费用
     */
    private double elemePart;

    public double getElemePart() {
        return elemePart;
    }

    public void setElemePart(double elemePart) {
        this.elemePart = elemePart;
    }


    /**
     * 降级标识
     */
    private boolean downgraded;

    public boolean getDowngraded() {
        return downgraded;
    }

    public void setDowngraded(boolean downgraded) {
        this.downgraded = downgraded;
    }

    @Override
    public String toString() {
        return "OOrder{" +
                "address='" + address + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", activeAt='" + activeAt + '\'' +
                ", deliverFee=" + deliverFee +
                ", deliverTime='" + deliverTime + '\'' +
                ", description='" + description + '\'' +
                ", groups=" + groups +
                ", invoice='" + invoice + '\'' +
                ", book=" + book +
                ", onlinePaid=" + onlinePaid +
                ", id='" + id + '\'' +
                ", phoneList=" + phoneList +
                ", shopId=" + shopId +
                ", openId='" + openId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", daySn=" + daySn +
                ", status=" + status +
                ", refundStatus=" + refundStatus +
                ", userId=" + userId +
                ", totalPrice=" + totalPrice +
                ", originalPrice=" + originalPrice +
                ", consignee='" + consignee + '\'' +
                ", deliveryGeo='" + deliveryGeo + '\'' +
                ", deliveryPoiAddress='" + deliveryPoiAddress + '\'' +
                ", invoiced=" + invoiced +
                ", income=" + income +
                ", serviceRate=" + serviceRate +
                ", serviceFee=" + serviceFee +
                ", hongbao=" + hongbao +
                ", packageFee=" + packageFee +
                ", activityTotal=" + activityTotal +
                ", shopPart=" + shopPart +
                ", elemePart=" + elemePart +
                ", downgraded=" + downgraded +
                '}';
    }
}