package ac.kr.korea.cdm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServiceServerDto {
    private int id;
    private String ipAddr;
    private String institute;
}
