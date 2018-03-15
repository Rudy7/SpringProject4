package com.project4.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class CommonDTO {
	private String befPass,aftPass,nowPass;
}
