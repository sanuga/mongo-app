package com.sp.reactive.repository;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("crypto")
@Data
public class CryptoData {
  Integer code;
  Crypto data;
}
