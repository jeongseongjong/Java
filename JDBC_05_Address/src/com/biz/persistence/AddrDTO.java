package com.biz.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class AddrDTO {

	private long A_id;
	private String A_name;
	private String A_tel;
	private String A_addr;
	private String A_chain;
	
}
