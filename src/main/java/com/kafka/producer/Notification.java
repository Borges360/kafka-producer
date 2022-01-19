package com.kafka.producer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.Serializer;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Notification {

    private String pernumper;
    private String data;
    private String status;
    private List<Integer> channels;

}
