package com.project4.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class BoardDTO {
	private String bbsSeq,
				   title,
				   content,
				   writedate,
				   viewCount,
				   good,
				   userid;
}
