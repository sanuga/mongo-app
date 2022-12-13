package com.sp.reactive.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "crypto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Crypto {

    @Id
    private String id;

    Instant time;
    String symbol;
    Double buy;
    Double sell;
    Double changeRate;
    Double changePrice;
    Double high;
    Double low;
    Double vol;
    Double volValue;
    Double last;
    Double averagePrice;
    Double takerFeeRate;
    Double makerFeeRate;
    Double takerCoefficient;
    Double makerCoefficient;
    Boolean topValue;

}
