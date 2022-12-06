package com.cdc.impl.kafka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkDemoRepository extends JpaRepository<Bookmark_demo,Long> {
}
