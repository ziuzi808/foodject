package com.foodject.restapi;


import java.io.File;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class NaverObj {


    @Value("${NaverAccessKey}")
    String accessKey;

    @Value("${NaverSecretKey}")
    String secretKey;

	
	// mf = 실제 파일, name = 파일이름.jpg, table = 폴더명(db테이블명)
    public void upLoad(MultipartFile mf, String filePath, String name, String table  ) {
    	final String endPoint = "https://kr.object.ncloudstorage.com";
		final String regionName = "kr-standard";

		System.out.println("accessKey : " + accessKey);
		System.out.println("secretKey : "+ secretKey);
		// S3 client
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
		    .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
		    .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
		    .build();

		String bucketName = "foodject";	


		System.out.println("filePath : " + filePath);
		// upload local file
//		String objectName = "cssimg/test1.jpg";
		String objectName = table + "/" + name;
		// String userpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","foodject", table ).toString();
//		String filePath = "C:/Users/b4a41/Pictures/ma.jpg";
		// String filePath = userpath+name;

		
		try {
		    s3.putObject(bucketName, objectName, new File(filePath));
		    System.out.format("Object %s has been created.\n", objectName);
		} catch (AmazonS3Exception e) {
		    e.printStackTrace();
		} catch(SdkClientException e) {
		    e.printStackTrace();
		}
    
    }

}
