package com.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "lof_status", schema = "rdr")
public class LofStatusEntity {
    private long messageFilterId;
    private String comment;
    private Boolean isActive;
    private Boolean hasError;
    private Boolean isRecrawled;
    private Boolean isHeaderDataReady;
    private Boolean isClusterized;
    private Boolean isFetched;
    private Boolean isBbxTagged;
    private Boolean isReadyForAfc;
    private Boolean isAfcProcessed;
    private Boolean isAfdProcessed;
    private Timestamp lofCreateTime;
    private TaggingTaskEntity taggingTaskEntity;


    @ManyToOne
    @JoinColumn(name = "tagging_task_id")
    public TaggingTaskEntity getTaggingTaskEntity() {
        return taggingTaskEntity;
    }

    public void setTaggingTaskEntity(TaggingTaskEntity taggingTaskEntity) {
        this.taggingTaskEntity = taggingTaskEntity;
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


    @Basic
    @Column(name = "is_active", nullable = true)
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }


    @Basic
    @Column(name = "has_error", nullable = true)
    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    @Basic
    @Column(name = "is_recrawled", nullable = true)
    public Boolean getRecrawled() {
        return isRecrawled;
    }

    public void setRecrawled(Boolean recrawled) {
        isRecrawled = recrawled;
    }

    @Basic
    @Column(name = "is_header_data_ready", nullable = true)
    public Boolean getHeaderDataReady() {
        return isHeaderDataReady;
    }

    public void setHeaderDataReady(Boolean headerDataReady) {
        isHeaderDataReady = headerDataReady;
    }

    @Basic
    @Column(name = "is_clusterized", nullable = true)
    public Boolean getClusterized() {
        return isClusterized;
    }

    public void setClusterized(Boolean clusterized) {
        isClusterized = clusterized;
    }

    @Basic
    @Column(name = "is_fetched", nullable = true)
    public Boolean getFetched() {
        return isFetched;
    }

    public void setFetched(Boolean fetched) {
        isFetched = fetched;
    }

    @Basic
    @Column(name = "is_bbx_tagged", nullable = true)
    public Boolean getBbxTagged() {
        return isBbxTagged;
    }

    public void setBbxTagged(Boolean bbxTagged) {
        isBbxTagged = bbxTagged;
    }

    @Basic
    @Column(name = "is_ready_for_afc", nullable = true)
    public Boolean getReadyForAfc() {
        return isReadyForAfc;
    }

    public void setReadyForAfc(Boolean readyForAfc) {
        isReadyForAfc = readyForAfc;
    }

    @Basic
    @Column(name = "is_afc_processed", nullable = true)
    public Boolean getAfcProcessed() {
        return isAfcProcessed;
    }

    public void setAfcProcessed(Boolean afcProcessed) {
        isAfcProcessed = afcProcessed;
    }

    @Basic
    @Column(name = "is_afd_processed", nullable = true)
    public Boolean getAfdProcessed() {
        return isAfdProcessed;
    }

    public void setAfdProcessed(Boolean afdProcessed) {
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
        return messageFilterId == that.messageFilterId &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(isActive, that.isActive) &&
                Objects.equals(hasError, that.hasError) &&
                Objects.equals(isRecrawled, that.isRecrawled) &&
                Objects.equals(isHeaderDataReady, that.isHeaderDataReady) &&
                Objects.equals(isClusterized, that.isClusterized) &&
                Objects.equals(isFetched, that.isFetched) &&
                Objects.equals(isBbxTagged, that.isBbxTagged) &&
                Objects.equals(isReadyForAfc, that.isReadyForAfc) &&
                Objects.equals(isAfcProcessed, that.isAfcProcessed) &&
                Objects.equals(isAfdProcessed, that.isAfdProcessed) &&
                Objects.equals(lofCreateTime, that.lofCreateTime) &&
                Objects.equals(taggingTaskEntity, that.taggingTaskEntity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(messageFilterId, comment, isActive,
                hasError, isRecrawled, isHeaderDataReady, isClusterized,
                isFetched, isBbxTagged, isReadyForAfc, isAfcProcessed,
                isAfdProcessed, lofCreateTime, taggingTaskEntity);
    }

    @Override
    public String toString() {
        return "LofStatusEntity{" +
                "messageFilterId=" + messageFilterId +
                ", comment='" + comment + '\'' +
                ", isActive=" + isActive +
                ", hasError=" + hasError +
                ", isRecrawled=" + isRecrawled +
                ", isHeaderDataReady=" + isHeaderDataReady +
                ", isClusterized=" + isClusterized +
                ", isFetched=" + isFetched +
                ", isBbxTagged=" + isBbxTagged +
                ", isReadyForAfc=" + isReadyForAfc +
                ", isAfcProcessed=" + isAfcProcessed +
                ", isAfdProcessed=" + isAfdProcessed +
                ", lofCreateTime=" + lofCreateTime +
                ", taggingTaskEntity=" + taggingTaskEntity +
                '}';
    }
}