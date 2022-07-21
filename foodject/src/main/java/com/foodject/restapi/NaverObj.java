package com.foodject.restapi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;


public class NaverObj {
    @Value("${NaverAccessKey}")
    String accessKey;

    @Value("${NaverSecretKey}")
    String secretKey;
	
    public void upLoad(String name, String table, MultipartFile mf) {
    	final String endPoint = "https://kr.object.ncloudstorage.com";
		final String regionName = "kr-standard";

		// S3 client
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
		    .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
		    .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
		    .build();

		String bucketName = "foodject";	



		// upload local file
//		String objectName = "cssimg/test1.jpg";
		String objectName = table + "/" + name;
		String userpath = Paths.get(System.getProperty("user.dir"), "src", "main","resources","static","foodject", table ).toString();
//		String filePath = "C:/Users/b4a41/Pictures/ma.jpg";
		String filePath = userpath+name;

		saveFile(mf, filePath);
		
		try {
		    s3.putObject(bucketName, objectName, new File(filePath));
		    System.out.format("Object %s has been created.\n", objectName);
		} catch (AmazonS3Exception e) {
		    e.printStackTrace();
		} catch(SdkClientException e) {
		    e.printStackTrace();
		}
    
    }

	public static void saveFile(MultipartFile mf, String filePath) {
		byte [] data;
		String img = mf.getOriginalFilename();

		try {
			data = mf.getBytes();
			FileOutputStream fo =
					new FileOutputStream(filePath);
			fo.write(data);
			fo.close();
		} catch (IOException e) {
			
		}
	}
}
