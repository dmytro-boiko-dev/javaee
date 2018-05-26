package com.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tagging_task", schema = "rdr")
public class TaggingTaskEntity {
    private int id;
    private Long clusterCount;
    private Timestamp lastModifiedTime;
    private Integer lofCount;
    private Integer merchantId;
    private String merchantName;
    private Long messagesCount;
    private String status;
    private Integer userId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cluster_count", nullable = true)
    public Long getClusterCount() {
        return clusterCount;
    }

    public void setClusterCount(Long clusterCount) {
        this.clusterCount = clusterCount;
    }

    @Basic
    @Column(name = "last_modified_time", nullable = true)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "lof_count", nullable = true)
    public Integer getLofCount() {
        return lofCount;
    }

    public void setLofCount(Integer lofCount) {
        this.lofCount = lofCount;
    }

    @Basic
    @Column(name = "merchant_id", nullable = true)
    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "merchant_name", nullable = true, length = 255)
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @Basic
    @Column(name = "messages_count", nullable = true)
    public Long getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(Long messagesCount) {
        this.messagesCount = messagesCount;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaggingTaskEntity that = (TaggingTaskEntity) o;

        if (id != that.id) return false;
        if (clusterCount != null ? !clusterCount.equals(that.clusterCount) : that.clusterCount != null) return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(that.lastModifiedTime) : that.lastModifiedTime != null)
            return false;
        if (lofCount != null ? !lofCount.equals(that.lofCount) : that.lofCount != null) return false;
        if (merchantId != null ? !merchantId.equals(that.merchantId) : that.merchantId != null) return false;
        if (merchantName != null ? !merchantName.equals(that.merchantName) : that.merchantName != null) return false;
        if (messagesCount != null ? !messagesCount.equals(that.messagesCount) : that.messagesCount != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (clusterCount != null ? clusterCount.hashCode() : 0);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + (lofCount != null ? lofCount.hashCode() : 0);
        result = 31 * result + (merchantId != null ? merchantId.hashCode() : 0);
        result = 31 * result + (merchantName != null ? merchantName.hashCode() : 0);
        result = 31 * result + (messagesCount != null ? messagesCount.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaggingTaskEntity{" +
                "id=" + id +
                ", clusterCount=" + clusterCount +
                ", lastModifiedTime=" + lastModifiedTime +
                ", lofCount=" + lofCount +
                ", merchantId=" + merchantId +
                ", merchantName='" + merchantName + '\'' +
                ", messagesCount=" + messagesCount +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                '}';
    }
}
