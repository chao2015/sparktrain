package chao.spark.kafka;

/**
 * Created by chao on 2018/9/26.
 *
 * Kafka Java API测试
 */
public class KafkaClientApp {

    public static void main(String[] args) {

        new KafkaProducer(KafkaProperties.TOPIC).start();

    }
}
