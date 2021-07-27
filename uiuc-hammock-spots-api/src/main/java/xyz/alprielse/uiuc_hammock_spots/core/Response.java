package xyz.alprielse.uiuc_hammock_spots.core;

import java.util.Optional;

public class Response<E> {
    private Integer status;
    private Boolean success;
    private Optional<E> payload;

    public Response(Integer status, Boolean success, E payload) {
        this.status = status;
        this.success = success;
        this.payload = Optional.of(payload);
    }

    public Integer getStatus() {
        return status;
    }

    public Boolean getSuccess() {
        return success;
    }

    public Optional<E> getPayload() {
        return payload;
    }
}
