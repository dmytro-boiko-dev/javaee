package com.cumulus.dbl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "JOBCARDS")
@Getter
@Setter
public class JobCard {

    @Id
    @Column(name = "JOBCARDKEY")
    private Integer id;

    @Column(name = "NUMBER")
    private Integer jobCardNumber;

    @Column(name = "DATE_OPENED")
    private Date dateOpened;
}
