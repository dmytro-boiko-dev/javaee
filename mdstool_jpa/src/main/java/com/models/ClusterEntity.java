//package com.models;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cluster", schema = "rdr", catalog = "")
//public class ClusterEntity {
//    private String commonTag;
//    private String fromAddr;
//    private String subject;
//    private Integer numMessages;
//
//    @Basic
//    @Column(name = "common_tag", nullable = true, length = 255)
//    public String getCommonTag() {
//        return commonTag;
//    }
//
//    public void setCommonTag(String commonTag) {
//        this.commonTag = commonTag;
//    }
//
//    @Basic
//    @Column(name = "from_addr", nullable = true, length = 255)
//    public String getFromAddr() {
//        return fromAddr;
//    }
//
//    public void setFromAddr(String fromAddr) {
//        this.fromAddr = fromAddr;
//    }
//
//    @Basic
//    @Column(name = "subject", nullable = true, length = 512)
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    @Basic
//    @Column(name = "num_messages", nullable = true)
//    public Integer getNumMessages() {
//        return numMessages;
//    }
//
//    public void setNumMessages(Integer numMessages) {
//        this.numMessages = numMessages;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ClusterEntity that = (ClusterEntity) o;
//
//        if (commonTag != null ? !commonTag.equals(that.commonTag) : that.commonTag != null) return false;
//        if (fromAddr != null ? !fromAddr.equals(that.fromAddr) : that.fromAddr != null) return false;
//        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
//        if (numMessages != null ? !numMessages.equals(that.numMessages) : that.numMessages != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = commonTag != null ? commonTag.hashCode() : 0;
//        result = 31 * result + (fromAddr != null ? fromAddr.hashCode() : 0);
//        result = 31 * result + (subject != null ? subject.hashCode() : 0);
//        result = 31 * result + (numMessages != null ? numMessages.hashCode() : 0);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "ClusterEntity{" +
//                "commonTag='" + commonTag + '\'' +
//                ", fromAddr='" + fromAddr + '\'' +
//                ", subject='" + subject + '\'' +
//                ", numMessages=" + numMessages +
//                '}';
//    }
//}
