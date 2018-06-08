package com.models;

import javax.persistence.*;
import java.sql.Timestamp;

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
    private Integer taggingTaskId;


//new dependency
    private TaggingTaskEntity taggingTaskEntity;

    @ManyToOne
    @JoinColumn(name = "tagging_task_id")
    public TaggingTaskEntity getTaggingTaskEntity() {
        return taggingTaskEntity;
    }

    public void setTaggingTaskEntity(TaggingTaskEntity taggingTaskEntity) {
        this.taggingTaskEntity = taggingTaskEntity;
    }

//end new dependency


//new
    @Basic
    @Column(name = "tagging_task_id", nullable = true)
    public Integer getTaggingTaskId() {
        return taggingTaskId;
    }

    public void setTaggingTaskId(Integer taggingTaskId) {
        this.taggingTaskId = taggingTaskId;
    }
//end new

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

        if (messageFilterId != that.messageFilterId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (hasError != null ? !hasError.equals(that.hasError) : that.hasError != null) return false;
        if (isRecrawled != null ? !isRecrawled.equals(that.isRecrawled) : that.isRecrawled != null) return false;
        if (isHeaderDataReady != null ? !isHeaderDataReady.equals(that.isHeaderDataReady) : that.isHeaderDataReady != null)
            return false;
        if (isClusterized != null ? !isClusterized.equals(that.isClusterized) : that.isClusterized != null)
            return false;
        if (isFetched != null ? !isFetched.equals(that.isFetched) : that.isFetched != null) return false;
        if (isBbxTagged != null ? !isBbxTagged.equals(that.isBbxTagged) : that.isBbxTagged != null) return false;
        if (isReadyForAfc != null ? !isReadyForAfc.equals(that.isReadyForAfc) : that.isReadyForAfc != null)
            return false;
        if (isAfcProcessed != null ? !isAfcProcessed.equals(that.isAfcProcessed) : that.isAfcProcessed != null)
            return false;
        if (isAfdProcessed != null ? !isAfdProcessed.equals(that.isAfdProcessed) : that.isAfdProcessed != null)
            return false;
        if (lofCreateTime != null ? !lofCreateTime.equals(that.lofCreateTime) : that.lofCreateTime != null)
            return false;
//    new
        if (taggingTaskId != null ? !taggingTaskId.equals(that.taggingTaskId) : that.taggingTaskId != null)
            return false;
//    end new
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (messageFilterId ^ (messageFilterId >>> 32));
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (hasError != null ? hasError.hashCode() : 0);
        result = 31 * result + (isRecrawled != null ? isRecrawled.hashCode() : 0);
        result = 31 * result + (isHeaderDataReady != null ? isHeaderDataReady.hashCode() : 0);
        result = 31 * result + (isClusterized != null ? isClusterized.hashCode() : 0);
        result = 31 * result + (isFetched != null ? isFetched.hashCode() : 0);
        result = 31 * result + (isBbxTagged != null ? isBbxTagged.hashCode() : 0);
        result = 31 * result + (isReadyForAfc != null ? isReadyForAfc.hashCode() : 0);
        result = 31 * result + (isAfcProcessed != null ? isAfcProcessed.hashCode() : 0);
        result = 31 * result + (isAfdProcessed != null ? isAfdProcessed.hashCode() : 0);
        result = 31 * result + (lofCreateTime != null ? lofCreateTime.hashCode() : 0);
//    new
        result = 31 * result + (taggingTaskId != null ? taggingTaskId.hashCode() : 0);

        return result;
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
                //new
                ", taggingTaskId=" + taggingTaskId +
                '}';
    }
}