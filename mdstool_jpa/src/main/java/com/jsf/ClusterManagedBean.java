package com.jsf;


import com.models.LofStatusEntity;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ClusterManagedBean implements Serializable {
    private String commonTag;
    private String fromAddr;
    private long messageFilterId;
    private String subject;
    private Integer numMessages;
    private LofStatusEntity lofStatusEntity; //third level

    public LofStatusEntity getLofStatusEntity() {
        return lofStatusEntity;
    }

    public void setLofStatusEntity(LofStatusEntity lofStatusEntity) {
        this.lofStatusEntity = lofStatusEntity;
    }

    public String getCommonTag() {
        return commonTag;
    }

    public void setCommonTag(String commonTag) {
        this.commonTag = commonTag;
    }

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }

    public long getMessageFilterId() {
        return messageFilterId;
    }

    public void setMessageFilterId(long messageFilterId) {
        this.messageFilterId = messageFilterId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getNumMessages() {
        return numMessages;
    }

    public void setNumMessages(Integer numMessages) {
        this.numMessages = numMessages;
    }


}
