package com.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cluster", schema = "rdr")
public class ClusterEntity {
    private String commonTag;
    private String fromAddr;
//    private long messageFilterId;
    private String subject;
    private Integer numMessages;
    private LofStatusEntity lofStatusEntity; //third level
    private long id;


    //third level
    @ManyToOne
    @JoinColumn(name = "message_filter_id")
    public LofStatusEntity getLofStatusEntity() {
        return lofStatusEntity;
    }

    public void setLofStatusEntity(LofStatusEntity lofStatusEntity) {
        this.lofStatusEntity = lofStatusEntity;
    }

//    @Basic
//    @Column(name = "message_filter_id", nullable = false)
//    public long getMessageFilterId() {
//        return messageFilterId;
//    }
//
//    public void setMessageFilterId(long messageFilterId) {
//        this.messageFilterId = messageFilterId;
//    }



    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "common_tag", nullable = true, length = 255)
    public String getCommonTag() {
        return commonTag;
    }

    public void setCommonTag(String commonTag) {
        this.commonTag = commonTag;
    }

    @Basic
    @Column(name = "from_addr", nullable = true, length = 255)
    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }



    @Basic
    @Column(name = "subject", nullable = true, length = 512)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "num_messages", nullable = true)
    public Integer getNumMessages() {
        return numMessages;
    }

    public void setNumMessages(Integer numMessages) {
        this.numMessages = numMessages;
    }


    //    private long id;

    //    @Id
//    @Column(name = "id", nullable = false)
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClusterEntity that = (ClusterEntity) o;
        return  id == that.id &&
                Objects.equals(commonTag, that.commonTag) &&
                Objects.equals(fromAddr, that.fromAddr) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(numMessages, that.numMessages) &&
                Objects.equals(lofStatusEntity, that.lofStatusEntity);
    }

    @Override
    public int hashCode() {

        return Objects.hash(commonTag, fromAddr, subject, numMessages, lofStatusEntity, id);
    }

    @Override
    public String toString() {
        return "ClusterEntity{" +
                "commonTag='" + commonTag + '\'' +
                ", fromAddr='" + fromAddr + '\'' +
                ", subject='" + subject + '\'' +
                ", numMessages=" + numMessages +
                ", lofStatusEntity=" + lofStatusEntity +
                ", id=" + id +
                '}';
    }
}
