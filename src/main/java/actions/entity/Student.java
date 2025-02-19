package actions.entity;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Table
@Builder
@Getter
@Setter
public class Student {
	@PrimaryKey
	private UUID sid;

	private String name;

}
