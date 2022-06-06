package com.expressage.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "provider-exp")
public interface ExpFeignService {

}
