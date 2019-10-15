package protocol;

import java.util.function.Consumer;
import java.util.function.Function;

public class Response<T> {

    private T output = null;
    private Exception error = null;

    public Response(T output) {
        this.output = output;
    }

    public Response(Exception ex) {
        this.error = ex;
    }

    public <R> Response<R> map(Function<T, R> mapper) {
        return this.error != null ?
            new Response<>(this.error) :
            new Response<>(mapper.apply(output));
    }

    public Response<T> ifSuccess(Consumer<T> consumer) {
        if (this.output != null) {
            consumer.accept(this.output);
        }
        return this;
    }

    public Response<T> ifError(Consumer<Exception> consumer) {
        if (this.error != null) {
            consumer.accept(this.error);
        }
        return this;
    }

}
