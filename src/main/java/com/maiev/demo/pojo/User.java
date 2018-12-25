package com.maiev.demo.pojo;

import java.math.BigDecimal;

public class User {
    private Integer userId;

    private String mobile;

    private String equipment;

    private String avatarUrl;

    private Boolean status;

    private Long amount;

    private Long frozenAmount;

    private Long profitAmount;

    private String inviteCode;

    private Integer salesmanId;

    private Integer agentId;

    private BigDecimal planRate;

    private Integer createTime;

    private Byte userType;

    private Integer memberId;

    private Integer inviterUserId;

    private Byte isActivation;

    private Integer activationTime;

    private Integer completedMoney;

    private Byte assessStatus;

    private Integer completedTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment == null ? null : equipment.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(Long frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Long getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Long profitAmount) {
        this.profitAmount = profitAmount;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Integer getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(Integer salesmanId) {
        this.salesmanId = salesmanId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public BigDecimal getPlanRate() {
        return planRate;
    }

    public void setPlanRate(BigDecimal planRate) {
        this.planRate = planRate;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getInviterUserId() {
        return inviterUserId;
    }

    public void setInviterUserId(Integer inviterUserId) {
        this.inviterUserId = inviterUserId;
    }

    public Byte getIsActivation() {
        return isActivation;
    }

    public void setIsActivation(Byte isActivation) {
        this.isActivation = isActivation;
    }

    public Integer getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(Integer activationTime) {
        this.activationTime = activationTime;
    }

    public Integer getCompletedMoney() {
        return completedMoney;
    }

    public void setCompletedMoney(Integer completedMoney) {
        this.completedMoney = completedMoney;
    }

    public Byte getAssessStatus() {
        return assessStatus;
    }

    public void setAssessStatus(Byte assessStatus) {
        this.assessStatus = assessStatus;
    }

    public Integer getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Integer completedTime) {
        this.completedTime = completedTime;
    }
}