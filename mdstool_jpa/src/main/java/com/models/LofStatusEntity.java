package com.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "lof_status", schema = "rdr")
public class LofStatusEntity {
    private long messageFilterId;
    private String comment;
    private boolean isActive;
    private boolean hasError;
    private boolean isRecrawled;
    private boolean isHeaderDataReady;
    private boolean isClusterized;
    private boolean isFetched;
    private boolean isBbxTagged;
    private boolean isReadyForAfc;
    private boolean isAfcProcessed;
    private boolean isAfdProcessed;
    private Timestamp lofCreateTime;

    public LofStatusEntity(long messageFilterId, String comment, boolean isActive, boolean hasError, boolean isRecrawled, boolean isHeaderDataReady, boolean isClusterized, boolean isFetched, boolean isBbxTagged, boolean isReadyForAfc, boolean isAfcProcessed, boolean isAfdProcessed, Timestamp lofCreateTime) {
        this.messageFilterId = messageFilterId;
        this.comment = comment;
        this.isActive = isActive;
        this.hasError = hasError;
        this.isRecrawled = isRecrawled;
        this.isHeaderDataReady = isHeaderDataReady;
        this.isClusterized = isClusterized;
        this.isFetched = isFetched;
        this.isBbxTagged = isBbxTagged;
        this.isReadyForAfc = isReadyForAfc;
        this.isAfcProcessed = isAfcProcessed;
        this.isAfdProcessed = isAfdProcessed;
        this.lofCreateTime = lofCreateTime;
    }

    public LofStatusEntity() {
    }

    @Id
    @Column(name = "message_filter_id", nullable = false)
    public long getMessageFilterId() {
        return messageFilterId;
    }

    public void setMessageFilterId(long messageFilterId) {
        this.messageFilterId = messageFilterId;
    }

    @Basic
    @Column(name = "comment", nullable = true, length = -1)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public boolean isActive() {
        return isActive;
    }

    @Basic
    @Column(name = "is_active", nullable = true)
    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean hasError() {
        return hasError;
    }

    @Basic
    @Column(name = "has_error", nullable = true)
    public boolean getHasError() {
        return hasError;
    }

    public void setHasError(boolean hasErr) {
        this.hasError = hasErr;
    }

    public boolean isRecrawled() {
        return isRecrawled;
    }

    @Basic
    @Column(name = "is_recrawled", nullable = true)
    public boolean getRecrawled() {
        return isRecrawled;
    }

    public void setRecrawled(boolean recrawled) {
        isRecrawled = recrawled;
    }

    public boolean isHeaderDataReady() {
        return isHeaderDataReady;
    }

    @Basic
    @Column(name = "is_header_data_ready", nullable = true)
    public boolean getHeaderDataReady() {
        return isHeaderDataReady;
    }

    public void setHeaderDataReady(boolean headerDataReady) {
        isHeaderDataReady = headerDataReady;
    }

    public boolean isClusterized() {
        return isClusterized;
    }

    @Basic
    @Column(name = "is_clusterized", nullable = true)
    public boolean getClusterized() {
        return isClusterized;
    }

    public void setClusterized(boolean clusterized) {
        isClusterized = clusterized;
    }

    public boolean isFetched() {
        return isFetched;
    }

    @Basic
    @Column(name = "is_fetched", nullable = true)
    public boolean getFetched() {
        return isFetched;
    }

    public void setFetched(boolean fetched) {
        isFetched = fetched;
    }

    public boolean isBbxTagged() {
        return isBbxTagged;
    }

    @Basic
    @Column(name = "is_bbx_tagged", nullable = true)
    public boolean getBbxTagged() {
        return isBbxTagged;
    }

    public void setBbxTagged(boolean bbxTagged) {
        isBbxTagged = bbxTagged;
    }

    public boolean isReadyForAfc() {
        return isReadyForAfc;
    }

    @Basic
    @Column(name = "is_ready_for_afc", nullable = true)
    public boolean getReadyForAfc() {
        return isReadyForAfc;
    }

    public void setReadyForAfc(boolean readyForAfc) {
        isReadyForAfc = readyForAfc;
    }

    public boolean isAfcProcessed() {
        return isAfcProcessed;
    }

    @Basic
    @Column(name = "is_afc_processed", nullable = true)
    public boolean getAfcProcessed() {
        return isAfcProcessed;
    }

    public void setAfcProcessed(boolean afcProcessed) {
        isAfcProcessed = afcProcessed;
    }

    public boolean isAfdProcessed() {
        return isAfdProcessed;
    }

    @Basic
    @Column(name = "is_afd_processed", nullable = true)
    public boolean getAfdProcessed() {
        return isAfdProcessed;
    }

    public void setAfdProcessed(boolean afdProcessed) {
        isAfdProcessed = afdProcessed;
    }

    @Basic
    @Column(name = "lof_create_time", nullable = true)
    public Timestamp getLofCreateTime() {
        return lofCreateTime;
    }

    public void setLofCreateTime(Timestamp lofCreateTime) {
        this.lofCreateTime = lofCreateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LofStatusEntity that = (LofStatusEntity) o;

        if (messageFilterId != that.messageFilterId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (lofCreateTime != null ? !lofCreateTime.equals(that.lofCreateTime) : that.lofCreateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (messageFilterId ^ (messageFilterId >>> 32));
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (lofCreateTime != null ? lofCreateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LofStatusEntity{" +
                "messageFilterId=" + messageFilterId +
                ", comment='" + comment + '\'' +
                ", lofCreateTime=" + lofCreateTime +
                '}';
    }
}

