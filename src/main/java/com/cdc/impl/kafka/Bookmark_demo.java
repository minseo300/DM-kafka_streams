package com.cdc.impl.kafka;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name="bookmark_demo")
public class Bookmark_demo {

    @Id
    private Long id;

    @Column(name="member_id")
    private Long memberId;

    @Column(name="post_id")
    private Long postId;
}
