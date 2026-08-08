package com.example;

import software.amazon.awssdk.services.s3.S3Client;

public class App {
    public static void main(String[] args) {
        System.out.println("Simple Maven Java app with outdated AWS SDK dependency.");
        System.out.println("S3 client type: " + S3Client.class.getSimpleName());
        System.out.println("Done!");
    }
}
