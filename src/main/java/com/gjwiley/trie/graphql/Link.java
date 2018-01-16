package com.gjwiley.trie.graphql;

public class Link {

    private final String id;
    private final String url;
    private final String description;

    public Link(final String id, final String url, final String description) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public String getDescription() {
        return this.description;
    }
}
