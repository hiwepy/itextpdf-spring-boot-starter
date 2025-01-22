package com.itextpdf.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Slf4j
public class ItextpdfPdfApplication_Test1 implements CommandLineRunner {


    @Bean
    public ThreadPoolExecutor dtpToImageExecutor(){
        return new ThreadPoolExecutor(4, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }

    @Bean
    public ThreadPoolExecutor dtpToImageCompressExecutor(){
        return new ThreadPoolExecutor(4, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }
    @Bean
    public ThreadPoolExecutor dtpToImageZipExecutor(){
        return new ThreadPoolExecutor(4, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }
    @Bean
    public ThreadPoolExecutor dtpToPdfExecutor(){
        return new ThreadPoolExecutor(4, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }
    @Bean
    public ThreadPoolExecutor dtpToPdfMergeExecutor(){
        return new ThreadPoolExecutor(4, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ItextpdfPdfApplication_Test1.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
