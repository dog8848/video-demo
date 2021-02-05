package cn.video;

import cn.video.dao.CustomerDao;
import cn.video.dao.LinkManDao;
import cn.video.dao.VideoDao;
import cn.video.domain.Customer;
import cn.video.domain.LinkMan;
import cn.video.domain.Video;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.springframework.test.context.event.annotation.PrepareTestInstance;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@SpringBootTest
class VideoApplicationTests {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private LinkManDao linkManDao;

    @Autowired
    private VideoDao videoDao;



    @Test
    @Transactional
    void contextLoads() {
        Video video = new Video();
        video.setDisplayName("a video");
        video.setQualityName("1080P 高清");
        video.setSavePath("/video/123/888/video.mp4");

        videoDao.save(video);

        List<Video> videos = videoDao.findAll();
        videos.forEach(video1 -> System.out.println(video1));

    }

    @Test
    @Transactional
    void test(){
        Customer customer = customerDao.getOne(2L);
        Set<LinkMan> linkMans = customer.getLinkMans();
        linkMans.forEach(linkMan-> System.out.println(linkMan));
    }

}
