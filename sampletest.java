package com.walmart.assortmentkubie;

@SpringBootApplication
public class AssortmentKubieJob implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AssortmentKubieJob.class);

    public static void main(String[] args) {
        SpringApplication.run(sampletest.class, args);
    }
    @Override
    public void run(String... args) {

        String jobType = "";
        if(args.length > 0){
            jobType = args[0];
        }
        if ("onboarded-update".equalsIgnoreCase(jobType)) {
        logger.info("Hello 1")};
        
        else if("assortment-notification".equalsIgnoreCase(jobType)){
        logger.info("Triggered assortment notifications API.");
        }
    }
    }
