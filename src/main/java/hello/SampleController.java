package hello;

import org.apache.spark.SparkContext;
import org.infinispan.commons.util.InfinispanCollections;
import org.quartz.Scheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SparkContext sparkContext; // From hqmavenprojms BOM, optional
        Scheduler scheduler; // From hqmavenprojms BOM, common mendatory dependency
        InfinispanCollections infinispanCollections; // From hqmavenprojms BOM through Hibernate BOM
        SpringApplication.run(SampleController.class, args);
        System.out.println(SparkContext.class);
        System.out.println(Scheduler.class);
        System.out.println(InfinispanCollections.class);
    }
}