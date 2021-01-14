package com.alllemni.appel.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegistreAppelPerSeance {

	private List<Long> idEleves;
	private long idSeance;
}
