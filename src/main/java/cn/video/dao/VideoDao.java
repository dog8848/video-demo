package cn.video.dao;

import cn.video.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VideoDao extends JpaRepository<Video,Long>, JpaSpecificationExecutor<Video> {
}
