package com.jsf;

import com.dao.LofStatusDAO;
import com.models.LofStatusEntity;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Named("lsManagedBean")
@RequestScoped
public class LofStatusManagedBean implements Serializable {

    @Inject
    private LofStatusDAO lofStatusDAO;

    public List<LofStatusEntity> data(){
        return lofStatusDAO.getAllUsers();
    }

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


//fix
    public boolean isActive() {
        return isActive;
    }

    public boolean hasError() {
        return hasError;
    }

    public boolean isRecrawled() {
        return isRecrawled;
    }

    public boolean isHeaderDataReady() {
        return isHeaderDataReady;
    }

    public boolean isClusterized() {
        return isClusterized;
    }

    public boolean isFetched() {
        return isFetched;
    }

    public boolean isBbxTagged() {
        return isBbxTagged;
    }

    public boolean isReadyForAfc() {
        return isReadyForAfc;
    }

    public boolean isAfcProcessed() {
        return isAfcProcessed;
    }

    public boolean isAfdProcessed() {
        return isAfdProcessed;
    }
//end fix

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

    public boolean getActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean getHasError() {
        return hasError;
    }

    public void setHasError(boolean hasErr) {
        this.hasError = hasErr;
    }

    public boolean getRecrawled() {
        return isRecrawled;
    }

    public void setRecrawled(boolean recrawled) {
        isRecrawled = recrawled;
    }

    public boolean getHeaderDataReady() {
        return isHeaderDataReady;
    }

    public void setHeaderDataReady(boolean headerDataReady) {
        isHeaderDataReady = headerDataReady;
    }

    public boolean getClusterized() {
        return isClusterized;
    }

    public void setClusterized(boolean clusterized) {
        isClusterized = clusterized;
    }

    public boolean getFetched() {
        return isFetched;
    }

    public void setFetched(boolean fetched) {
        isFetched = fetched;
    }

    public boolean getBbxTagged() {
        return isBbxTagged;
    }

    public void setBbxTagged(boolean bbxTagged) {
        isBbxTagged = bbxTagged;
    }

    public boolean getReadyForAfc() {
        return isReadyForAfc;
    }

    public void setReadyForAfc(boolean readyForAfc) {
        isReadyForAfc = readyForAfc;
    }

    public boolean getAfcProcessed() {
        return isAfcProcessed;
    }

    public void setAfcProcessed(boolean afcProcessed) {
        isAfcProcessed = afcProcessed;
    }

    public boolean getAfdProcessed() {
        return isAfdProcessed;
    }

    public void setAfdProcessed(boolean afdProcessed) {
        isAfdProcessed = afdProcessed;
    }

    public Timestamp getLofCreateTime() {
        return lofCreateTime;
    }

    public void setLofCreateTime(Timestamp lofCreateTime) {
        this.lofCreateTime = lofCreateTime;
    }
}
