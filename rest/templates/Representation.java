package <%= packageName%>.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class <%=representation%> {

    private Long id;
    private final String content;

}
