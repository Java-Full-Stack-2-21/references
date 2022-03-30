package services;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import java.io.File;

public class S3Service {
    private String awsId = "";
    private String secretKey = "";
    private String region = "us-east-2";
    private String bucketName = "krc-s3-bucket";


    public void uploadFile(File file){
        /*prepare our credentials for the next statement*/
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(awsId, secretKey);

        /*create connection with teh s3 client*/
        AmazonS3 s3Client = AmazonS3ClientBuilder
                .standard()
                .withRegion(Regions.fromName(region))
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();

        s3Client.putObject(bucketName, "images/" + file.getName(), file);
    }
}
