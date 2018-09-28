package chao.spark.kafka;

/**
 * Created by chao on 2018/9/26.
 *
 * Kafka Java API测试
 */

public class KafkaClientApp {

    public static void main(String[] args) {

        // 先启动zookeeper，再启动kafka，创建topic，启动consumer
        // 最后运行main函数启动producer
        new KafkaProducer(KafkaProperties.TOPIC).start();

        new KafkaConsumer(KafkaProperties.TOPIC).start();

    }
}
