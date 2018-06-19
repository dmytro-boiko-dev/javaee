package com.jsf;

import com.models.TaggingTaskEntity;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;


@Named("lsManagedBean")
@RequestScoped
public class LofStatusManagedBean implements Serializable {

//    @Inject
//    private LofStatusDAO lofStatusDAO;
//
//    public List<LofStatusEntity> lofData(){
//        return lofStatusDAO.getAllUsers();
//    }

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



    public TaggingTaskEntity getTaggingTaskEntity() {
        return taggingTaskEntity;
    }

    public void setTaggingTaskEntity(TaggingTaskEntity taggingTaskEntity) {
        this.taggingTaskEntity = taggingTaskEntity;
    }




    public long getMessageFilterId() {
        return messageFilterId;
    }

    public void setMessageFilterId(long messageFilterId) {
        this.messageFilterId = messageFilterId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public Boolean getRecrawled() {
        return isRecrawled;
    }

    public void setRecrawled(Boolean recrawled) {
        isRecrawled = recrawled;
    }

    public Boolean getHeaderDataReady() {
        return isHeaderDataReady;
    }

    public void setHeaderDataReady(Boolean headerDataReady) {
        isHeaderDataReady = headerDataReady;
    }

    public Boolean getClusterized() {
        return isClusterized;
    }

    public void setClusterized(Boolean clusterized) {
        isClusterized = clusterized;
    }

    public Boolean getFetched() {
        return isFetched;
    }

    public void setFetched(Boolean fetched) {
        isFetched = fetched;
    }

    public Boolean getBbxTagged() {
        return isBbxTagged;
    }

    public void setBbxTagged(Boolean bbxTagged) {
        isBbxTagged = bbxTagged;
    }

    public Boolean getReadyForAfc() {
        return isReadyForAfc;
    }

    public void setReadyForAfc(Boolean readyForAfc) {
        isReadyForAfc = readyForAfc;
    }

    public Boolean getAfcProcessed() {
        return isAfcProcessed;
    }

    public void setAfcProcessed(Boolean afcProcessed) {
        isAfcProcessed = afcProcessed;
    }

    public Boolean getAfdProcessed() {
        return isAfdProcessed;
    }

    public void setAfdProcessed(Boolean afdProcessed) {
        isAfdProcessed = afdProcessed;
    }

    public Timestamp getLofCreateTime() {
        return lofCreateTime;
    }

    public void setLofCreateTime(Timestamp lofCreateTime) {
        this.lofCreateTime = lofCreateTime;
    }
}
