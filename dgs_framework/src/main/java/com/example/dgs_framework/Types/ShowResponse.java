package com.example.dgs_framework.Types;

import java.util.List;

public class ShowResponse {
    Integer totalItems;
    Integer totalPages;
    Boolean hasNextPage;
    Boolean hasPreviousPage;
    List<Show> items;

    public Integer getTotalItems() {
        return totalItems;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public Boolean getHasPreviousPage() {
        return hasPreviousPage;
    }

    public List<Show> getItems() {
        return items;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        Integer totalItems;
        Integer totalPages;
        Boolean hasNextPage;
        Boolean hasPreviousPage;
        List<Show> items;

        public ShowResponse build() {
            ShowResponse result = new ShowResponse();
            result.totalItems = this.totalItems;
            result.totalPages = this.totalPages;
            result.hasNextPage = this.hasNextPage;
            result.hasPreviousPage = this.hasPreviousPage;
            result.items = this.items;
            return result;
        }

        public Builder setTotalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        public Builder setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public Builder setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }

        public Builder setHasPreviousPage(Boolean hasPreviousPage) {
            this.hasPreviousPage = hasPreviousPage;
            return this;
        }

        public Builder setItems(List<Show> items) {
            this.items = items;
            return this;
        }

    }
}
