package com.urlshorter.site.workwithkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    AuditRecordRepository auditRecordRepository;

    @KafkaListener(topics = "url-shorter-audit", groupId = "url-shorter-audit-consumer-group")
    public void consume(KafkaMessage kafkaMessage){
        AuditRecord auditRecord = new AuditRecord(
                kafkaMessage.getLogin(),
                kafkaMessage.getAction(),
                kafkaMessage.getObject()
        );

        auditRecordRepository.save(auditRecord);

        System.out.println(kafkaMessage);
    }
}
