package com.foodject.naverObj;

import java.io.File;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest
class ObjFileUpLoad {

	@Value("${NaverAccessKey}")
	String accessKey;

	@Value("${NaverSecretKey}")
	String secretKey;

	@Test
	void contextLoads() {

		final String endPoint = "https://kr.object.ncloudstorage.com";
		final String regionName = "kr-standard";

		// S3 client
		final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
		    .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
		    .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
		    .build();

		String bucketName = "foodject";	
		// upload local file
		String objectName = "cssimg/test1.jpg";
		String filePath = "C:/Users/b4a41/Pictures/ma.jpg";

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
