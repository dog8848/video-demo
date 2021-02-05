package cn.video.domain;

import javax.persistence.*;

@Entity
@Table(name = "video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "save_path")
    private String savePath;
    @Column(name = "quality_name")
    private String qualityName;
    @Column(name = "sequence")
    private Integer sequence;
    @Column(name = "danmaku_id")
    private String danmakuId;

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", savePath='" + savePath + '\'' +
                ", qualityName='" + qualityName + '\'' +
                ", sequence=" + sequence +
                ", danmakuId='" + danmakuId + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getDanmakuId() {
        return danmakuId;
    }

    public void setDanmakuId(String danmakuId) {
        this.danmakuId = danmakuId;
    }
}
