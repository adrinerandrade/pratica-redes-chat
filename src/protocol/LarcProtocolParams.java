package protocol;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LarcProtocolParams {

    private List<String> params = new LinkedList<>();

    public void add(String param) {
        this.params.add(param);
    }

    public String format() {
        return params.stream().collect(Collectors.joining(":"));
    }

}
