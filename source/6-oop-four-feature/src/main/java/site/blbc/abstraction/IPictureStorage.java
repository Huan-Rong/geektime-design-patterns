package site.blbc.abstraction;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public interface IPictureStorage {
    void savePicture(Picture picture);
    Picture getPicture(String pictureId);
    void deletePicture(String pictureId);
    void modifyMetaInfo(String pictureId, PictureMetaInfo pictureMetaInfo);
}
