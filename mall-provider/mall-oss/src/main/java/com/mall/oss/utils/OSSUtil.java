package com.mall.oss.utils;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
@Slf4j
public class OSSUtil {
    //EndPoint
    // endpoint是访问OSS的域名。如果您已经在OSS的控制台上 创建了Bucket，请在控制台上查看域名。
    // 如果您还没有创建Bucket，endpoint选择请参看文档中心的“开发人员指南 > 基本概念 > 访问域名”，
    // 链接地址是：https://help.aliyun.com/document_detail/oss/user_guide/oss_concept/endpoint.html?spm=5176.docoss/user_guide/endpoint_region
    // endpoint的格式形如“http://oss-cn-hangzhou.aliyuncs.com/”，注意http://后不带bucket名称，
    // 比如“http://bucket-name.oss-cn-hangzhou.aliyuncs.com”，是错误的endpoint，请去掉其中的“bucket-name”。
    private static String endpoint = "https://oss-cn-beijing.aliyuncs.com";

    //AccessKey ID
    // accessKeyId和accessKeySecret是OSS的访问密钥，您可以在控制台上创建和查看，
    // 创建和查看访问密钥的链接地址是：https://ak-console.aliyun.com/#/。
    // 注意：accessKeyId和accessKeySecret前后都没有空格，从控制台复制时请检查并去除多余的空格。
    private static String accessKeyId = "";
    //Access Key Secret
    private static String accessKeySecret = "";
    //Bucket's name
    // Bucket用来管理所存储Object的存储空间，详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
    // Bucket命名规范如下：只能包括小写字母，数字和短横线（-），必须以小写字母或者数字开头，长度必须在3-63字节之间。
    private static String bucketName = "hswe";
    //OSS Folder Name
    private static String folder = "mall/";
    //Bucket's domain name
    private static String key = "https://hswe.oss-cn-beijing.aliyuncs.com/";

    /**
     * 流文件上传
     * @param fileName
     * @param inputStream
     * @return 图片的url
     */
    public static String uploadImageToOSS(String fileName, InputStream inputStream) {
        //创建OSS客户端
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            Date date = new Date();
            SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyyMMddHHmm-");
            String imageTime = yyyyMMddHHmmss.format(date);
            String[] names = fileName.split("[.]");
            //图片名称：时间+UUID
            String name = imageTime+uuid + "." + names[names.length - 1];
            //putObject 上传对象
            // 创建OSSClient实例。
            // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
            PutObjectResult putObjectResult = ossClient.putObject(bucketName,folder + name, inputStream);
            // 设置URL过期时间为100年，默认这里是int型，转换为long型即可
            Date expiration = new Date(System.currentTimeMillis() + 3600L * 1000 * 24 * 365 * 100);
            URL url = ossClient.generatePresignedUrl(bucketName, folder + name, expiration);
            log.info("上传 ETag:" + putObjectResult.getETag());
            ossClient.shutdown();
            return url.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            ossClient.shutdown();
        }
        return null;
    }

    /**
     * 多图上传
     * @param fileNames
     * @param inputStreams
     * @return
     */
    public static String[] uploadImageToOSS(String[] fileNames, InputStream[] inputStreams) {
        //创建OSS客户端
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(
                    Arrays.asList(fileNames));
            ConcurrentLinkedQueue<InputStream> streamConcurrentLinkedQueue = new ConcurrentLinkedQueue<>(
                    Arrays.asList(inputStreams));
            Iterator<InputStream> inputStreamss = streamConcurrentLinkedQueue.iterator();
            ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
            for (Iterator<String> iterator = concurrentLinkedQueue.iterator();
                 iterator.hasNext() && inputStreamss.hasNext(); ) {
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                String[] names = iterator.next().split("[.]");
                String name = uuid + "." + names[names.length - 1];
                ossClient.putObject(new PutObjectRequest(bucketName, folder + name, inputStreamss.next()));
                c.add(key + folder + name);
            }
            return (String[]) c.toArray(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            ossClient.shutdown();
        }
        return null;
    }

    /**
     * 删除图片
     * @param url
     */
    public void deleteImg(String url) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        if (url == null || "".equals(url)) {
            return;
        }
        String[] paths = url.split("[.]");
        /**
         * 文件夹是否存在
         */
        if (!ossClient.doesObjectExist(bucketName, folder)) {
            ossClient.putObject(bucketName, folder, new ByteArrayInputStream(new byte[0]));
        }
        String[] name = paths[paths.length - 2].split("[/]");
        /**
         * 对象是否存在
         */
        if (ossClient
                .doesObjectExist(bucketName,
                        folder + name[name.length - 1] + "." + paths[paths.length - 1])) {
            /**
             * 删除存在对象
             */
            ossClient
                    .deleteObject(bucketName, folder + name[name.length - 1] + "." + paths[paths.length - 1]);
        }
        ossClient.shutdown();
    }
}
